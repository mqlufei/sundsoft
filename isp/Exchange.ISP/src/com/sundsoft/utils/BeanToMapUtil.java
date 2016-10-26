package com.sundsoft.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;

import net.sf.json.JSONObject;

public class BeanToMapUtil {

	public static Object convertJson(Class type, JSONObject json) throws ServiceException {
		try {
			Object obj = type.newInstance(); // 创建 JavaBean 对象
			Field[] fields = type.getDeclaredFields();
			String propertyName = null;
			// 给 JavaBean 对象的属性赋值
			for (Field field : fields) {
				propertyName = field.getName();
				if (json.containsKey(propertyName.toUpperCase())) {
					// 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
					Object value = json.get(propertyName.toUpperCase());
					BeanUtils.setProperty(obj, propertyName, value);
				}
				else {
					throw new ServiceException(ServiceErrorCode.PARAM_DEFECT_EXCEPTION, propertyName.toUpperCase());
				}
			}
			return obj;
		}
		catch (InstantiationException e) {
			e.printStackTrace();
			throw new ServiceException(ServiceErrorCode.JSON_PRASE_EXCEPTION, e.getMessage());
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new ServiceException(ServiceErrorCode.JSON_PRASE_EXCEPTION, e.getMessage());
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new ServiceException(ServiceErrorCode.JSON_PRASE_EXCEPTION, e.getMessage());
		}
		catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new ServiceException(ServiceErrorCode.JSON_PRASE_EXCEPTION, e.getMessage());
		}

	}

	/**
	 * 将一个 Map 对象转化为一个 JavaBean
	 * @param type 要转化的类型
	 * @param map 包含属性值的 map
	 * @return 转化出来的 JavaBean 对象
	 * @throws IntrospectionException
	 *             如果分析类属性失败
	 * @throws IllegalAccessException
	 *             如果实例化 JavaBean 失败
	 * @throws InstantiationException
	 *             如果实例化 JavaBean 失败
	 * @throws InvocationTargetException
	 *             如果调用属性的 setter 方法失败
	 */
	public static Object convertMap(Class type, Map map)
			throws IntrospectionException, IllegalAccessException, InstantiationException, InvocationTargetException {
		BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性
		Object obj = type.newInstance(); // 创建 JavaBean 对象

		// 给 JavaBean 对象的属性赋值
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (int i = 0; i < propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();

			if (map.containsKey(propertyName)) {
				// 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
				Object value = map.get(propertyName);

				Object[] args = new Object[1];
				args[0] = value;

				descriptor.getWriteMethod().invoke(obj, args);
			}
		}
		return obj;
	}

	/**
	 * 将一个 JavaBean 对象转化为一个  Map
	 * @param bean 要转化的JavaBean 对象
	 * @return 转化出来的  Map 对象
	 * @throws IntrospectionException 如果分析类属性失败
	 * @throws IllegalAccessException 如果实例化 JavaBean 失败
	 * @throws InvocationTargetException 如果调用属性的 setter 方法失败
	 */
	public static Map<String,Object> convertBean(Object bean) throws IntrospectionException, IllegalAccessException, InvocationTargetException {
		Class type = bean.getClass();
		Map<String,Object>  returnMap = new HashMap<String,Object> ();
		BeanInfo beanInfo = Introspector.getBeanInfo(type);

		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (int i = 0; i < propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();
			if (!propertyName.equals("class")) {
				Method readMethod = descriptor.getReadMethod();
				Object result = readMethod.invoke(bean, new Object[0]);
				if (result != null) {
					returnMap.put(propertyName, result);
				}
				else {
					returnMap.put(propertyName, "");
				}
			}
		}
		return returnMap;
	}

	public static void main(String[] args) {

	}
}
