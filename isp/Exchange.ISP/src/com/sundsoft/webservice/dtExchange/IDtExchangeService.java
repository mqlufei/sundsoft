package com.sundsoft.webservice.dtExchange;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sundsoft.model.in.TableParam;
import com.sundsoft.model.in.VisitControl;

@WebService(targetNamespace = IDtExchangeService.NAME_SPACE)
public interface IDtExchangeService {

	public static final String NAME_SPACE = "http://www.sundsoft.com/dtExchangeService";

	/**
	 * 
	* @author liujn
	* @Title: DT_GB101
	* @Description:  数据传输  GB101 缴存单位信息
	* @param @param v_Control 控制参数 
	* @param @param tableParam DataSet数据集
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB101")
	public String DT_GB101(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB102
	* @Description: 数据传输  GB102 个人信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB102")
	public String DT_GB102(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB201
	* @Description: 数据传输  GB201 单位账户信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB201")
	public String DT_GB201(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB202
	* @Description: 数据传输  GB202 单位业务明细信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB202")
	public String DT_GB202(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB203
	* @Description: 数据传输  GB203 个人账户信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB203")
	public String DT_GB203(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB204
	* @Description: 数据传输  GB204 个人业务明细信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB204")
	public String DT_GB204(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB301
	* @Description: 数据传输  GB301 个人住房贷款借款合同信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB301")
	public String DT_GB301(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB302
	* @Description:  数据传输  GB302 担保合同信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB302")
	public String DT_GB302(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB303
	* @Description: 数据传输  GB303 共同借款人信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB303")
	public String DT_GB303(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB304
	* @Description: 数据传输  GB304 个人住房贷款账户信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB304")
	public String DT_GB304(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB305
	* @Description: 数据传输  GB305 个人住房贷款业务明细信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB305")
	public String DT_GB305(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB306
	* @Description: 数据传输  GB306 个人住房贷款逾期登记信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB306")
	public String DT_GB306(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_DK_LPXM_V5
	* @Description: 数据传输  UTB_DK_LPXM_V5  楼盘项目信息
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_DK_LPXM_V5")
	public String DT_DK_LPXM_V5(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_DK_LPXMMX_V5
	* @Description: 数据传输  UTB_DK_LPXMMX_V5  楼盘项目信息明细
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_DK_LPXMMX_V5")
	public String DT_DK_LPXMMX_V5(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_DK_KFS_V5
	* @Description: 数据传输  UTB_DK_KFS_V5  开发商
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_DK_KFS_V5")
	public String DT_DK_KFS_V5(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_DK_DKJD_V5
	* @Description:  数据传输  UTB_DK_DKJD  贷款进度
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_DK_DKJD_V5")
	public String DT_DK_DKJD_V5(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_GB202EXT
	* @Description: 数据传输  GB202EXT  单位业务明细信息--扩展表
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_GB202EXT")
	public String DT_GB202EXT(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_MARGIN_MAIN
	* @Description: 数据传输  UTB_DK_MARGIN_MAIN  保证金主表
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_MARGIN_MAIN")
	public String DT_MARGIN_MAIN(VisitControl v_Control, TableParam tableParam);

	/**
	 * 
	* @author liujn
	* @Title: DT_MARGIN_DETIALS
	* @Description: 数据传输  UTB_DK_MARGIN_DETIALS  保证金明细表
	* @param @param v_Control
	* @param @param tableParam
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "DT_MARGIN_DETIALS")
	public String DT_MARGIN_DETIALS(VisitControl v_Control, TableParam tableParam);

}
