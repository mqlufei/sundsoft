package com.sundsoft.mapper.dtExchange;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

@Repository
@Transactional
public interface DtMapper {

	public void insertUtbDkDkjdTemp(List<UtbDkDkjdTempVo> items) throws Exception;

	public void insertUtbDkKfsV5Temp(List<UtbDkKfsV5TempVo> items) throws Exception;

	public void insertUtbDkLpxmmxV5Temp(List<UtbDkLpxmmxV5TempVo> items) throws Exception;

	public void insertUtbDkLpxmV5Temp(List<UtbDkLpxmV5TempVo> items) throws Exception;

	public void insertUtbGb101Temp(List<UtbGb101TempVo> items) throws Exception;

	public void insertUtbGb102Temp(List<UtbGb102TempVo> items) throws Exception;

	public void insertUtbGb201Temp(List<UtbGb201TempVo> items) throws Exception;

	public void insertUtbGb202extTemp(List<UtbGb202extTempVo> items) throws Exception;

	public void insertUtbGb202Temp(List<UtbGb202TempVo> items) throws Exception;

	public void insertUtbGb203Temp(List<UtbGb203TempVo> items) throws Exception;

	public void insertUtbGb204Temp(List<UtbGb204TempVo> items) throws Exception;

	public void insertUtbGb301Temp(List<UtbGb301TempVo> items) throws Exception;

	public void insertUtbGb302Temp(List<UtbGb302TempVo> items) throws Exception;

	public void insertUtbGb303Temp(List<UtbGb303TempVo> items) throws Exception;

	public void insertUtbGb304Temp(List<UtbGb304TempVo> items) throws Exception;

	public void insertUtbGb305Temp(List<UtbGb305TempVo> items) throws Exception;

	public void insertUtbGb306Temp(List<UtbGb306TempVo> items) throws Exception;
	
	public void insertUtbDkMarginDetials(List<UtbDkMarginDetialsVo> items) throws Exception;

	public void insertUtbDkMarginMain(List<UtbDkMarginMainVo> items) throws Exception;

}
