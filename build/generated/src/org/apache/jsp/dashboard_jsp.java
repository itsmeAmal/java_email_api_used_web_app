package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cms.controller.userController;
import java.sql.ResultSet;
import com.cms.controller.commonController;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"position: fixed; left: 0px; top: 0px; width: 100%; height: 100px\"; z-index:9999>\n");
      out.write("            ");
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
      out.write("        </div>\n");
      out.write("        <!--9-->\n");
      out.write("        <div style=\"position: fixed; left: 0%; top: 6%; width: 100%; height: 100%; background-color: #ffffff; z-index:-1\"></div>\n");
      out.write("        <!--10-->\n");
      out.write("        <div style=\"position: fixed; left: 0%; top: 6%; width: 17%; height: 100%; background-color: rgba(0, 0, 0, 0.5); z-index:-1\">\n");
      out.write("            <div style=\"position: absolute; left: 30%; top: 10%; width: 128px; height: 128px\">\n");
      out.write("                <img src=\"images/manx128.png\" alt=\"Current User\" height=\"128\" width=\"128\" style=\"vertical-align:middle\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!--11-->\n");
      out.write("        <div style=\"position: fixed; left: 20%; top: 12%; width: 15%; height: 100px; background-color: rgba(0, 128, 255, 0.5); z-index:-1\">\n");
      out.write("            <h3 style=\"position: absolute; left: 30%; top: 4%; width: 70%; height: 100px; \">Current</br> Users</h3></div>\n");
      out.write("        <div style=\"position: fixed; left: 20%; top: 12%; width: 4%; height: 100px; background-color: rgba(0, 128, 255, 0.5); z-index:-1\"></div>\n");
      out.write("\n");
      out.write("        <!--1-->\n");
      out.write("        <div style=\"position: absolute; left: 40%; top: 12%; width: 15%; height: 100px; background-color: rgba(0, 204, 0, 0.5)\">\n");
      out.write("            <h3 style=\"position: absolute; left: 30%; top: 4%; width: 70%; height: 100px; \">Registered</br> Users</h3>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"position: absolute; left: 40%; top: 12%; width: 4%; height: 100px; background-color: rgba(0, 204, 0, 0.5)\">\n");
      out.write("            ");

                int registeredUsers = commonController.getUserCount();
            
      out.write("\n");
      out.write("            <h1 style=\"position: absolute; left: 40%; top: 10%; width: 70%; height: 100px; \"><b>");
      out.print(registeredUsers);
      out.write("</b></h1>\n");
      out.write("                    ");

                    
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--2-->\n");
      out.write("        <div style=\"position: absolute; left: 60%; top: 12%; width: 15%; height: 100px; background-color: rgba(255, 0, 0, 0.5)\">\n");
      out.write("            <h3 style=\"position: absolute; left: 30%; top: 4%; width: 70%; height: 100px; \">Registered</br> Clients</h3>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"position: absolute; left: 60%; top: 12%; width: 4%; height: 100px; background-color: rgba(255, 0, 0, 0.5)\">\n");
      out.write("            ");

                int registeredClients = commonController.getClientCount();
            
      out.write("\n");
      out.write("            <h1 style=\"position: absolute; left: 40%; top: 10%; width: 70%; height: 100px; \"><b>");
      out.print(registeredClients);
      out.write("</b></h1>\n");
      out.write("                    ");

                    
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--3-->\n");
      out.write("        <div style=\"position: absolute; left: 80%; top: 12%; width: 15%; height: 100px; background-color: rgba(255, 128, 0, 0.5)\">\n");
      out.write("            <h3 style=\"position: absolute; left: 30%; top: 4%; width: 70%; height: 100px; \">Cheques dated</br> for today</h3>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"position: absolute; left: 80%; top: 12%; width: 4%; height: 100px; background-color: rgba(255, 128, 0, 0.5)\"></div>\n");
      out.write("\n");
      out.write("        <!--4-->\n");
      out.write("\n");
      out.write("        ");

            ResultSet rset = userController.getAllUsers();
            int i = 0;
        
      out.write("\n");
      out.write("        <div style=\"position: absolute; left: 20%; top: 35%; width: 30%; height: 40%; background-color: rgba(153, 204, 255, 0.5)\">\n");
      out.write("            <table class=\"table table-striped table-dark\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">#</th>\n");
      out.write("                        <th scope=\"col\">User Name</th>\n");
      out.write("                        <th scope=\"col\">Email</th>\n");
      out.write("                        <th scope=\"col\">Status</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        while (rset.next()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">");
      out.print( ++i);
      out.write("</th>\n");
      out.write("                        <td>");
      out.print(rset.getString("user_name"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rset.getString("user_email"));
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            ");

                                if (rset.getInt("user_status") == 1) {
                            
      out.write("\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" value=\"ACTIVE\" style=\"width: 120px\" >\n");
      out.write("                            ");

                            } else if (rset.getInt("user_status") == 0) {
                            
      out.write("\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"INACTIVE\" style=\"width: 120px\" >\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <!--5-->\n");
      out.write("        <div style=\"position: absolute; left: 55%; top: 35%; width: 30%; height: 40%; background-color: #cc0033\">\n");
      out.write("            <table class=\"table table-striped table-dark\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">#</th>\n");
      out.write("                        <th scope=\"col\">Cheque No</th>\n");
      out.write("                        <th scope=\"col\">Date</th>\n");
      out.write("                        <th scope=\"col\">Status</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">1</th>\n");
      out.write("                        <td>3215</td>\n");
      out.write("                        <td>2020/10/10</td>\n");
      out.write("                        <td>Pending</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <!--6-->\n");
      out.write("        <div style=\"position: absolute; left: 40%; top: 15%; width: 20%; height: 15px\"></div>\n");
      out.write("        <!--7-->\n");
      out.write("        <div style=\"position: absolute; left: 40%; top: 15%; width: 20%; height: 15px\"></div>\n");
      out.write("        <!--8-->\n");
      out.write("        <div style=\"position: absolute; left: 40%; top: 15%; width: 20%; height: 15px\"></div>\n");
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