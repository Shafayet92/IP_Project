package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("session_start();\r\n");
      out.write("require('./Table/config.php');\r\n");
      out.write("\r\n");
      out.write("$_SESSION[\"Login\"] = \"XXX\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("echo \"<script> \r\n");
      out.write("document.getElementById('user').value = '$user';\r\n");
      out.write("document.getElementById('pass').value = '$pass'; \r\n");
      out.write("</script>\";\r\n");
      out.write("\r\n");
      out.write("}-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Login Page</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/style_login.css\">\r\n");
      out.write("\t<script src=\"./Js/login.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<p class=\"head\">Leave Application Management System</p>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<form method=\"post\" class=\"form\" name=\"login_form\" action=\"check_login.php\" onsubmit=\"return validateLoginForm()\">\r\n");
      out.write("\t\t\t<p>Username: <input type=\"text\" size=\"30\" placeholder=\"username\" name=\"username\" /></p>\r\n");
      out.write("\t\t\t<p>Password: <input type=\"password\" size=\"30\" placeholder=\"password\" name=\"password\" /></p>\r\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"remember\" value=\"1\">Remember Me</input> \r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<p><input type=\"submit\" class=\"btn\" value=\"Login\" /></p>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
