package com.yiidian.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 定义Servlet
 * 一点教程网 - www.yiidian.com
 */
@WebServlet(name="helloServlet",urlPatterns="/helloServlet")  // @WebServlet:声明该类为Servlet程序
/**
 * 等同于web.xml配置
 *     <servlet>
 *         <servlet-name>helloServlet</servlet-name>
 *         <servlet-class>com.yiidian.controller.HelloServlet</servlet-class>
 *     </servlet>
 *     <servlet-mapping>
 *     	   <servlet-name>helloServlet</servlet-name>
 *         <url-pattern>/helloServlet</url-pattern>
 *     </servlet-mapping>
 * @author lenovo
 *
 */
public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("执行了HelloServlet的doGet方法....");
	}
	
}
