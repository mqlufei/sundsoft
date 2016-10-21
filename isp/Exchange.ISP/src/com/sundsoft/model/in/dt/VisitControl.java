package com.sundsoft.model.in.dt;

public class VisitControl {

	// region 构造函数
	public VisitControl() {

	}

	/// <summary>
	/// 访问控制类 构造函数
	/// </summary>
	/// <param name="gjjzxbm">公积金中心编码</param>
	/// <param name="czlx">操纵类型</param>
	public VisitControl(String gjjzxbm, Enum_CZLX czlx) {
		this.gjjzxbm = gjjzxbm;
		this.czlx = czlx;
	}

	/// 公积金中心编码
	private String gjjzxbm;
	/// 操作类型
	private Enum_CZLX czlx;

	public String getGjjzxbm() {
		return gjjzxbm;
	}

	public Enum_CZLX getCzlx() {
		return czlx;
	}

	public void setGjjzxbm(String gjjzxbm) {
		this.gjjzxbm = gjjzxbm;
	}

	public void setCzlx(Enum_CZLX czlx) {
		this.czlx = czlx;
	}

}
