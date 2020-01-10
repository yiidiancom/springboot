package com.yiidian.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/**
 * 定义Listener监听器
 * 一点教程网 - www.yiidian.com
 */
@WebListener
public class HelloListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext对象消耗了");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext对象创建了");
	}

}
