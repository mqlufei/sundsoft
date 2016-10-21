package com.sundsoft.model.in.dt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class TableParam implements Serializable{

	/**
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = -1523372100160940189L;
	
	private ArrayList<HashMap<String, Object>> p_Data;

	public ArrayList<HashMap<String, Object>> getP_Data() {
		return p_Data;
	}

	public void setP_Data(ArrayList<HashMap<String, Object>> p_Data) {
		this.p_Data = p_Data;
	}

}
