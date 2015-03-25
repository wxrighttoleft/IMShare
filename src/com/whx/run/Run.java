package com.whx.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.whx.ui.StartIndexFrame;

public class Run {

	/**
	 * 
	 * @date 2015-3-24 下午11:57:47
	 * @author xkj
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StartIndexFrame sif = (StartIndexFrame)context.getBean("startIndexFrame");
		sif.setVisible(true);
	}

}
