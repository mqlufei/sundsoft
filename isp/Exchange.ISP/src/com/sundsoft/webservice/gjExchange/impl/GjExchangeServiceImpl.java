package com.sundsoft.webservice.gjExchange.impl;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.webservice.gjExchange.IGjExchangeService;

import net.sf.json.JSONObject;

public class GjExchangeServiceImpl implements IGjExchangeService {

	private JSONObject jsonObj = null;

	@Override
	public String SL_GJ_HJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETMXLIST":
			break;
		case "GETGRZHSLLIST":
			break;
		case "GETJCJSTZLIST":
			break;
		case "GETFCQFLIST":
			break;
		case "GETHJAYMX":
			break;
		case "GETHJZLBYID":
			break;
		case "SAVEERRORTOGRZHSL":
			break;
		case "SAVEERRORTOJCJSTZ":
			break;
		case "SAVEERRORTOFCQF":
			break;
		case "HJACEEPTZL":
			break;
		case "GETHJZJBYID":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_BJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETMXLIST":
			break;
		case "ACEEPT":
			break;
		case "GETBYID":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_DWJCDJXXBG(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETBYID":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_DWJCDJZX(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETBYID":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_ZGXXBG(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETMXLIST":
			break;
		case "GETBYDWZH":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_GRZHTCZY(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETMXLIST":
			break;
		case "GETBYDWZH":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_GJJYDZY(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETMXLIST":
			break;
		case "GETBYDWZH":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_TG(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETMXLIST":
			break;
		case "GETBYDWZH":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_JCHJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETBYID":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_LHJYRYJC(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETMXLIST":
			break;
		case "ACEEPT":
			break;
		case "GETBYID":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_YWSL(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETMXLIST":
			break;
		case "GETBYDWZH":
			break;
		case "ACEEPT":
			break;
		case "GETZXBYID":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String SL_GJ_DWJCDJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETBYID":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String Doc_GetDocByID(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		
		return null;
	}

	@Override
	public String SL_GJ_JCBLTZ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			break;
		case "ZXSH":
			break;
		case "YYBL":
			break;
		case "GETBYID":
			break;
		case "ACEEPT":
			break;
		default:
			break;
		}
		return null;
	}
}
