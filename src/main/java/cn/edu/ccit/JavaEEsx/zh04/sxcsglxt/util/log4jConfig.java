package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.util;

import org.apache.log4j.PropertyConfigurator;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class log4jConfig extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig servletConfig) throws ServletException {
        String prefix = getServletContext().getRealPath("/");

        String log4jFile = getInitParameter("log4jConfigLocation");//web.xml中配置

        if (log4jFile != null) {

            PropertyConfigurator.configure(prefix + log4jFile);

        }

    }
}
