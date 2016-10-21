package com.sundsoft.service.dtExchange.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.dtExchange.DtMapper;
import com.sundsoft.model.db.dt.UtbDkDkjdTempVo;
import com.sundsoft.model.db.dt.UtbDkKfsV5TempVo;
import com.sundsoft.model.db.dt.UtbDkLpxmV5TempVo;
import com.sundsoft.model.db.dt.UtbDkLpxmmxV5TempVo;
import com.sundsoft.model.db.dt.UtbDkMarginDetialsVo;
import com.sundsoft.model.db.dt.UtbDkMarginMainVo;
import com.sundsoft.model.db.dt.UtbGb101TempVo;
import com.sundsoft.model.db.dt.UtbGb102TempVo;
import com.sundsoft.model.db.dt.UtbGb201TempVo;
import com.sundsoft.model.db.dt.UtbGb202TempVo;
import com.sundsoft.model.db.dt.UtbGb202extTempVo;
import com.sundsoft.model.db.dt.UtbGb203TempVo;
import com.sundsoft.model.db.dt.UtbGb204TempVo;
import com.sundsoft.model.db.dt.UtbGb301TempVo;
import com.sundsoft.model.db.dt.UtbGb302TempVo;
import com.sundsoft.model.db.dt.UtbGb303TempVo;
import com.sundsoft.model.db.dt.UtbGb304TempVo;
import com.sundsoft.model.db.dt.UtbGb305TempVo;
import com.sundsoft.model.db.dt.UtbGb306TempVo;
import com.sundsoft.model.in.dt.VisitControl;
import com.sundsoft.service.dtExchange.IDtService;
import com.sundsoft.utils.BeanToMapUtil;

@Service
public class DtServiceImpl implements IDtService {

	@Autowired
	private DtMapper dtMapper;

	private static final Logger log = LogManager.getLogger(DtServiceImpl.class);

	@Override
	public void Insert_GB101_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb101TempVo> items = new ArrayList<UtbGb101TempVo>();
		UtbGb101TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb101TempVo) BeanToMapUtil.convertMap(UtbGb101TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}

			dtMapper.insertUtbGb101Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB101");
	}

	@Override
	public void Insert_GB102_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb102TempVo> items = new ArrayList<UtbGb102TempVo>();
		UtbGb102TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb102TempVo) BeanToMapUtil.convertMap(UtbGb102TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}

			dtMapper.insertUtbGb102Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB102");
	}

	@Override
	public void Insert_GB201_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb201TempVo> items = new ArrayList<UtbGb201TempVo>();
		UtbGb201TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb201TempVo) BeanToMapUtil.convertMap(UtbGb201TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}

			dtMapper.insertUtbGb201Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB201");
	}

	@Override
	public void Insert_GB202_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb202TempVo> items = new ArrayList<UtbGb202TempVo>();
		UtbGb202TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb202TempVo) BeanToMapUtil.convertMap(UtbGb202TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb202Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB202");
	}

	@Override
	public void Insert_GB203_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb203TempVo> items = new ArrayList<UtbGb203TempVo>();
		UtbGb203TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb203TempVo) BeanToMapUtil.convertMap(UtbGb203TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb203Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB203");
	}

	@Override
	public void Insert_GB204_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb204TempVo> items = new ArrayList<UtbGb204TempVo>();
		UtbGb204TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb204TempVo) BeanToMapUtil.convertMap(UtbGb204TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb204Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB204");
	}

	@Override
	public void Insert_GB301_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb301TempVo> items = new ArrayList<UtbGb301TempVo>();
		UtbGb301TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb301TempVo) BeanToMapUtil.convertMap(UtbGb301TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb301Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB301");
	}

	@Override
	public void Insert_GB302_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb302TempVo> items = new ArrayList<UtbGb302TempVo>();
		UtbGb302TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb302TempVo) BeanToMapUtil.convertMap(UtbGb302TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb302Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB302");
	}

	@Override
	public void Insert_GB303_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb303TempVo> items = new ArrayList<UtbGb303TempVo>();
		UtbGb303TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb303TempVo) BeanToMapUtil.convertMap(UtbGb303TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb303Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB303");
	}

	@Override
	public void Insert_GB304_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb304TempVo> items = new ArrayList<UtbGb304TempVo>();
		UtbGb304TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb304TempVo) BeanToMapUtil.convertMap(UtbGb304TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb304Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB304");
	}

	@Override
	public void Insert_GB305_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb305TempVo> items = new ArrayList<UtbGb305TempVo>();
		UtbGb305TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb305TempVo) BeanToMapUtil.convertMap(UtbGb305TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb305Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB305");
	}

	@Override
	public void Insert_GB306_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb306TempVo> items = new ArrayList<UtbGb306TempVo>();
		UtbGb306TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb306TempVo) BeanToMapUtil.convertMap(UtbGb306TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb306Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB306");
	}

	@Override
	public void Insert_GB202EXT_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbGb202extTempVo> items = new ArrayList<UtbGb202extTempVo>();
		UtbGb202extTempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbGb202extTempVo) BeanToMapUtil.convertMap(UtbGb202extTempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbGb202extTemp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_GB_TEMP", "UTB202EXT");
	}

	@Override
	public void Insert_DK_LPXM_V5_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbDkLpxmV5TempVo> items = new ArrayList<UtbDkLpxmV5TempVo>();
		UtbDkLpxmV5TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbDkLpxmV5TempVo) BeanToMapUtil.convertMap(UtbDkLpxmV5TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbDkLpxmV5Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_KFS_LP_TEMP", "LPXM_V5");
	}

	@Override
	public void Insert_DK_LPXMMX_V5_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbDkLpxmmxV5TempVo> items = new ArrayList<UtbDkLpxmmxV5TempVo>();
		UtbDkLpxmmxV5TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbDkLpxmmxV5TempVo) BeanToMapUtil.convertMap(UtbDkLpxmmxV5TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbDkLpxmmxV5Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_KFS_LP_TEMP", "LPXMMX_V5");
	}

	@Override
	public void Insert_DK_KFS_V5_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbDkKfsV5TempVo> items = new ArrayList<UtbDkKfsV5TempVo>();
		UtbDkKfsV5TempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbDkKfsV5TempVo) BeanToMapUtil.convertMap(UtbDkKfsV5TempVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbDkKfsV5Temp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_KFS_LP_TEMP", "KFS_V5");
	}

	@Override
	public void Insert_DK_DKJD_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbDkDkjdTempVo> items = new ArrayList<UtbDkDkjdTempVo>();
		UtbDkDkjdTempVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbDkDkjdTempVo) BeanToMapUtil.convertMap(UtbDkDkjdTempVo.class, data);
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbDkDkjdTemp(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_DK_TEMP", "DKJD");
	}

	@Override
	public void Insert_DK_MARGIN_MAIN_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbDkMarginMainVo> items = new ArrayList<UtbDkMarginMainVo>();
		UtbDkMarginMainVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbDkMarginMainVo) BeanToMapUtil.convertMap(UtbDkMarginMainVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbDkMarginMain(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_DK_TEMP", "MARGIN_MAIN");
	}

	@Override
	public void Insert_DK_MARGIN_DETIALS_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException {
		List<UtbDkMarginDetialsVo> items = new ArrayList<UtbDkMarginDetialsVo>();
		UtbDkMarginDetialsVo vo = null;
		try {
			for (Map<String, Object> data : p_Data) {
				vo = (UtbDkMarginDetialsVo) BeanToMapUtil.convertMap(UtbDkMarginDetialsVo.class, data);
				vo.setXzqy(v_Control.getGjjzxbm());
				vo.setCzlx(v_Control.getCzlx().hashCode());
				vo.setSftb(0);
				items.add(vo);
			}
			dtMapper.insertUtbDkMarginDetials(items);
		}
		catch (Exception e) {
			log.error("写入临时表错误:", e);
			throw new ServiceException(ServiceErrorCode.INSERT_TEMP_ERROR, getTableNameByPojo(vo));
		}
		ExcuteProcedure(v_Control, "PKG_DT_DK_TEMP", "MARGIN_DETIALS");
	}

	private void ExcuteProcedure(VisitControl v_Control, String PKGName, String proSimpleName) throws ServiceException {
		String call = null;
		StringBuilder sb = new StringBuilder();
		switch (v_Control.getCzlx()) {
		case Insert:
			call = String.format("%s.Upr_DT_%s_Insert", PKGName, proSimpleName);
			break;
		case Update:
			call = String.format("%s.Upr_DT_%s_Update", PKGName, proSimpleName);
			break;
		case Delete:
			call = String.format("%s.Upr_DT_%s_Delete", PKGName, proSimpleName);
			break;
		default:
			throw new ServiceException(ServiceErrorCode.SYSTEM_ERROR, "不支持这种类型操作" + v_Control.getCzlx());
		}
		sb.append("{ call ").append(call).append("(");
		sb.append("#{Out_Msg,mode=OUT,jdbcType=VARCHAR},");
		sb.append("#{Out_ECode,mode=OUT,jdbcType=VARCHAR}");
		sb.append(")").append(" }");
		log.debug("excute procedure : " + sb.toString());
		try {
			Map<String, String> params = new HashMap<String, String>();
			params.put("sql", sb.toString());
			dtMapper.ExcuteProcedure(params);
			if (StringUtils.isNotBlank((params.get("Out_ECode"))) || StringUtils.isNotBlank((params.get("Out_Msg")))) {
				log.debug("执行存储过程结果:" + params.get("Out_ECode") + "," + params.get("Out_Msg"));
			}
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, call);
		}
	}
	
	private String getTableNameByPojo(Object vo){
		String className = vo.getClass().getSimpleName();
		String str = className.substring(0, className.length()-2);
		final int size = str.length();
        final char[] newChars = new char[100];
        int count = 0;
        int prevNumIdx = 0;
		for (int i = 0; i < size; i++) {
			char actualChar = str.charAt(i);
			if (i == 0) {
				newChars[count++] = actualChar;
				continue;
			}
			if (actualChar <= 90 && actualChar >= 65) {
				newChars[count++] = '_';
			}
			else if (actualChar >= 48 && actualChar <= 57) {
				if ((i - prevNumIdx) > 1) {
					newChars[count++] = '_';
				}
				prevNumIdx = i;
			}
			else {
				actualChar = (char) (actualChar - 32);
			}
			newChars[count++] = actualChar;
		}
        return new String (newChars).trim();
	}

	// private boolean TableAddColumns(VisitControl v_Control, List<Map<String,
	// Object>> p_Data, String targetTable) {
	// try {
	// List<String> sqls = new ArrayList<String>();
	// List<String> colNames = dtMapper.getColNames(targetTable);
	// if(colNames==null||colNames.size()==0){
	// throw new Exception(targetTable+"表名错误");
	// }
	// StringBuilder sql = new StringBuilder();
	// StringBuilder keys = new StringBuilder();
	// StringBuilder values = new StringBuilder();
	// String key = null;
	// String value = null;
	// for(Map<String, Object> data:p_Data){
	// for(String colName:colNames){
	// keys.append(colName).append(",");
	// values.append(data.get(colName)).append(",");
	// }
	// key = keys.substring(0, keys.lastIndexOf(","));
	// value = values.substring(0, values.lastIndexOf(","));
	// sql.append("insert into ").append(targetTable).append("
	// (").append(key).append(" ) values (").append(value).append(" )");
	// sqls.add(sql.toString());
	// }
	// for(String sqlStr:sqls){
	// dtMapper.insertTemp(sqlStr);
	// }
	// return true;
	// }
	// catch (Exception e) {
	// log.error(e.getMessage(), e);
	// return false;
	// }
	// }

}
