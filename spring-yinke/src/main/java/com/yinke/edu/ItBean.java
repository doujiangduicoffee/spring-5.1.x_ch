package com.yinke.edu;

/**
 * @author 仙道
 */
public class ItBean {

	private YinKeBean yinKeBean;

	public void setBean(YinKeBean yinKeBean) {
		this.yinKeBean = yinKeBean;
	}

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("ItBean 构造器...");
	}
}
