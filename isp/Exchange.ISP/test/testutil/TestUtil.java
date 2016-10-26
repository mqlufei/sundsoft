package testutil;

import org.junit.Test;

import com.sundsoft.model.db.dt.UtbDkDkjdTempVo;
import com.sundsoft.utils.BeanToMapUtil;
import com.sundsoft.utils.ResponseUtil;

import model.User;
import net.sf.json.JSONObject;

public class TestUtil {
	
	
	
	@Test
	public void testConvertJson(){
		String str = "{\"NAME\":\"ZHANGSAN\",\"AGE\":\"25\"}";
		JSONObject json = JSONObject.fromObject(str);
		User user = (User)BeanToMapUtil.convertJson(User.class, json);
		System.out.println(user.toString());
	}
}
