/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-04-23 08:42:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t#tailContainer {\r\n");
      out.write("\t\tclear:both;\r\n");
      out.write("\t\twidth: 1904px;\r\n");
      out.write("\t\tbackground-color: #EEEEEE;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#tailLine { \r\n");
      out.write("\t\tmargin-top: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#tialLine hr {\r\n");
      out.write("\t\tborder: solid 1.5px #ABABAB;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t#tailLeft {\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\tmargin-left: 200px;\r\n");
      out.write("\t\tcolor: #A6A6A6;\r\n");
      out.write("\t\tfont-family: Gulim;\r\n");
      out.write("\t\tfont-size: 12px;\r\n");
      out.write("\t\tline-height: 1.5em;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#tailRight {\r\n");
      out.write("\t\tmargin-right: 200px;\r\n");
      out.write("\t\tfloat: right;\r\n");
      out.write("\t\tcolor: #A6A6A6;\r\n");
      out.write("\t\tfont-family: Gulim;\r\n");
      out.write("\t\tfont-size: 12px;\r\n");
      out.write("\t\tline-height: 2em;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"tailContainer\">\r\n");
      out.write("\t\t<div id=\"tailLine\">\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"tailLeft\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tCOMPANY: 주식회사 JSP HOMME\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\tADDRESS: 서울 서초구 서초대로78길 48 12층 &nbsp;&nbsp;JSP HOMME\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\tCEO: 박대승, 박지원, 정혜미 &nbsp;(jsphomme@naver.com)  \t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\tCOPYRIGHT: &nbsp;ⓒ JSP HOMME &nbsp;&nbsp;\tALL RIGHTS RESERVED\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div id=\"tailRight\">\r\n");
      out.write("\t\t\tBUSINESS LICENSE: 220-12-34567\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\tTEL:02-123-4567\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\tCONTACT US: jsphomme@naver.com\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
