package com.sundsoft.webservice.dtExchange;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.sundsoft.common.DataDict;
import com.sundsoft.model.in.VisitControl;

@WebService(targetNamespace = DataDict.NAME_SPACE)
public interface IDtExchangeService {
	/**
	 * 
	* @author liujn
	* @Title: DT_GB101
	* @Description:  数据传输  GB101 缴存单位信息
	* @param @param v_Control 控制参数 
	* @param @param p_Data DataSet数据集
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB101")
	public String DT_GB101(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB102
	* @Description: 数据传输  GB102 个人信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB102")
	public String DT_GB102(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB201
	* @Description: 数据传输  GB201 单位账户信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB201")
	public String DT_GB201(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB202
	* @Description: 数据传输  GB202 单位业务明细信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB202")
	public String DT_GB202(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB203
	* @Description: 数据传输  GB203 个人账户信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB203")
	public String DT_GB203(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB204
	* @Description: 数据传输  GB204 个人业务明细信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB204")
	public String DT_GB204(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB301
	* @Description: 数据传输  GB301 个人住房贷款借款合同信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB301")
	public String DT_GB301(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB302
	* @Description:  数据传输  GB302 担保合同信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB302")
	public String DT_GB302(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB303
	* @Description: 数据传输  GB303 共同借款人信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB303")
	public String DT_GB303(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB304
	* @Description: 数据传输  GB304 个人住房贷款账户信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB304")
	public String DT_GB304(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB305
	* @Description: 数据传输  GB305 个人住房贷款业务明细信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB305")
	public String DT_GB305(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB306
	* @Description: 数据传输  GB306 个人住房贷款逾期登记信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB306")
	public String DT_GB306(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_DK_LPXM_V5
	* @Description: 数据传输  UTB_DK_LPXM_V5  楼盘项目信息
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_DK_LPXM_V5")
	public String DT_DK_LPXM_V5(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_DK_LPXMMX_V5
	* @Description: 数据传输  UTB_DK_LPXMMX_V5  楼盘项目信息明细
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_DK_LPXMMX_V5")
	public String DT_DK_LPXMMX_V5(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_DK_KFS_V5
	* @Description: 数据传输  UTB_DK_KFS_V5  开发商
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_DK_KFS_V5")
	public String DT_DK_KFS_V5(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_DK_DKJD_V5
	* @Description:  数据传输  UTB_DK_DKJD  贷款进度
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_DK_DKJD_V5")
	public String DT_DK_DKJD_V5(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_GB202EXT
	* @Description: 数据传输  GB202EXT  单位业务明细信息--扩展表
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB202EXT")
	public String DT_GB202EXT(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_MARGIN_MAIN
	* @Description: 数据传输  UTB_DK_MARGIN_MAIN  保证金主表
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_MARGIN_MAIN")
	public String DT_MARGIN_MAIN(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);
	/**
	 * 
	* @author liujn
	* @Title: DT_MARGIN_DETIALS
	* @Description: 数据传输  UTB_DK_MARGIN_DETIALS  保证金明细表
	* @param @param v_Control
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_MARGIN_DETIALS")
	public String DT_MARGIN_DETIALS(@WebParam(name = "v_Control", targetNamespace = DataDict.NAME_SPACE) VisitControl v_Control,
			@WebParam(name = "p_Data", targetNamespace = DataDict.NAME_SPACE) List<Map<String, Object>> p_Data);

}
