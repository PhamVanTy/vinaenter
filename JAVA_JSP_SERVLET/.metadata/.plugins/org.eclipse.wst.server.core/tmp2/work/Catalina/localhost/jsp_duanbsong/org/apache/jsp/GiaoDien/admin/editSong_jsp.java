/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-02-15 13:01:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.GiaoDien.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.bean.Songs;
import model.bean.Categories;
import java.util.ArrayList;
import model.dao.CatergoriesDAO;
import model.bean.Users;

public final class editSong_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/GiaoDien/admin/inc/leftbar.jsp", Long.valueOf(1676452649343L));
    _jspx_dependants.put("/GiaoDien/admin/inc/header.jsp", Long.valueOf(1676299642896L));
    _jspx_dependants.put("/GiaoDien/admin/inc/footer.jsp", Long.valueOf(1676032827784L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.bean.Users");
    _jspx_imports_classes.add("model.bean.Categories");
    _jspx_imports_classes.add("model.bean.Songs");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("model.dao.CatergoriesDAO");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>AdminCP | VinaEnter Edu</title>\r\n");
      out.write("    <!-- BOOTSTRAP STYLES-->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- FONTAWESOME STYLES-->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- CUSTOM STYLES-->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/css/custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- GOOGLE FONTS-->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/trang-chu\">VinaEnter Edu</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

            	Users userLogin = (Users) session.getAttribute("userLogin");
            	if(userLogin != null){
            
      out.write("<div style=\"color: white;padding: 15px 50px 5px 50px;float: right;font-size: 16px;\"> Xin chào, <b>");
      out.print(userLogin.getFullname());
      out.write("</b> &nbsp; <a href=\"");
      out.print(request.getContextPath());
      out.write("/logout\" class=\"btn btn-danger square-btn-adjust\">Đăng xuất</a> </div>\r\n");
      out.write("       		");
}else { 
      out.write("<div style=\"color: white;padding: 15px 50px 5px 50px;float: right;font-size: 16px;\"> Xin chào, <b>khách</b> &nbsp; <a href=\"");
      out.print(request.getContextPath());
      out.write("/login\" class=\"btn btn-danger square-btn-adjust\">Đăng nhập</a> </div>\r\n");
      out.write("       		");
} 
      out.write("</nav>\r\n");
      out.write("        <!-- /. NAV TOP  -->");
      out.write("<nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("    <div class=\"sidebar-collapse\">\r\n");
      out.write("        <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("            <li class=\"text-center\">\r\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/img/find_user.png\" class=\"user-image img-responsive\" />\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a id=\"index\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/trang-chu\"><i class=\"fa fa-dashboard fa-3x\"></i> Trang chủ</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a id=\"category\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/cats\"><i class=\"fa fa-list fa-3x\"></i> Quản lý danh mục</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a id=\"song\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/songs\"><i class=\"fa fa-music fa-3x\"></i> Quản lý bài hát</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a id=\"user\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/users\"><i class=\"fa fa-user fa-3x\"></i> Quản lý người dùng</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a id=\"contact\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/contacts\"><i class=\"fa fa-envelope fa-3x\"></i> Quản lý liên hệ</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- /. NAV SIDE  -->");
      out.write("<div id=\"page-wrapper\">\r\n");
      out.write("    <div id=\"page-inner\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <h2>Sửa bài hát</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /. ROW  -->\r\n");
      out.write("        <hr />\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <!-- Form Elements -->\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <form action=\"\" role=\"form\" method=\"post\" enctype=\"multipart/form-data\" id=\"form\">\r\n");
      out.write("                                  ");

                                  String error = request.getParameter("error");
									if("1".equals(error)){
										out.print("<p style=\"color: red;\">Có lỗi khi sữa.</p>");
									}									
									String name = request.getParameter("name");
                                 	String cat = request.getParameter("category");                               
                                 	String preview = request.getParameter("preview");
                         			String detail = request.getParameter("detail");
									String picture = "";
                         			Songs objS = (Songs)request.getAttribute("objs");
                         			ArrayList<Categories> list = (ArrayList<Categories>)request.getAttribute("listCat");
                                  	if(objS != null){
                                  		name = objS.getSongName();
                                  		cat = String.valueOf(objS.getId_cat());
                                  		preview = objS.getPreview_text();
                                  		picture = objS.getPicture();
                                  		detail = objS.getDetail_text();
                                  	}
                                  
      out.write("<div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"name\">Tên bài hát</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"name\" value=\"");
if(name != null) out.print(name); 
      out.write("\" name=\"name\" class=\"form-control\" />\r\n");
      out.write("                                    </div>     \r\n");
      out.write("                                                                \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"category\">Thể loại nhạc</label>\r\n");
      out.write("                                        <select id=\"category\" name=\"category\" class=\"form-control\">                                    \r\n");
      out.write("                                      ");
                                   	                                                                             		
                                        for(Categories obj : list){                                          			
                                  	 
      out.write("<option ");
if(cat != null && cat.equals(String.valueOf(obj.getIdCat()))) out.print("selected"); 
      out.write("  value=\"");
      out.print(obj.getIdCat());
      out.write('"');
      out.write('>');
      out.print(obj.getCatName());
      out.write("</option> \r\n");
      out.write("                                        	");
}
      out.write("</select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"picture\">Hình ảnh</label>\r\n");
      out.write("                                        ");
 if(!picture.isEmpty()){ 
      out.write("<img alt=\"\" src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/img/");
      out.print(picture);
      out.write("\" width=\"200\" height=\"215\">\r\n");
      out.write("                                        ");
} 
      out.write("<input value=\"\" type=\"file\" name=\"picture\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"preview\">Mô tả</label>\r\n");
      out.write("                                        <textarea id=\"preview\" class=\"form-control\" rows=\"3\" name=\"preview\">");
if(preview != null) out.print(preview); 
      out.write("</textarea>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"detail\">Chi tiết</label>\r\n");
      out.write("                                        <textarea id=\"detail\" class=\"form-control ckeditor\" id=\"detail\" rows=\"5\" name=\"detail\">");
if(detail != null) out.print(detail); 
      out.write("</textarea>\r\n");
      out.write("                                    </div>                                 \r\n");
      out.write("                                    <button type=\"submit\" name=\"submit\" class=\"btn btn-success btn-md\">Lưu</button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End Form Elements -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /. ROW  -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /. PAGE INNER  -->\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    document.getElementById(\"song\").classList.add('active-menu');\r\n");
      out.write("</script>\r\n");
      out.write("<!-- /. PAGE WRAPPER  -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /. WRAPPER  -->\r\n");
      out.write("<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\r\n");
      out.write("<!-- JQUERY -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/js/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/js/validate_admin.js\"></script>\r\n");
      out.write("<!-- BOOTSTRAP SCRIPTS -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- METISMENU SCRIPTS -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- CUSTOM SCRIPTS -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/GiaoDien/admin/assets/js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
