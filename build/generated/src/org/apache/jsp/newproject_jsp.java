package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Startup.Database;
import java.sql.ResultSet;

public final class newproject_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
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
      out.write("                        <h3>Start your project here!</h3>\n");
      out.write("                        <h5 class=\"light text-lighten-3\" style=\"color: var(--color-errie-black)\">Explain your project to community...</h5>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section_one center-align\">\n");
      out.write("            <h2>What is Startup</h2>\n");
      out.write("            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section_one center-align\">\n");
      out.write("            <h3>What projects you can get funds</h3>\n");
      out.write("            <div class=\"row content_margin\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <img class=\"responsive-img\" src=\"img/img1.jpg\" style=\"opacity: 0.8\">\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <h5>Arts</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row content_margin\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <h5>Games</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <img class=\"responsive-img\" src=\"img/img1.jpg\" style=\"opacity: 0.8\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row content_margin\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <img class=\"responsive-img\" src=\"img/img1.jpg\" style=\"opacity: 0.8\">\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <h5>Films</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row content_margin\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <h5>Craft</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <img class=\"responsive-img\" src=\"img/img1.jpg\" style=\"opacity: 0.8\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row content_margin\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <img class=\"responsive-img\" src=\"img/img1.jpg\" style=\"opacity: 0.8\">\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <h5>Charity</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row content_margin\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <h5>Other</h5>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col s6\">\n");
      out.write("                        <img class=\"responsive-img\" src=\"img/img1.jpg\" style=\"opacity: 0.8\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"start_project_section\">\n");
      out.write("            <h3 class=\"center-align\">Start Now, your project</h3>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form action=\"NewProject\" method=\"POST\">\n");
      out.write("                    <h6>Personal</h6>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <input id=\"first_name\" type=\"text\" class=\"validate\" name=\"first_name\" disabled=\"true\">\n");
      out.write("                                <label for=\"first_name\">First Name</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <input id=\"last_name\" type=\"text\" class=\"validate\" name=\"last_name\" disabled=\"true\">\n");
      out.write("                                <label for=\"last_name\">Last Name</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <input id=\"email\" type=\"email\" class=\"validate\" name=\"email\" disabled=\"true\">\n");
      out.write("                                <label for=\"email\">Email</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <input id=\"country\" type=\"text\" class=\"validate\" name=\"country\" disabled=\"true\">\n");
      out.write("                                <label for=\"country\">Country</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <h6>Company or Institution</h6>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <input id=\"companyName\" type=\"text\" class=\"validate\" name=\"companyname\">\n");
      out.write("                            <label for=\"company_name\">Company Name</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <input id=\"position\" type=\"text\" class=\"validate\" name=\"position\">\n");
      out.write("                            <label for=\"position\">Position</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <select name=\"cSize\">\n");
      out.write("                                <option value=\"\" disabled selected>Company/ Team Size</option>\n");
      out.write("                                <option value=\"1\"><5</option>\n");
      out.write("                                <option value=\"2\">5 - 20</option>\n");
      out.write("                                <option value=\"3\">20+</option>\n");
      out.write("                            </select>\n");
      out.write("                            <label>Company/ Team Size</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <h6>Project</h6>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <input id=\"projectname\" type=\"text\" class=\"validate\" name=\"projectname\">\n");
      out.write("                            <label for=\"projectname\">Project Name</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <input id=\"website\" type=\"text\" class=\"validate\" name=\"website\">\n");
      out.write("                            <label for=\"website\">Project Website</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <input id=\"video\" type=\"text\" class=\"validate\" name=\"video\">\n");
      out.write("                            <label for=\"video\">Project Video</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <input id=\"buildlink\" type=\"text\" class=\"validate\" name=\"buildlink\">\n");
      out.write("                            <label for=\"buildlink\">Link to project build</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <select name=\"pType\">\n");
      out.write("                                <option value=\"\" disabled selected>Project Type</option>\n");
      out.write("                                ");

                                    ResultSet rs2 = Database.getData("SELECT int_id, int_name FROM Intrest");
                                    while (rs2.next()) {
                                        out.print("<option value=" + rs2.getString("int_id") + ">" + rs2.getString("int_name") + "</option>");
                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <label>Project Type</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <textarea id=\"projectdescription\" class=\"materialize-textarea\" name=\"projectdescription\"></textarea>\n");
      out.write("                            <label for=\"projectdescription\">Describe your project briefly</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <textarea id=\"plan\" class=\"materialize-textarea\" name=\"plan\"></textarea>\n");
      out.write("                            <label for=\"plan\">Describe your next plan</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <h6>Funding</h6>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <input id=\"fundAmount\" type=\"number\" class=\"validate\" name=\"fundAmount\">\n");
      out.write("                            <label for=\"fundAmount\">How much funding are you requesting?</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <textarea id=\"whatyouplantodo\" class=\"materialize-textarea\" name=\"whatyouplantodo\"></textarea>\n");
      out.write("                            <label for=\"whatyouplantodo\">What you plan to do</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <h6>Material Request</h6>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <textarea id=\"whatyourequest\" class=\"materialize-textarea\" name=\"whatyourequest\"></textarea>\n");
      out.write("                            <label for=\"whatyourequest\">What you request</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <p>\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"filled-in\" id=\"company\" onclick=\"chekIsChecked()\"/>\n");
      out.write("                                    <span>My project is at or beyond the prototype phase</span>\n");
      out.write("                                </label>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <p>\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"filled-in\" id=\"company\" onclick=\"chekIsChecked()\"/>\n");
      out.write("                                    <span>I like to share my milestones with a community</span>\n");
      out.write("                                </label>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col s3\">\n");
      out.write("                            <div class=\"form-field\">\n");
      out.write("                                <button class=\"waves-effect waves-light btn btn-large\">SUBMIT</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col s2\">\n");
      out.write("                            <a class=\"waves-effect waves-light btn btn-large\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\">RESET</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form> \n");
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
      out.write("                                        function chekIsChecked() {\n");
      out.write("                                            if (document.getElementById('company').checked) {\n");
      out.write("                                                alert(\"checked\");\n");
      out.write("                                            } else {\n");
      out.write("                                                alert(\"You didn't check it! Let me check it for you.\");\n");
      out.write("                                            }\n");
      out.write("                                        }\n");
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
