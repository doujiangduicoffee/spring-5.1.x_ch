package com.yinke.edu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author 仙道
 * @create 2019/12/3 11:46
 */
public class YinKeBean implements InitializingBean, ApplicationContextAware {

	private ItBean itBean;

	public void setItBean(ItBean itBean) {
		this.itBean = itBean;
	}

	/**
	 * 构造函数
	 */
	public YinKeBean(){
		System.out.println("YinkeBean 构造器...");
	}


	/**
	 * InitializingBean 接口实现
	 */
	public void afterPropertiesSet() throws Exception {
		System.out.println("YinkeBean afterPropertiesSet...");
	}

	public void print() {
		System.out.println("print方法业务逻辑执行");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext....");
	}
}
