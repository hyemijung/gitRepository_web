/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-04-25 06:28:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class siteMainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1555569358770L));
    _jspx_dependants.put("jar:file:/C:/workspaceProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/jsphomme/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/workspaceProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/jsphomme/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
  }

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Welcome JSP Homme!</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t\r\n");
      out.write("\t* {\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.mainImg{\r\n");
      out.write("\t\toverflow: hidden;\r\n");
      out.write("\t\tmargin: auto;\r\n");
      out.write("\t\twidth: 1200px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tnav {\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.mainImg ul{\r\n");
      out.write("\t\twidth: 400px;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tli{\r\n");
      out.write("\t\tlist-style-type: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.mainImg ul li{\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.mainImg img{\r\n");
      out.write("\t\twidth: 380px;\r\n");
      out.write("\t\theight: 300px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ta{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\tcolor: black;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.introduce{\r\n");
      out.write("\t\twidth: 800px;\r\n");
      out.write("\t\tmargin: auto;\r\n");
      out.write("\t\tmargin-top: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/headerAfterLogin.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<h1>JSP Homme</h1>\r\n");
      out.write("\t<div class=\"mainImg\">\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t<a href='#' onclick=\"goProductList();\">\r\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"1\" src=\"/jsphomme/resources/images/main_1.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t<a href='#' onclick=\"goProductList();\">\r\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"2\" src=\"/jsphomme/resources/images/main_2.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t<a href='#' onclick=\"goProductList();\">\r\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"3\" src=\"/jsphomme/resources/images/main_3.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"introduce\">\r\n");
      out.write("\t\t&nbsp저희 <strong>JSP Homme</strong>는 영국에서 최초로 시작되어 저희의 옷을 입는 모든 사람에게 행운을 주었고\r\n");
      out.write("\t\t바로 지금! 당신에게 행운의 기회가 찾아왔습니다. 당신은 <strong>JSP Homme</strong>의 옷을 구입한 후, \r\n");
      out.write("\t\t4일안에 당신곁에 있는 사람들에게 저희의 옷을 추천해 주어야 합니다. \r\n");
      out.write("\t\t이 문구를 포함해서 총 7명의 행운이 필요한 사람에게 보내 주셔야 합니다.\r\n");
      out.write("\t\t복사를 해도 좋습니다. 혹 미신이라 하실지 모르지만 사실입니다. \r\n");
      out.write("\t\t영국에서 <strong>HGXWCH</strong>라는 사람은 1930년에 저희의 옷을 추천 받았습니다. \r\n");
      out.write("\t\t그는 비서에게 시켜 당장 <strong>JSP Homme</strong>의 옷을 사고 주변인들에게 추천하라고 했습니다. \r\n");
      out.write("\t\t며칠뒤에 복권이 당첨되어 20억을 받았습니다. 이떤이는 이 편지를 받았으나 \r\n");
      out.write("\t\t96시간 이내에 자신의 주변 사람들에게 추천해야 한다는 사실을 잊었습니다. \r\n");
      out.write("\t\t그는 곧 사직되었습니다. 나중에야 이 사실을 알고 7명의 사람에게 <strong>JSP Homme</strong>의 \r\n");
      out.write("\t\t옷을 추천했는데 다시 좋은 직장을 얻었습니다.\r\n");
      out.write("\t\t기억해 주세요. 저희의 옷을 구매하지 않으면 행운은 찾아오지 않습니다. \r\n");
      out.write("\t\t하지만 저희의 옷을 구매하고 다른 사람들에게 추천한다면 행운이 있을 것입니다. \r\n");
      out.write("\t\t당신과 저희의 옷을 사는 모든 사람들은 7년의 행운이 있을 것이고,\r\n");
      out.write("\t\t이 문구를 무시하거나 옷을 구매하지 않는 사람들은 3년의 불행이 있을 것입니다.\r\n");
      out.write("\t\t<strong>아디오스..</strong>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<br/>- <strong>JSP Homme</strong>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/tail.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
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