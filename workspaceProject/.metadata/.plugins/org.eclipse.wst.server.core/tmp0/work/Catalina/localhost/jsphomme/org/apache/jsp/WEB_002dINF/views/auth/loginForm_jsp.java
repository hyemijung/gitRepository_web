/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-04-24 08:19:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.auth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\timg {\r\n");
      out.write("\t\tmargin-left: 93px;\r\n");
      out.write("    \tmargin-right: 93px;\r\n");
      out.write("    \tmargin-top: 30px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.loginContainerDiv{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\ttop: 50%;\r\n");
      out.write("\t\tleft: 50%;\r\n");
      out.write("\t\ttransform: translate(-50%,-50%);\r\n");
      out.write("\t\twidth: 400px;\r\n");
      out.write("\t\tmargin-top: 80px;\r\n");
      out.write("\t\tbackground-color: rgba(0, 0, 0, 0.1);\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tpadding: 30px;\r\n");
      out.write("\t\tbox-shadow: 0px 2px 8px 2px #555;\r\n");
      out.write("\t\tborder-radius: 6px;\r\n");
      out.write("\t\tbox-sizing: border-box;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.loginContainerDiv h2{\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tpadding: 10px 15px;\r\n");
      out.write("\t\tletter-spacing: 1px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t#loginBoxDiv label{\r\n");
      out.write("\t\ttext-transform: uppercase;\r\n");
      out.write("\t\tfont-size: 12px;\r\n");
      out.write("\t\tletter-spacing: 1px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#memberId, #memberPassword, #loginBtn ,#memberRegiBtn {\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\tpadding: 8px 12px;\r\n");
      out.write("\t\tmargin: 8px 0px;\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t\tbox-sizing: border-box;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tbackground-color: transparent;\r\n");
      out.write("\t\tborder: 1px solid white;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#memberId:focus, #memberPassword:focus {\r\n");
      out.write("\t\toutline: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#loginBtn, #memberRegiBtn {\r\n");
      out.write("\t\tpadding: 12px 20px;\r\n");
      out.write("\t\tcursor: pointer;\r\n");
      out.write("\t\tfont-family: Abel;\r\n");
      out.write("\t\tfont-size: 14px;\r\n");
      out.write("\t\tletter-spacing: 1px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#loginBtn:hover, #memberRegiBtn:hover {\r\n");
      out.write("\t\tbackground: rgba(0, 0, 0, 0.5);\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t#loginBodyDiv {\r\n");
      out.write("\t\twidth: 1920px;\r\n");
      out.write("\t\theight: 900px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<title>로그인</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction loginFnc() {\r\n");
      out.write("\t\tvar idObj = document.getElementById(\"memberId\");\r\n");
      out.write("\t\tvar passwordObj = document.getElementById(\"memberPassword\");\r\n");
      out.write("\r\n");
      out.write("\t\tif (idObj.value == null || idObj.value == \"\") {\r\n");
      out.write("\t\t\talert(\"아이디를 입력해 주세요\");\r\n");
      out.write("\t\t\tidObj.focus();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif (passwordObj.value == null || passwordObj.value == \"\") {\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력해 주세요\")\r\n");
      out.write("\t\t\tpasswordObj.focus();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar formObj = document.getElementById(\"loginForm\")\r\n");
      out.write("\t\tformObj.submit();\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction myRegisterFnc() {\r\n");
      out.write("\t\tlocation.href = \"../member/add.do\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/headerAfterLogin.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"loginBodyDiv\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<img alt=\"ConceptPhoto\" src=\"../resources/images/conceptPhotoTomFord.jpg\" width=\"1700px;\" height=\"700px;\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"loginContainerDiv\">\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h2>LOGIN FORM</h2>\r\n");
      out.write("\t\t<div id=\"loginBoxDiv\">\r\n");
      out.write("\t\t\t<form action=\"loginCtr.do\" id=\"loginForm\" method=\"post\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label><b>ID</b></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"id\" id=\"memberId\" placeholder=\"ID\"></br>\r\n");
      out.write("\t\t\t\t\t<label><b>Password</b></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name='password' id=\"memberPassword\" placeholder=\"Password\" required=\"required\"></br></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"로그인\" id=\"loginBtn\" onclick=\"loginFnc();\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"회원가입\" id=\"memberRegiBtn\" onclick=\"myRegisterFnc();\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/tail.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
