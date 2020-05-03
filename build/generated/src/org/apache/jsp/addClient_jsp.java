package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addClient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navigationBar.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create Client Account</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\" style=\"position: fixed; width: 100%; background-color: #000000\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"> C M S </a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\">DASHBOARD</a></li>\n");
      out.write("                    <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Add / Register<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Register Users</a></li>\n");
      out.write("                            <li><a href=\"#\">Add Cheque Details</a></li>\n");
      out.write("                            <li><a href=\"#\">Register Clients</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Manage<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Manage User Accounts</a></li>\n");
      out.write("                            <li><a href=\"#\">Manage Cheques</a></li>\n");
      out.write("                            <li><a href=\"#\">Manage Client Details</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"addClient\" method=\"POST\">\n");
      out.write("            <div style=\"position: absolute; left: 35%; top: 2%; width: 30%; height: 80%; background-color: #cccccc\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 7%; width: 20%; height: 15px\">\n");
      out.write("                <h4>CREATE CLIENT ACCOUNT</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 15%; width: 20%; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"client_name\" name=\"client_name\" placeholder=\"Client Name\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 23%; width: 20%; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"contact_no\" name=\"contact_no\" placeholder=\"Contact No\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 31%; width: 20%; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"nic\" name=\"nic\"placeholder=\"NIC\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 39%; width: 20%; height: 15px\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"note\" name=\"note\" placeholder=\"Note\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" style=\"position: absolute; left: 40%; top: 50%; width: 20%; height: 15px\">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-info\" value=\"Create Accoun\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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