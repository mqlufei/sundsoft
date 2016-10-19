package com.sundsoft.model.in;

public enum Enum_CZLX {
	Insert(0), Update(1), Delete(2);

	private Integer value;

	private Enum_CZLX(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
