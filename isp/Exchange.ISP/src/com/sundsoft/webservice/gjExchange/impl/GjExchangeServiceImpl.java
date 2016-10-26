package com.sundsoft.webservice.gjExchange.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.docgetdocbyid.GetDocByID_AceeptModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_YyblModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_ZxshModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_ZxshModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_ZxshModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_ZxshModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_AceeptModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetlistModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_YyblModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_ZxshModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_AceeptModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetlistModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_YyblModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_ZxshModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetfcqflistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetgrzhsllistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjaymxModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjzjbyidModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjzlbyidModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetjcjstzlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_HjaceeptzlModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortofcqfModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortogrzhslModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortojcjstzModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_YyblModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_ZxshModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_AceeptModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_GetlistModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_YyblModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_ZxshModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_YyblModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_ZxshModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_AceeptModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetbyidModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetlistModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_YyblModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_ZxshModel;
import com.sundsoft.model.in.gj.slgjtg.TG_AceeptModel;
import com.sundsoft.model.in.gj.slgjtg.TG_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjtg.TG_GetlistModel;
import com.sundsoft.model.in.gj.slgjtg.TG_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjtg.TG_YyblModel;
import com.sundsoft.model.in.gj.slgjtg.TG_ZxshModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_AceeptModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetlistModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetzxbyidModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_YyblModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_ZxshModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_AceeptModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetlistModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_YyblModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_BjService;
import com.sundsoft.service.gjExchange.IGj_DWJCDJService;
import com.sundsoft.service.gjExchange.IGj_DWJCDJXXBGService;
import com.sundsoft.service.gjExchange.IGj_DWJCDJZXService;
import com.sundsoft.service.gjExchange.IGj_DocService;
import com.sundsoft.service.gjExchange.IGj_GJJYDZYService;
import com.sundsoft.service.gjExchange.IGj_GRZHTCZYService;
import com.sundsoft.service.gjExchange.IGj_HjService;
import com.sundsoft.service.gjExchange.IGj_JCBLTZService;
import com.sundsoft.service.gjExchange.IGj_JchjService;
import com.sundsoft.service.gjExchange.IGj_LHJYRYJCService;
import com.sundsoft.service.gjExchange.IGj_TgService;
import com.sundsoft.service.gjExchange.IGj_YWSLService;
import com.sundsoft.service.gjExchange.IGj_ZGXXBGService;
import com.sundsoft.utils.BeanToMapUtil;
import com.sundsoft.utils.ResponseUtil;
import com.sundsoft.webservice.gjExchange.IGjExchangeService;

import net.sf.json.JSONObject;

public class GjExchangeServiceImpl implements IGjExchangeService {

	private JSONObject jsonObj = null;

	@Autowired
	private IGj_HjService hjService;

	@Autowired
	private IGj_BjService bjService;

	@Autowired
	private IGj_DWJCDJXXBGService dwjcdjxxbgService;

	@Autowired
	private IGj_DWJCDJZXService dwjcdjzxService;

	@Autowired
	private IGj_ZGXXBGService zgxxbgService;
	
	@Autowired
	private IGj_GRZHTCZYService grzhtczyService;
	
	@Autowired
	private IGj_GJJYDZYService gjjydzyService;
	
	@Autowired
	private IGj_TgService tgService;
	
	@Autowired
	private IGj_JchjService jchjService;
	
	@Autowired
	private IGj_LHJYRYJCService lhjyryjcService;
	
	@Autowired
	private IGj_YWSLService ywslService;
	
	@Autowired
	private IGj_DWJCDJService dwjcdjService;
	
	@Autowired
	private IGj_DocService docService;
	
	@Autowired
	private IGj_JCBLTZService jcbltzService;

	@Override
	public String SL_GJ_HJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				HJ_GetlistModel model = null;
				model = (HJ_GetlistModel) BeanToMapUtil.convertJson(HJ_GetlistModel.class, jsonObj);
				Map<String, Object> res = hjService.GJ_HJGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "ZXSH":
			try {
				HJ_ZxshModel model = null;
				model = (HJ_ZxshModel) BeanToMapUtil.convertJson(HJ_ZxshModel.class, jsonObj);
				String res = hjService.GJ_HJZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "YYBL":
			try {
				HJ_YyblModel model = null;
				model = (HJ_YyblModel) BeanToMapUtil.convertJson(HJ_YyblModel.class, jsonObj);
				String res = hjService.GJ_HJYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETMXLIST":
			try {
				HJ_GetmxlistModel model = null;
				model = (HJ_GetmxlistModel) BeanToMapUtil.convertJson(HJ_GetmxlistModel.class, jsonObj);
				Map<String, Object> res = hjService.GJ_HJGETHJMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETGRZHSLLIST":
			try {
				HJ_GetgrzhsllistModel model = null;
				model = (HJ_GetgrzhsllistModel) BeanToMapUtil.convertJson(HJ_GetgrzhsllistModel.class, jsonObj);
				Map<String, Object> res = hjService.GJ_HJGETGRZHSLLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETJCJSTZLIST":
			try {
				HJ_GetjcjstzlistModel model = null;
				model = (HJ_GetjcjstzlistModel) BeanToMapUtil.convertJson(HJ_GetjcjstzlistModel.class, jsonObj);
				Map<String, Object> res = hjService.GJ_HJGETJCJSTZLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETFCQFLIST":
			try {
				HJ_GetfcqflistModel model = null;
				model = (HJ_GetfcqflistModel) BeanToMapUtil.convertJson(HJ_GetfcqflistModel.class, jsonObj);
				Map<String, Object> res = hjService.GJ_HJGETFCQFLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETHJAYMX":
			try {
				HJ_GethjaymxModel model = null;
				model = (HJ_GethjaymxModel) BeanToMapUtil.convertJson(HJ_GethjaymxModel.class, jsonObj);
				Map<String, Object> res = hjService.GJ_HJGETAYMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETHJZLBYID":
			try {
				HJ_GethjzlbyidModel model = null;
				model = (HJ_GethjzlbyidModel) BeanToMapUtil.convertJson(HJ_GethjzlbyidModel.class, jsonObj);
				Map<String, Object> res = hjService.GJ_HJGETHJZLBYYWID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "SAVEERRORTOGRZHSL":
			try {
				HJ_SaveerrortogrzhslModel model = null;
				model = (HJ_SaveerrortogrzhslModel) BeanToMapUtil.convertJson(HJ_SaveerrortogrzhslModel.class, jsonObj);
				String res = hjService.GJ_HJSaveErrorToGRZHSL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "SAVEERRORTOJCJSTZ":
			try {
				HJ_SaveerrortojcjstzModel model = null;
				model = (HJ_SaveerrortojcjstzModel) BeanToMapUtil.convertJson(HJ_SaveerrortojcjstzModel.class, jsonObj);
				String res = hjService.GJ_HJSaveErrorToJCJSTZ(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "SAVEERRORTOFCQF":
			try {
				HJ_SaveerrortofcqfModel model = null;
				model = (HJ_SaveerrortofcqfModel) BeanToMapUtil.convertJson(HJ_SaveerrortofcqfModel.class, jsonObj);
				String res = hjService.GJ_HJSaveErrorToFCQF(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "HJACEEPTZL":
			try {
				HJ_HjaceeptzlModel model = null;
				model = (HJ_HjaceeptzlModel) BeanToMapUtil.convertJson(HJ_HjaceeptzlModel.class, jsonObj);
				String res = hjService.GJ_HJAceeptZL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETHJZJBYID":
			try {
				HJ_GethjzjbyidModel model = null;
				model = (HJ_GethjzjbyidModel) BeanToMapUtil.convertJson(HJ_GethjzjbyidModel.class, jsonObj);
				Map<String, Object> res = hjService.GJ_HJGETHJZJBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_BJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				BJ_GetlistModel model = null;
				model = (BJ_GetlistModel) BeanToMapUtil.convertJson(BJ_GetlistModel.class, jsonObj);
				Map<String, Object> res = bjService.GJ_BJGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "ZXSH":
			try {
				BJ_ZxshModel model = null;
				model = (BJ_ZxshModel) BeanToMapUtil.convertJson(BJ_ZxshModel.class, jsonObj);
				String res = bjService.GJ_BJZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "YYBL":
			try {
				BJ_YyblModel model = null;
				model = (BJ_YyblModel) BeanToMapUtil.convertJson(BJ_YyblModel.class, jsonObj);
				String res = bjService.GJ_BJYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETMXLIST":
			try {
				BJ_GetmxlistModel model = null;
				model = (BJ_GetmxlistModel) BeanToMapUtil.convertJson(BJ_GetmxlistModel.class, jsonObj);
				Map<String, Object> res = bjService.GJ_BJGETMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "ACEEPT":
			try {
				BJ_AceeptModel model = null;
				model = (BJ_AceeptModel) BeanToMapUtil.convertJson(BJ_AceeptModel.class, jsonObj);
				String res = bjService.GJ_BJAceept(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETBYID":
			try {
				BJ_GetbyidModel model = null;
				model = (BJ_GetbyidModel) BeanToMapUtil.convertJson(BJ_GetbyidModel.class, jsonObj);
				Map<String, Object> res = bjService.GJ_BJGETBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_DWJCDJXXBG(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				DWJCDJXXBG_GetlistModel model = null;
				model = (DWJCDJXXBG_GetlistModel) BeanToMapUtil.convertJson(DWJCDJXXBG_GetlistModel.class, jsonObj);
				Map<String, Object> res = dwjcdjxxbgService.GJ_DWJCDJXXBGGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "ZXSH":
			try {
				DWJCDJXXBG_ZxshModel model = null;
				model = (DWJCDJXXBG_ZxshModel) BeanToMapUtil.convertJson(DWJCDJXXBG_ZxshModel.class, jsonObj);
				String res = dwjcdjxxbgService.GJ_DWJCDJXXBGZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "YYBL":
			try {
				DWJCDJXXBG_YyblModel model = null;
				model = (DWJCDJXXBG_YyblModel) BeanToMapUtil.convertJson(DWJCDJXXBG_YyblModel.class, jsonObj);
				String res = dwjcdjxxbgService.GJ_DWJCDJXXBGYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETBYID":
			try {
				DWJCDJXXBG_GetbyidModel model = null;
				model = (DWJCDJXXBG_GetbyidModel) BeanToMapUtil.convertJson(DWJCDJXXBG_GetbyidModel.class, jsonObj);
				Map<String, Object> res = dwjcdjxxbgService.GJ_DWJCDJXXBGGETBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "ACEEPT":
			try {
				DWJCDJXXBG_AceeptModel model = null;
				model = (DWJCDJXXBG_AceeptModel) BeanToMapUtil.convertJson(DWJCDJXXBG_AceeptModel.class, jsonObj);
				String res = dwjcdjxxbgService.GJ_DWJCDJXXBGAceept(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_DWJCDJZX(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				DWJCDJZX_GetlistModel model = null;
				model = (DWJCDJZX_GetlistModel) BeanToMapUtil.convertJson(DWJCDJZX_GetlistModel.class, jsonObj);
				Map<String, Object> res = dwjcdjzxService.GJ_DWJCDJZXGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "ZXSH":
			try {
				DWJCDJZX_ZxshModel model = null;
				model = (DWJCDJZX_ZxshModel) BeanToMapUtil.convertJson(DWJCDJZX_ZxshModel.class, jsonObj);
				String res = dwjcdjzxService.GJ_DWJCDJZXZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "YYBL":
			try {
				DWJCDJZX_YyblModel model = null;
				model = (DWJCDJZX_YyblModel) BeanToMapUtil.convertJson(DWJCDJZX_YyblModel.class, jsonObj);
				String res = dwjcdjzxService.GJ_DWJCDJZXYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "GETBYID":
			try {
				DWJCDJZX_GetbyidModel model = null;
				model = (DWJCDJZX_GetbyidModel) BeanToMapUtil.convertJson(DWJCDJZX_GetbyidModel.class, jsonObj);
				Map<String, Object> res = dwjcdjzxService.GJ_DWJCDJZXGETBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		case "ACEEPT":
			try {
				DWJCDJZX_AceeptModel model = null;
				model = (DWJCDJZX_AceeptModel) BeanToMapUtil.convertJson(DWJCDJZX_AceeptModel.class, jsonObj);
				Map<String, Object> res = dwjcdjzxService.GJ_DWJCDJZXAceept(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}
		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_ZGXXBG(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				ZGXXBG_GetlistModel model = null;
				model = (ZGXXBG_GetlistModel) BeanToMapUtil.convertJson(ZGXXBG_GetlistModel.class, jsonObj);
				Map<String, Object> res = zgxxbgService.GJ_ZGXXBGGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				ZGXXBG_ZxshModel model = null;
				model = (ZGXXBG_ZxshModel) BeanToMapUtil.convertJson(ZGXXBG_ZxshModel.class, jsonObj);
				String res = zgxxbgService.GJ_ZGXXBGZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				ZGXXBG_YyblModel model = null;
				model = (ZGXXBG_YyblModel) BeanToMapUtil.convertJson(ZGXXBG_YyblModel.class, jsonObj);
				String res = zgxxbgService.GJ_ZGXXBGYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETMXLIST":
			try {
				ZGXXBG_GetmxlistModel model = null;
				model = (ZGXXBG_GetmxlistModel) BeanToMapUtil.convertJson(ZGXXBG_GetmxlistModel.class, jsonObj);
				Map<String, Object> res = zgxxbgService.GJ_ZGXXBGGETMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYDWZH":
			try {
				ZGXXBG_GetbydwzhModel model = null;
				model = (ZGXXBG_GetbydwzhModel) BeanToMapUtil.convertJson(ZGXXBG_GetbydwzhModel.class, jsonObj);
				Map<String, Object> res = zgxxbgService.GJ_ZGXXBGGETBYDWZH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				ZGXXBG_AceeptModel model = null;
				model = (ZGXXBG_AceeptModel) BeanToMapUtil.convertJson(ZGXXBG_AceeptModel.class, jsonObj);
				String res = zgxxbgService.GJ_ZGXXBGACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_GRZHTCZY(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				GRZHTCZY_GetlistModel model = null;
				model = (GRZHTCZY_GetlistModel) BeanToMapUtil.convertJson(GRZHTCZY_GetlistModel.class, jsonObj);
				Map<String, Object> res = grzhtczyService.GJ_GRZHTCZYGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				GRZHTCZY_ZxshModel model = null;
				model = (GRZHTCZY_ZxshModel) BeanToMapUtil.convertJson(GRZHTCZY_ZxshModel.class, jsonObj);
				String res = grzhtczyService.GJ_GRZHTCZYZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				GRZHTCZY_YyblModel model = null;
				model = (GRZHTCZY_YyblModel) BeanToMapUtil.convertJson(GRZHTCZY_YyblModel.class, jsonObj);
				String res = grzhtczyService.GJ_GRZHTCZYYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETMXLIST":
			try {
				GRZHTCZY_GetmxlistModel model = null;
				model = (GRZHTCZY_GetmxlistModel) BeanToMapUtil.convertJson(GRZHTCZY_GetmxlistModel.class, jsonObj);
				Map<String, Object> res = grzhtczyService.GJ_GRZHTCZYGETMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYDWZH":
			try {
				GRZHTCZY_GetbydwzhModel model = null;
				model = (GRZHTCZY_GetbydwzhModel) BeanToMapUtil.convertJson(GRZHTCZY_GetbydwzhModel.class, jsonObj);
				String res = grzhtczyService.GJ_GRZHTCZYGETBYDWZH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				GRZHTCZY_AceeptModel model = null;
				model = (GRZHTCZY_AceeptModel) BeanToMapUtil.convertJson(GRZHTCZY_AceeptModel.class, jsonObj);
				String res = grzhtczyService.GJ_GRZHTCZYACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_GJJYDZY(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				GJJYDZY_GetlistModel model = null;
				model = (GJJYDZY_GetlistModel) BeanToMapUtil.convertJson(GJJYDZY_GetlistModel.class, jsonObj);
				Map<String, Object> res = gjjydzyService.GJ_GJJYDZYGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				GJJYDZY_ZxshModel model = null;
				model = (GJJYDZY_ZxshModel) BeanToMapUtil.convertJson(GJJYDZY_ZxshModel.class, jsonObj);
				String res = gjjydzyService.GJ_GJJYDZYZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				GJJYDZY_YyblModel model = null;
				model = (GJJYDZY_YyblModel) BeanToMapUtil.convertJson(GJJYDZY_YyblModel.class, jsonObj);
				String res = gjjydzyService.GJ_GJJYDZYYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETMXLIST":
			try {
				GJJYDZY_GetmxlistModel model = null;
				model = (GJJYDZY_GetmxlistModel) BeanToMapUtil.convertJson(GJJYDZY_GetmxlistModel.class, jsonObj);
				Map<String, Object> res = gjjydzyService.GJ_GJJYDZYGETMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYDWZH":
			try {
				GJJYDZY_GetbydwzhModel model = null;
				model = (GJJYDZY_GetbydwzhModel) BeanToMapUtil.convertJson(GJJYDZY_GetbydwzhModel.class, jsonObj);
				Map<String, Object> res = gjjydzyService.GJ_GJJYDZYGETBYDWZH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				GJJYDZY_AceeptModel model = null;
				model = (GJJYDZY_AceeptModel) BeanToMapUtil.convertJson(GJJYDZY_AceeptModel.class, jsonObj);
				String res = gjjydzyService.GJ_GJJYDZYACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_TG(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				TG_GetlistModel model = null;
				model = (TG_GetlistModel) BeanToMapUtil.convertJson(TG_GetlistModel.class, jsonObj);
				Map<String, Object> res = tgService.GJ_TGGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				TG_ZxshModel model = null;
				model = (TG_ZxshModel) BeanToMapUtil.convertJson(TG_ZxshModel.class, jsonObj);
				String res = tgService.GJ_TGZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				TG_YyblModel model = null;
				model = (TG_YyblModel) BeanToMapUtil.convertJson(TG_YyblModel.class, jsonObj);
				String res = tgService.GJ_TGYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETMXLIST":
			try {
				TG_GetmxlistModel model = null;
				model = (TG_GetmxlistModel) BeanToMapUtil.convertJson(TG_GetmxlistModel.class, jsonObj);
				Map<String, Object> res = tgService.GJ_TGGETMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYDWZH":
			try {
				TG_GetbydwzhModel model = null;
				model = (TG_GetbydwzhModel) BeanToMapUtil.convertJson(TG_GetbydwzhModel.class, jsonObj);
				Map<String, Object> res = tgService.GJ_TGGETBYDWZH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				TG_AceeptModel model = null;
				model = (TG_AceeptModel) BeanToMapUtil.convertJson(TG_AceeptModel.class, jsonObj);
				String res = tgService.GJ_TGACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_JCHJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				JCHJ_GetlistModel model = null;
				model = (JCHJ_GetlistModel) BeanToMapUtil.convertJson(JCHJ_GetlistModel.class, jsonObj);
				Map<String, Object> res = jchjService.GJ_JCHJGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				JCHJ_ZxshModel model = null;
				model = (JCHJ_ZxshModel) BeanToMapUtil.convertJson(JCHJ_ZxshModel.class, jsonObj);
				String res = jchjService.GJ_JCHJZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				JCHJ_YyblModel model = null;
				model = (JCHJ_YyblModel) BeanToMapUtil.convertJson(JCHJ_YyblModel.class, jsonObj);
				String res = jchjService.GJ_JCHJYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYID":
			try {
				JCHJ_GetbyidModel model = null;
				model = (JCHJ_GetbyidModel) BeanToMapUtil.convertJson(JCHJ_GetbyidModel.class, jsonObj);
				Map<String, Object> res = jchjService.GJ_JCHJGETBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				JCHJ_AceeptModel model = null;
				model = (JCHJ_AceeptModel) BeanToMapUtil.convertJson(JCHJ_AceeptModel.class, jsonObj);
				String res = jchjService.GJ_JCHJACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_LHJYRYJC(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				LHJYRYJC_GetlistModel model = null;
				model = (LHJYRYJC_GetlistModel) BeanToMapUtil.convertJson(LHJYRYJC_GetlistModel.class, jsonObj);
				Map<String, Object> res = lhjyryjcService.GJ_LHJYRYJCGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				LHJYRYJC_ZxshModel model = null;
				model = (LHJYRYJC_ZxshModel) BeanToMapUtil.convertJson(LHJYRYJC_ZxshModel.class, jsonObj);
				String res = lhjyryjcService.GJ_LHJYRYJCZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				LHJYRYJC_YyblModel model = null;
				model = (LHJYRYJC_YyblModel) BeanToMapUtil.convertJson(LHJYRYJC_YyblModel.class, jsonObj);
				String res = lhjyryjcService.GJ_LHJYRYJCYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETMXLIST":
			try {
				LHJYRYJC_GetmxlistModel model = null;
				model = (LHJYRYJC_GetmxlistModel) BeanToMapUtil.convertJson(LHJYRYJC_GetmxlistModel.class, jsonObj);
				Map<String, Object> res = lhjyryjcService.GJ_LHJYRYJCGETMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				LHJYRYJC_AceeptModel model = null;
				model = (LHJYRYJC_AceeptModel) BeanToMapUtil.convertJson(LHJYRYJC_AceeptModel.class, jsonObj);
				String res = lhjyryjcService.GJ_LHJYRYJCACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYID":
			try {
				LHJYRYJC_GetbyidModel model = null;
				model = (LHJYRYJC_GetbyidModel) BeanToMapUtil.convertJson(LHJYRYJC_GetbyidModel.class, jsonObj);
				Map<String, Object> res = lhjyryjcService.GJ_LHJYRYJCGETBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_YWSL(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				YWSL_GetlistModel model = null;
				model = (YWSL_GetlistModel) BeanToMapUtil.convertJson(YWSL_GetlistModel.class, jsonObj);
				Map<String, Object> res = ywslService.GJ_YWSLGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				YWSL_ZxshModel model = null;
				model = (YWSL_ZxshModel) BeanToMapUtil.convertJson(YWSL_ZxshModel.class, jsonObj);
				String res = ywslService.GJ_YWSLZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				YWSL_YyblModel model = null;
				model = (YWSL_YyblModel) BeanToMapUtil.convertJson(YWSL_YyblModel.class, jsonObj);
				String res = ywslService.GJ_YWSLYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETMXLIST":
			try {
				YWSL_GetmxlistModel model = null;
				model = (YWSL_GetmxlistModel) BeanToMapUtil.convertJson(YWSL_GetmxlistModel.class, jsonObj);
				Map<String, Object> res = ywslService.GJ_YWSLGETMXLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYDWZH":
			try {
				YWSL_GetbydwzhModel model = null;
				model = (YWSL_GetbydwzhModel) BeanToMapUtil.convertJson(YWSL_GetbydwzhModel.class, jsonObj);
				Map<String, Object> res = ywslService.GJ_YWSLGETBYDWZH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				YWSL_AceeptModel model = null;
				model = (YWSL_AceeptModel) BeanToMapUtil.convertJson(YWSL_AceeptModel.class, jsonObj);
				String res = ywslService.GJ_YWSLACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETZXBYID":
			try {
				YWSL_GetzxbyidModel model = null;
				model = (YWSL_GetzxbyidModel) BeanToMapUtil.convertJson(YWSL_GetzxbyidModel.class, jsonObj);
				Map<String, Object> res = ywslService.GJ_YWSLGETZXBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String SL_GJ_DWJCDJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				DWJCDJ_GetlistModel model = null;
				model = (DWJCDJ_GetlistModel) BeanToMapUtil.convertJson(DWJCDJ_GetlistModel.class, jsonObj);
				Map<String, Object> res = dwjcdjService.GJ_DWJCDJGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				DWJCDJ_ZxshModel model = null;
				model = (DWJCDJ_ZxshModel) BeanToMapUtil.convertJson(DWJCDJ_ZxshModel.class, jsonObj);
				String res = dwjcdjService.GJ_DWJCDJZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				DWJCDJ_YyblModel model = null;
				model = (DWJCDJ_YyblModel) BeanToMapUtil.convertJson(DWJCDJ_YyblModel.class, jsonObj);
				String res = dwjcdjService.GJ_DWJCDJYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYID":
			try {
				DWJCDJ_GetbyidModel model = null;
				model = (DWJCDJ_GetbyidModel) BeanToMapUtil.convertJson(DWJCDJ_GetbyidModel.class, jsonObj);
				Map<String, Object> res = dwjcdjService.GJ_DWJCDJGETBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				DWJCDJ_AceeptModel model = null;
				model = (DWJCDJ_AceeptModel) BeanToMapUtil.convertJson(DWJCDJ_AceeptModel.class, jsonObj);
				String res = dwjcdjService.GJ_DWJCDJACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}

	@Override
	public String Doc_GetDocByID(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		try {
			GetDocByID_AceeptModel model = null;
			model = (GetDocByID_AceeptModel) BeanToMapUtil.convertJson(GetDocByID_AceeptModel.class, jsonObj);
			Map<String,Object> res = docService.Doc_GetDocByID(model);
			return ResponseUtil.succ(res);
		}
		catch (ServiceException e) {
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}
	}

	@Override
	public String SL_GJ_JCBLTZ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				JCBLTZ_GetlistModel model = null;
				model = (JCBLTZ_GetlistModel) BeanToMapUtil.convertJson(JCBLTZ_GetlistModel.class, jsonObj);
				Map<String, Object> res = jcbltzService.GJ_JCBLTZGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				JCBLTZ_ZxshModel model = null;
				model = (JCBLTZ_ZxshModel) BeanToMapUtil.convertJson(JCBLTZ_ZxshModel.class, jsonObj);
				String res = jcbltzService.GJ_JCBLTZZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				JCBLTZ_YyblModel model = null;
				model = (JCBLTZ_YyblModel) BeanToMapUtil.convertJson(JCBLTZ_YyblModel.class, jsonObj);
				String res = jcbltzService.GJ_JCBLTZYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYID":
			try {
				JCBLTZ_GetbyidModel model = null;
				model = (JCBLTZ_GetbyidModel) BeanToMapUtil.convertJson(JCBLTZ_GetbyidModel.class, jsonObj);
				Map<String, Object> res = jcbltzService.GJ_JCBLTZGETBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				JCBLTZ_AceeptModel model = null;
				model = (JCBLTZ_AceeptModel) BeanToMapUtil.convertJson(JCBLTZ_AceeptModel.class, jsonObj);
				String res = jcbltzService.GJ_JCBLTZACEEPT(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}
}
