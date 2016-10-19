package com.sundsoft.service.dtExchange.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.sundsoft.model.in.VisitControl;
import com.sundsoft.service.dtExchange.IDtService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class DtServiceImpl implements IDtService {

	@Autowired
	private DtMapper dtMapper;

	private static final Logger log = LogManager.getLogger(DtServiceImpl.class);

	@Override
	public void Insert_GB101_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb101TempVo> items = new ArrayList<UtbGb101TempVo>();
		UtbGb101TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb101TempVo) BeanToMapUtil.convertMap(UtbGb101TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb101Temp(items);
	}

	@Override
	public void Insert_GB102_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb102TempVo> items = new ArrayList<UtbGb102TempVo>();
		UtbGb102TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb102TempVo) BeanToMapUtil.convertMap(UtbGb102TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb102Temp(items);
	}

	@Override
	public void Insert_GB201_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb201TempVo> items = new ArrayList<UtbGb201TempVo>();
		UtbGb201TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb201TempVo) BeanToMapUtil.convertMap(UtbGb201TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb201Temp(items);
	}

	@Override
	public void Insert_GB202_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb202TempVo> items = new ArrayList<UtbGb202TempVo>();
		UtbGb202TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb202TempVo) BeanToMapUtil.convertMap(UtbGb202TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb202Temp(items);
	}

	@Override
	public void Insert_GB203_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb203TempVo> items = new ArrayList<UtbGb203TempVo>();
		UtbGb203TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb203TempVo) BeanToMapUtil.convertMap(UtbGb203TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb203Temp(items);
	}

	@Override
	public void Insert_GB204_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb204TempVo> items = new ArrayList<UtbGb204TempVo>();
		UtbGb204TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb204TempVo) BeanToMapUtil.convertMap(UtbGb204TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb204Temp(items);
	}

	@Override
	public void Insert_GB301_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb301TempVo> items = new ArrayList<UtbGb301TempVo>();
		UtbGb301TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb301TempVo) BeanToMapUtil.convertMap(UtbGb301TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb301Temp(items);
	}

	@Override
	public void Insert_GB302_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb302TempVo> items = new ArrayList<UtbGb302TempVo>();
		UtbGb302TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb302TempVo) BeanToMapUtil.convertMap(UtbGb302TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb302Temp(items);
	}

	@Override
	public void Insert_GB303_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb303TempVo> items = new ArrayList<UtbGb303TempVo>();
		UtbGb303TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb303TempVo) BeanToMapUtil.convertMap(UtbGb303TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb303Temp(items);
	}

	@Override
	public void Insert_GB304_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb304TempVo> items = new ArrayList<UtbGb304TempVo>();
		UtbGb304TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb304TempVo) BeanToMapUtil.convertMap(UtbGb304TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb304Temp(items);
	}

	@Override
	public void Insert_GB305_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb305TempVo> items = new ArrayList<UtbGb305TempVo>();
		UtbGb305TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb305TempVo) BeanToMapUtil.convertMap(UtbGb305TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb305Temp(items);
	}

	@Override
	public void Insert_GB306_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb306TempVo> items = new ArrayList<UtbGb306TempVo>();
		UtbGb306TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb306TempVo) BeanToMapUtil.convertMap(UtbGb306TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb306Temp(items);
	}

	@Override
	public void Insert_GB202EXT_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbGb202extTempVo> items = new ArrayList<UtbGb202extTempVo>();
		UtbGb202extTempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbGb202extTempVo) BeanToMapUtil.convertMap(UtbGb202extTempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbGb202extTemp(items);
	}

	@Override
	public void Insert_DK_LPXM_V5_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbDkLpxmV5TempVo> items = new ArrayList<UtbDkLpxmV5TempVo>();
		UtbDkLpxmV5TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbDkLpxmV5TempVo) BeanToMapUtil.convertMap(UtbDkLpxmV5TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbDkLpxmV5Temp(items);
	}

	@Override
	public void Insert_DK_LPXMMX_V5_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbDkLpxmmxV5TempVo> items = new ArrayList<UtbDkLpxmmxV5TempVo>();
		UtbDkLpxmmxV5TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbDkLpxmmxV5TempVo) BeanToMapUtil.convertMap(UtbDkLpxmmxV5TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbDkLpxmmxV5Temp(items);
	}

	@Override
	public void Insert_DK_KFS_V5_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbDkKfsV5TempVo> items = new ArrayList<UtbDkKfsV5TempVo>();
		UtbDkKfsV5TempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbDkKfsV5TempVo) BeanToMapUtil.convertMap(UtbDkKfsV5TempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbDkKfsV5Temp(items);
	}

	@Override
	public void Insert_DK_DKJD_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		List<UtbDkDkjdTempVo> items = new ArrayList<UtbDkDkjdTempVo>();
		UtbDkDkjdTempVo vo = null;
		for (Map<String, Object> data : p_Data) {
			vo = (UtbDkDkjdTempVo) BeanToMapUtil.convertMap(UtbDkDkjdTempVo.class, data);
			items.add(vo);
		}
		dtMapper.insertUtbDkDkjdTemp(items);
	}

	@Override
	public void Insert_DK_MARGIN_MAIN_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		 List<UtbDkMarginMainVo> items = new ArrayList<UtbDkMarginMainVo>();
		 UtbDkMarginMainVo vo = null;
		 for(Map<String, Object> data:p_Data){
		 vo = (UtbDkMarginMainVo) BeanToMapUtil.convertMap(UtbDkMarginMainVo.class, data);
		 items.add(vo);
		 }
		 dtMapper.insertUtbDkMarginMain(items);
	}

	@Override
	public void Insert_DK_MARGIN_DETIALS_temp(VisitControl v_Control, List<Map<String, Object>> p_Data) throws Exception {
		 List<UtbDkMarginDetialsVo> items = new ArrayList<UtbDkMarginDetialsVo>();
		 UtbDkMarginDetialsVo vo = null;
		 for(Map<String, Object> data:p_Data){
		 vo = (UtbDkMarginDetialsVo) BeanToMapUtil.convertMap(UtbDkMarginDetialsVo.class, data);
		 items.add(vo);
		 }
		 dtMapper.insertUtbDkMarginDetials(items);
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
