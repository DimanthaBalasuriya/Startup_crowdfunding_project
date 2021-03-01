package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Startup.Database;
import java.sql.ResultSet;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("        </ul\n");
      out.write("\n");
      out.write("        ");

            HttpSession ses = request.getSession();
            String user = ses.getAttribute("user").toString();

            String name = "";
            String email = "";
            String country = "";
            String password = "";
            String description = "";
            String bnkNumber = "";
            String bank = "";

            ResultSet rs = Database.getData("SELECT `use_name`, `use_description`, `use_email`, `use_password`, `use_bank_account_no`, `use_country`, `use_bank` FROM `startup_new_version`.`user` WHERE user.use_id = '" + user + "'");
            if (rs.next()) {
                name = rs.getString("use_name");
                email = rs.getString("use_email");
                country = rs.getString("use_country");
                password = rs.getString("use_password");
                description = rs.getString("use_description");
                bnkNumber = rs.getString("use_bank_account_no");
                bank = rs.getString("use_bank");
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"account_section\">\n");
      out.write("            <div class=\"basic_account_section\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col s6\">\n");
      out.write("                                <h5>Account Details</h5>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <form class=\"col s12\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"input-field col s12\">\n");
      out.write("                                                <input placeholder=\"\" id=\"name\" type=\"text\" class=\"validate\" id=\"state\" value=\"");
      out.print(name);
      out.write("\" disabled=\"true\">\n");
      out.write("                                                <label for=\"name\">Name</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"input-field col s12\">\n");
      out.write("                                                <input placeholder=\"\" id=\"country\" type=\"text\" class=\"validate\" id=\"state\" value=\"");
      out.print(country);
      out.write("\" disabled=\"true\">\n");
      out.write("                                                <label for=\"country\">Country</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"input-field col s12\">\n");
      out.write("                                                <textarea id=\"textarea2\" class=\"materialize-textarea\" data-length=\"120\" placeholder=\"\" disabled=\"true\">");
      out.print(description);
      out.write("</textarea>\n");
      out.write("                                                <label for=\"textarea2\">About Me</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"input-field col s12\">\n");
      out.write("                                                <input placeholder=\"\" id=\"email\" type=\"email\" class=\"validate\" id=\"state\" value=\"");
      out.print(email);
      out.write("\" disabled=\"true\">\n");
      out.write("                                                <label for=\"email\">Email</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"input-field col s12\">\n");
      out.write("                                                <input placeholder=\"\" id=\"password\" type=\"password\" class=\"validate\" id=\"state\" value=\"");
      out.print(password);
      out.write("\" disabled=\"true\">\n");
      out.write("                                                <label for=\"password\">Password</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <a class=\"waves-effect waves-light btn\">Edit</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <a class=\"waves-effect waves-light btn\">Submit</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col s6\">\n");
      out.write("                                <h5>Bank details</h5>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"input-field col s12\">\n");
      out.write("                                        <select>\n");
      out.write("                                            <option value=\"\"  selected disabled=\"true\">Choose your country</option>\n");
      out.write("                                            ");

                                                ResultSet rs1 = Database.getData("SELECT cou_name, cou_id FROM Country");
                                                while (rs1.next()) {
                                                    out.print("<option value=" + rs1.getString("cou_id") + ">" + rs1.getString("cou_name") + "</option>");
                                                }
                                            
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                        <label>Materialize Select</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"input-field col s12\">\n");
      out.write("                                        <select>\n");
      out.write("                                            <option value=\"");
      out.print(bank);
      out.write("\"  selected>Choose your Bank</option>\n");
      out.write("                                            ");

                                                ResultSet rs2 = Database.getData("SELECT bnk_name, bnk_id FROM Bank");
                                                while (rs2.next()) {
                                                    out.print("<option value=" + rs2.getString("bnk_id") + ">" + rs2.getString("bnk_name") + "</option>");
                                                }
                                            
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                        <label>Materialize Select</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"input-field col s12\">\n");
      out.write("                                        <input placeholder=\"\" id=\"bankANumber\" type=\"text\" class=\"validate\" value=\"");
      out.print(bnkNumber);
      out.write("\"  disabled=\"true\">\n");
      out.write("                                        <label for=\"bankANumber\">Bank Account Number</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col s6\">\n");
      out.write("                                <h6>Your Interest</h6>\n");
      out.write("                                <table class=\"responsive-table highlight\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Categories</th>\n");
      out.write("                                            <th>Interest score</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");

                                            ResultSet rs3 = Database.getData("SELECT `intrest`.`int_name`, `intrest`.`int_presentatge` FROM `startup_new_version`.`user_interest` INNER JOIN `startup_new_version`.`user` ON (`user_interest`.`use_id` = `user`.`use_id`) INNER JOIN `startup_new_version`.`intrest` ON (`user_interest`.`int_id` = `intrest`.`int_id`) WHERE user.use_id='" + user + "'");
                                            while (rs3.next()) {
                                                out.print("<tr><td>" + rs3.getString("int_name") + "</td><td>" + rs3.getString("int_presentatge") + "</td></tr>");
                                            }
                                        
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                                <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px;\">Add more</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col s6\">\n");
      out.write("                                <h6>Delete Account</h6>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"input-field col s12\">\n");
      out.write("                                        <input placeholder=\"\" id=\"Please enter \\'Delete Account\\' to confirm deletion\" type=\"text\" class=\"validate\">\n");
      out.write("                                        <label for=\"confim_del\">Confirm Delete Account (to confirm type 'confirm') </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a class=\"waves-effect waves-light btn\">Delete</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                    <h5>Project Details</h5>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col s6\">\n");
      out.write("                            <h6>Funded Project</h6>\n");
      out.write("                            <table class=\"responsive-table highlight\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>Date</th>\n");
      out.write("                                        <th>Time</th>\n");
      out.write("                                        <th>Amount</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

                                        ResultSet rs5 = Database.getData("SELECT `project`.`prg_name`, `bakedproject`.`bap_amount`, `bakedproject`.`bap_date`, `bakedproject`.`bap_time` FROM `startup_new_version`.`bakedproject` INNER JOIN `startup_new_version`.`project` ON (`bakedproject`.`prg_id` = `project`.`prg_id`) INNER JOIN `startup_new_version`.`user` ON (`project`.`use_id` = `user`.`use_id`) AND (`bakedproject`.`use_id` = `user`.`use_id`) WHERE user.`use_id` = '" + user + "'");
                                        if (rs5.next()) {
                                            out.print("<tr><td>" + rs5.getString("prg_name") + "</td><td>" + rs5.getString("bap_date") + "</td><td>" + rs5.getString("bap_time") + "</td><td>" + rs5.getString("bap_amount") + "</td></td>");
                                        }
                                    
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col s6\">\n");
      out.write("                            <h6>Your Projects</h6>\n");
      out.write("                            <table class=\"responsive-table highlight\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>List</th>\n");
      out.write("                                        <th>Funding</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

                                        ResultSet rs4 = Database.getData("SELECT `prg_name`, `prg_date`, `prg_exp_funding` FROM `startup_new_version`.`project` WHERE `project`.`use_id` = '" + user + "'");
                                        while (rs4.next()) {
                                            out.print("<tr><td>" + rs4.getString("prg_name") + "</td><td>" + rs4.getString("prg_date") + "</td><td>" + rs4.getString("prg_exp_funding") + "</td></tr>");
                                        }
                                    
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                    <h5>Your Activities</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"Logout\" method=\"POST\">\n");
      out.write("            <div class=\"form-field\">\n");
      out.write("                <button class=\"btn-large waves-effect waves-dark\" style=\"width:100%;\">Log Out</button>\n");
      out.write("            </div><br>\n");
      out.write("        </form>\n");
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
