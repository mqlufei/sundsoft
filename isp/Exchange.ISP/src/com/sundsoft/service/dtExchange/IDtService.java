package com.sundsoft.service.dtExchange;

import java.util.ArrayList;
import java.util.HashMap;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.VisitControl;

public interface IDtService {

	public void Insert_GB101_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB102_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB201_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB202_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB203_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB204_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB301_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB302_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB303_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB304_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB305_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB306_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_GB202EXT_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_DK_LPXM_V5_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_DK_LPXMMX_V5_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_DK_KFS_V5_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_DK_DKJD_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_DK_MARGIN_MAIN_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

	public void Insert_DK_MARGIN_DETIALS_temp(VisitControl v_Control, ArrayList<HashMap<String, Object>> p_Data) throws ServiceException;

}
