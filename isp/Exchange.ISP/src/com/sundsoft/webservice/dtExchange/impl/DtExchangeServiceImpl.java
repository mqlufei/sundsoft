package com.sundsoft.webservice.dtExchange.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.dt.TableParam;
import com.sundsoft.model.in.dt.VisitControl;
import com.sundsoft.service.dtExchange.IDtService;
import com.sundsoft.utils.ResponseUtil;
import com.sundsoft.webservice.dtExchange.IDtExchangeService;


public class DtExchangeServiceImpl implements IDtExchangeService {
	
	private static final Logger log = LogManager.getLogger(DtExchangeServiceImpl.class);
	
	@Autowired
	private IDtService dtService;
	
	private ArrayList<HashMap<String, Object>> p_Data;

	@Override
	public String DT_GB101(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB101没有数据，请核实");
		}
		try {
			dtService.Insert_GB101_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB102(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB102没有数据，请核实");
		}
		try {
			dtService.Insert_GB102_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB201(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB201没有数据，请核实");
		}
		try {
			dtService.Insert_GB201_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB202(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB202没有数据，请核实");
		}
		try {
			dtService.Insert_GB202_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB203(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB203没有数据，请核实");
		}
		try {
			dtService.Insert_GB203_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB204(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB204没有数据，请核实");
		}
		try {
			dtService.Insert_GB204_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB301(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB301没有数据，请核实");
		}
		try {
			dtService.Insert_GB301_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB302(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB302没有数据，请核实");
		}
		try {
			dtService.Insert_GB302_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB303(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB303没有数据，请核实");
		}
		try {
			dtService.Insert_GB303_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB304(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB304没有数据，请核实");
		}
		try {
			dtService.Insert_GB304_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB305(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB305没有数据，请核实");
		}
		try {
			dtService.Insert_GB305_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB306(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB306没有数据，请核实");
		}
		try {
			dtService.Insert_GB306_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_DK_LPXM_V5(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表DK_LPXM_V5没有数据，请核实");
		}
		try {
			dtService.Insert_DK_LPXM_V5_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_DK_LPXMMX_V5(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表DK_LPXMMX_V5没有数据，请核实");
		}
		try {
			dtService.Insert_DK_LPXMMX_V5_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_DK_KFS_V5(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表DK_KFS_V5没有数据，请核实");
		}
		try {
			dtService.Insert_DK_KFS_V5_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_DK_DKJD_V5(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表DK_DKJD_V5没有数据，请核实");
		}
		try {
			dtService.Insert_DK_DKJD_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_GB202EXT(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表GB202EXT没有数据，请核实");
		}
		try {
			dtService.Insert_GB202EXT_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_MARGIN_MAIN(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表DK_MARGIN_MAIN没有数据，请核实");
		}
		try {
			dtService.Insert_DK_MARGIN_MAIN_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}

	@Override
	public String DT_MARGIN_DETIALS(VisitControl v_Control, TableParam tableParam) {
		p_Data = tableParam.getP_Data();
		if(p_Data==null||p_Data.size()==0){
			return ResponseUtil.err("E101", "服务端检测出，DataSet中表DK_MARGIN_DETIALS没有数据，请核实");
		}
		try {
			dtService.Insert_DK_MARGIN_DETIALS_temp(v_Control, p_Data);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrorCode().getErrorCode(), e.getMessage());
		}
		return ResponseUtil.succ();
	}
}
