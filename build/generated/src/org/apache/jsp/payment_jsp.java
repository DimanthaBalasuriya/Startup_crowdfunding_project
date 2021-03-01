package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Shippori+Mincho&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/materialize.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/materialize.min.css\">\n");
      out.write("        <link href=\"css/Style.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Startup</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"msg_area\">\n");
      out.write("            <p>This site is under development!</p>\n");
      out.write("        </div>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-wrapper\">\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\" class=\"brand-logo center\">Startup.</a>\n");
      out.write("                <ul id=\"nav-mobile\" class=\"left hide-on-med-and-down\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/NewProject\">Start a Campaing</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"right\">\n");
      out.write("                    <li class=\"hide-on-med-and-down\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Explore\">Explore</a></li>\n");
      out.write("                    <a href=\"#\" data-target=\"slide-out\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <ul id=\"slide-out\" class=\"sidenav amber\">\n");
      out.write("            <li><a class=\"subheader\" style=\"font-size: 20px; margin-top: 20px; color: var(--color-errie-black);\">Lets Explore</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-green active\" style=\"font-size: 16px; margin-top: 16px; color: var(--color-errie-black);\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/NewProject\">Start a Campaing</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-green\" style=\"font-size: 16px; margin-top: 16px; color: var(--color-errie-black);\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Explore\">Explore</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-green\" style=\"font-size: 16px; margin-top: 16px; color: var(--color-errie-black);\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/profile\">Profile</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-green\" style=\"font-size: 16px; margin-top: 16px; color: var(--color-errie-black);\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/About\">About</a></li>\n");
      out.write("            <li><a class=\"waves-effect waves-green\" style=\"font-size: 16px; margin-top: 16px; color: var(--color-errie-black);\" href=\"#\">Search</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div class=\"payment_area\">\n");
      out.write("            <h1>\n");
      out.write("                ");

                    String project = request.getParameter("pid");
                    String amount = request.getParameter("pAM");
                
      out.write("\n");
      out.write("            </h1>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                    <h1>Your Investment</h1>\n");
      out.write("                    <form action=\"Payment\" method=\"POST\">\n");
      out.write("                        <div class=\"form-field\">\n");
      out.write("                            <label for=\"investment\">Backer Investment</label>\n");
      out.write("                            <input id=\"investment\" type=\"number\" class=\"validate\" valid=\"investment\" name=\"investment\" value=");
      out.print(amount);
      out.write(">\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"hidden\" name=\"proj\" value=");
      out.print(project);
      out.write(">\n");
      out.write("                        <div class=\"form-field\">\n");
      out.write("                            <button class=\"btn-large waves-effect waves-dark\" style=\"width:100%;\">Invest</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"page-footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col l6 s12\">\n");
      out.write("                        <h5 class=\"white-text\">Startup</h5>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col l4 offset-l2 s12\">\n");
      out.write("                        <h5 class=\"white-text\">Links</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Forum</a></li>\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Blog</a></li>\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"legal.html\">Legal</a></li>\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Report</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    © 2021 Startup.inc\n");
      out.write("                    <a class=\"grey-text text-lighten-3 right\" href=\"#!\"><i class=\"material-icons\">facebook</i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"js/materialize.js \"></script>\n");
      out.write("        <script src=\"js/materialize.min.js \"></script>\n");
      out.write("        <script src=\"js/main.js \"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
