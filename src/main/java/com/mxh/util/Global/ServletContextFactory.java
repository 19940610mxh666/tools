package com.mxh.util.Global;

import javax.servlet.ServletContext;

/**
 * @author mxh
 * @version ����ʱ�䣺2018��8��7������1:53:40 ��˵��
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