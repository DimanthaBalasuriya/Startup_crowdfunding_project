package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Startup.Database;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"slider\">\n");
      out.write("            <ul class=\"slides\">\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"img/banner2.jpg\" style=\"opacity: 0.6\">\n");
      out.write("                    <div class=\"caption center-align\" style=\"color: var(--color-errie-black)\">\n");
      out.write("                        <h3>Make your dream true!</h3>\n");
      out.write("                        <h5 class=\"light text-lighten-3\" style=\"color: var(--color-errie-black)\">Start Campaing today...</h5>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section_one\">\n");
      out.write("            <h4 class=\"center\">Featured Projects.</h4>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");

                    ResultSet rs1 = Database.getData("SELECT prg_id, prg_name, prg_describe_briefly, prg_video_link FROM Project");
                    while (rs1.next()) {
                        out.print("<div class='col s12 m3'>");
                        out.print("<div class='card'>");
                        out.print("<div class='card-image'>");
                        out.print("<img src='img/banner2.jpg'>");
                        out.print("<span class='card-title'>" + rs1.getString("prg_name") + "</span>");
                        out.print("</div>");
                        out.print("<div class='card-content'>");
                        out.print("<p>" + rs1.getString("prg_describe_briefly") + "</p>");
                        out.print("<a class='waves-effect waves-light btn' style='margin-top: 10px; background-color: var(--color-pumpkin);' href=project.jsp?project=" + rs1.getString("prg_id") + ">FUND</a>");
                        out.print("</div>");
                        out.print("</div>");
                        out.print("</div>");
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section_one\">\n");
      out.write("            <h4 class=\"center\">Most popular Projects.</h4>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");

                    ResultSet rs2 = Database.getData("SELECT prg_id, prg_name, prg_describe_briefly, prg_video_link FROM Project");
                    while (rs2.next()) {
                        out.print("<div class='col s12 m3'>");
                        out.print("<div class='card'>");
                        out.print("<div class='card-image'>");
                        out.print("<img src='img/banner2.jpg'>");
                        out.print("<span class='card-title'>" + rs2.getString("prg_name") + "</span>");
                        out.print("</div>");
                        out.print("<div class='card-content'>");
                        out.print("<p>" + rs2.getString("prg_describe_briefly") + "</p>");
                        out.print("<a class='waves-effect waves-light btn' style='margin-top: 10px; background-color: var(--color-pumpkin);' href=project.jsp?project=" + rs2.getString("prg_id") + ">FUND</a>");
                        out.print("</div>");
                        out.print("</div>");
                        out.print("</div>");
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section_about\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12 center \">\n");
      out.write("                    <h5 class=\"caption center\">Who We are.</h5>\n");
      out.write("                    <p class=\"center\">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ut dolores reprehenderit iusto assumenda saepe sed numquam non incidunt fugit doloribus! Reiciendis itaque doloribus excepturi eos iusto eius, odio quisquam ratione. Lorem ipsum\n");
      out.write("                        dolor sit amet consectetur adipisicing elit. Est modi ad pariatur ipsa incidunt temporibus molestiae atque tempora alias, ab consequatur eius, nostrum vero optio expedita? Corrupti quibusdam reprehenderit aliquidLorem ipsum dolor sit amet consectetur, adipisicing elit. Ut dolores reprehenderit iusto assumenda saepe sed numquam non incidunt fugit doloribus! Reiciendis itaque doloribus excepturi eos iusto eius, odio quisquam ratione. Lorem ipsum\n");
      out.write("                        dolor sit amet consectetur adipisicing elit. Est modi ad pariatur ipsa incidunt temporibus molestiae atque tempora alias, ab consequatur eius, nostrum vero optio expedita? Corrupti quibusdam reprehenderit aliquidLorem ipsum dolor sit amet consectetur, adipisicing elit. Ut dolores reprehenderit iusto assumenda saepe sed numquam non incidunt fugit doloribus! Reiciendis itaque doloribus excepturi eos iusto eius, odio quisquam ratione. Lorem ipsum\n");
      out.write("                        dolor sit amet consectetur adipisicing elit. Est modi ad pariatur ipsa incidunt temporibus molestiae atque tempora alias, ab consequatur eius, nostrum vero optio expedita? Corrupti quibusdam reprehenderit aliquid.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section_creative_team\">\n");
      out.write("            <h4 class=\"center\">Creative team...</h4>\n");
      out.write("            <p class=\"center para\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Est modi ad pariatur ipsa incidunt temporibus molestiae atque tempora alias, ab consequatur eius, nostrum vero optio expedita? Corrupti quibusdam reprehenderit aliquid?</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col sm12 m3\">\n");
      out.write("                    <div class=\"card small\">\n");
      out.write("                        <div class=\"card-image waves-effect waves-block waves-light\">\n");
      out.write("                            <img class=\"activator\" src=\"img/banner2.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <span class=\"card-title activator grey-text text-darken-4 center\" >Chamod Diyamantha</span>\n");
      out.write("                            <p class=\"center\"><a href=\"#\">CEO / CTO</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-reveal\">\n");
      out.write("                            <span class=\"card-title grey-text text-darken-4\" style=\"font-size: 20px;\">Chamod Diyamantha<i class=\"material-icons right\">close</i></span>\n");
      out.write("                            <p style=\"font-size: 16px;\">Here is some more information about this product that is only revealed once clicked on.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col sm12 m3\">\n");
      out.write("                    <div class=\"card small\">\n");
      out.write("                        <div class=\"card-image waves-effect waves-block waves-light\">\n");
      out.write("                            <img class=\"activator\" src=\"img/banner2.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <span class=\"card-title activator grey-text text-darken-4 center\">Chamod Diyamantha</span>\n");
      out.write("                            <p class=\"center\"><a href=\"#\">Designer</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-reveal\">\n");
      out.write("                            <span class=\"card-title grey-text text-darken-4\" style=\"font-size: 20px;\">Chamod Diyamantha<i class=\"material-icons right\">close</i></span>\n");
      out.write("                            <p style=\"font-size: 16px;\">Here is some more information about this product that is only revealed once clicked on.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col sm12 m3\">\n");
      out.write("                    <div class=\"card small\">\n");
      out.write("                        <div class=\"card-image waves-effect waves-block waves-light\">\n");
      out.write("                            <img class=\"activator\" src=\"img/banner2.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <span class=\"card-title activator grey-text text-darken-4 center\">Chamod Diyamantha</span>\n");
      out.write("                            <p class=\"center\"><a href=\"#\">Director</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-reveal\">\n");
      out.write("                            <span class=\"card-title grey-text text-darken-4\" style=\"font-size: 20px;\">Chamod Diyamantha<i class=\"material-icons right\">close</i></span>\n");
      out.write("                            <p style=\"font-size: 16px;\">Here is some more information about this product that is only revealed once clicked on.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col sm12 m3\">\n");
      out.write("                    <div class=\"card small\">\n");
      out.write("                        <div class=\"card-image waves-effect waves-block waves-light\">\n");
      out.write("                            <img class=\"activator\" src=\"img/banner2.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <span class=\"card-title activator grey-text text-darken-4 center\">Chamod Diyamantha</span>\n");
      out.write("                            <p class=\"center\"><a href=\"#\">PM</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-reveal\">\n");
      out.write("                            <span class=\"card-title grey-text text-darken-4\" style=\"font-size: 20px;\">Chamod Diyamantha<i class=\"material-icons right\">close</i></span>\n");
      out.write("                            <p style=\"font-size: 16px;\">Here is some more information about this product that is only revealed once clicked on.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section_one \">\n");
      out.write("            <h4 class=\"center\">Successfull Projects.</h4>\n");
      out.write("            <div class=\"row \">                \n");
      out.write("                ");

                    ResultSet rs3 = Database.getData("SELECT prg_id, prg_name, prg_describe_briefly, prg_video_link FROM Project WHERE prg_exp_funding <= prg_raised_amount");
                    while (rs3.next()) {
                        out.print("<div class='col s12 m4'>");
                        out.print("<div class='card'>");
                        out.print("<div class='card-image'>");
                        out.print("<img src='img/banner2.jpg'>");
                        out.print("<span class='card-title'>" + rs3.getString("prg_name") + "</span>");
                        out.print("</div>");
                        out.print("<div class='card-content'>");
                        out.print("<p>" + rs3.getString("prg_describe_briefly") + "</p>");
                        out.print("<a class='waves-effect waves-light btn' style='margin-top: 10px; background-color: var(--color-pumpkin);' href=project.jsp?project=" + rs3.getString("prg_id") + ">OPEN</a>");
                        out.print("</div>");
                        out.print("</div>");
                        out.print("</div>");
                    }
                
      out.write("\n");
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
