package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class explore_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_data_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_data_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_data_forEach_var_items.release();
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
      out.write("        <div class=\"collapsible_section\">\n");
      out.write("            <h5>Explore  by your intrest</h5>\n");
      out.write("            <ul class=\"collapsible\">\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">PC Games</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Mobile Games</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Short Films</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Music Video</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Songs</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Entrepreneur</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Innovation</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Food Product</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Accessibility Products</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Charity</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"collapsible-header\" style=\"font-size: 20px;\">Other</div>\n");
      out.write("                    <div class=\"collapsible-body\">\n");
      out.write("                        <div class=\"row \">\n");
      out.write("                            ");
      if (_jspx_meth_data_forEach_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
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

  private boolean _jspx_meth_data_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_0.setParent(null);
    _jspx_th_data_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_0.setVar("project");
    int[] _jspx_push_body_count_data_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_0 = _jspx_th_data_forEach_0.doStartTag();
      if (_jspx_eval_data_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_0.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_1.setParent(null);
    _jspx_th_data_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_1.setVar("project");
    int[] _jspx_push_body_count_data_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_1 = _jspx_th_data_forEach_1.doStartTag();
      if (_jspx_eval_data_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_1.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_2.setParent(null);
    _jspx_th_data_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_2.setVar("project");
    int[] _jspx_push_body_count_data_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_2 = _jspx_th_data_forEach_2.doStartTag();
      if (_jspx_eval_data_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_2.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_3.setParent(null);
    _jspx_th_data_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_3.setVar("project");
    int[] _jspx_push_body_count_data_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_3 = _jspx_th_data_forEach_3.doStartTag();
      if (_jspx_eval_data_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_3.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_4.setParent(null);
    _jspx_th_data_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_4.setVar("project");
    int[] _jspx_push_body_count_data_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_4 = _jspx_th_data_forEach_4.doStartTag();
      if (_jspx_eval_data_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_4.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_5.setParent(null);
    _jspx_th_data_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_5.setVar("project");
    int[] _jspx_push_body_count_data_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_5 = _jspx_th_data_forEach_5.doStartTag();
      if (_jspx_eval_data_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_5.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_6.setParent(null);
    _jspx_th_data_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_6.setVar("project");
    int[] _jspx_push_body_count_data_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_6 = _jspx_th_data_forEach_6.doStartTag();
      if (_jspx_eval_data_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_6.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_7.setParent(null);
    _jspx_th_data_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_7.setVar("project");
    int[] _jspx_push_body_count_data_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_7 = _jspx_th_data_forEach_7.doStartTag();
      if (_jspx_eval_data_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_7.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_7);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_8.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_8.setParent(null);
    _jspx_th_data_forEach_8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_8.setVar("project");
    int[] _jspx_push_body_count_data_forEach_8 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_8 = _jspx_th_data_forEach_8.doStartTag();
      if (_jspx_eval_data_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_8.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_8);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_9.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_9.setParent(null);
    _jspx_th_data_forEach_9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_9.setVar("project");
    int[] _jspx_push_body_count_data_forEach_9 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_9 = _jspx_th_data_forEach_9.doStartTag();
      if (_jspx_eval_data_forEach_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_9.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_9);
    }
    return false;
  }

  private boolean _jspx_meth_data_forEach_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  data:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_data_forEach_10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_data_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_data_forEach_10.setPageContext(_jspx_page_context);
    _jspx_th_data_forEach_10.setParent(null);
    _jspx_th_data_forEach_10.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_data_forEach_10.setVar("project");
    int[] _jspx_push_body_count_data_forEach_10 = new int[] { 0 };
    try {
      int _jspx_eval_data_forEach_10 = _jspx_th_data_forEach_10.doStartTag();
      if (_jspx_eval_data_forEach_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col s12 m3 \">\n");
          out.write("                                    <div class=\"card \">\n");
          out.write("                                        <div class=\"card-image \">\n");
          out.write("                                            <img src=\"img/banner2.jpg \">\n");
          out.write("                                            <span class=\"card-title \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"card-content \">\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a class=\"waves-effect waves-light btn\" style=\"margin-top: 10px; background-color: var(--color-pumpkin);\" href=project.jsp?project=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${project.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">OPEN</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_data_forEach_10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_data_forEach_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_data_forEach_10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_data_forEach_10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_data_forEach_10.doFinally();
      _jspx_tagPool_data_forEach_var_items.reuse(_jspx_th_data_forEach_10);
    }
    return false;
  }
}
