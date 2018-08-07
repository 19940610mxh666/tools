package com.mxh.util.Global;

import javax.servlet.ServletContext;

/**
 * @author mxh
 * @version 创建时间：2018年8月7日上午1:53:40 类说明
 */
public class ServletContextFactory {
	private static ServletContext servletContext;

	static void setServletContext(ServletContext servletContext1) {
		servletContext = servletContext1;
	}

	public static ServletContext getServletContext() throws Exception {
		if (servletContext != null) {
			return servletContext;
		}
		throw new Exception("Servlet contex is null. Try to restart server.");
	}
}