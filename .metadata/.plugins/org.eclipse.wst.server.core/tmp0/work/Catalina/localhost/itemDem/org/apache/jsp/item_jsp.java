/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-05-14 05:09:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- External stylesheet link -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/item.css\">\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Logo and Brand Name -->\r\n");
      out.write("	<img src=\"images\\logo.png\" class=\"logo\">\r\n");
      out.write("\r\n");
      out.write("	<h1 class=\"logo_topic\">FreshCraze</h1>\r\n");
      out.write("\r\n");
      out.write("	<!-- Navigation Bar -->\r\n");
      out.write("	<nav class=\"navbar\">\r\n");
      out.write("		<a href=\"index.jsp\">Home</a> <a href=\"register.jsp\">Sign Up</a> <a\r\n");
      out.write("			href=\"mainLogin.jsp\">Sign In</a> <a href=\"item.jsp\">Product</a> <a\r\n");
      out.write("			href=\"about.jsp\">About Us</a> <a href=\"mainLogin.jsp\">FAQs</a> <span></span>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("	<hr class=\"topic_line\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Item Categories Section -->\r\n");
      out.write("	<div class=\"small-container\">\r\n");
      out.write("		<h2 class=\"title\">Beverages</h2>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/bottle.jpeg\">\r\n");
      out.write("				<h4>Water Bottle</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.50.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/coca.jpeg\">\r\n");
      out.write("				<h4>Cocacola</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.180.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/spri.jpeg\">\r\n");
      out.write("				<h4>Sprite</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.150.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/egg.jpeg\">\r\n");
      out.write("				<h4>EGB</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.160.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/milk.jpg\">\r\n");
      out.write("				<h4>Milk</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.250.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/smak.jpg\">\r\n");
      out.write("				<h4>SMAK</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.450.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/koth.jpg\">\r\n");
      out.write("				<h4>Kothmale Drink</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.50.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/oreng.jpg\">\r\n");
      out.write("				<h4>Fanta</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.480.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<h2 class=\"title\">Food Staples</h2>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/haal.jpg\">\r\n");
      out.write("				<h4>Rice</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.750.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/nood.jpg\">\r\n");
      out.write("				<h4>Noodles Pack</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.350.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/sours.jpg\">\r\n");
      out.write("				<h4>Sauce</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.500.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/papa.jpg\">\r\n");
      out.write("				<h4>Papadam</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.150.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/kopi.jpg\">\r\n");
      out.write("				<h4>Coffee</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.200.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/haalpi.jpg\">\r\n");
      out.write("				<h4>Flour</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.650.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/wi.jpg\">\r\n");
      out.write("				<h4>Curry Powder</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.100.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/kottu.jpg\">\r\n");
      out.write("				<h4>Kottu Mee</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.170.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<h2 class=\"title\">Laundry & Household</h2>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/sun.jpg\">\r\n");
      out.write("				<h4>Sunlight</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.160.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/bio.jpg\">\r\n");
      out.write("				<h4>Bio Clean</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.400.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/liq.jpg\">\r\n");
      out.write("				<h4>Liquid</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.380.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/har.jpg\">\r\n");
      out.write("				<h4>Harpic</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.580.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/deto.jpg\">\r\n");
      out.write("				<h4>Dettol</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.400.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/lif.jpg\">\r\n");
      out.write("				<h4>Lifebuoy</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.180.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/hand.jpg\">\r\n");
      out.write("				<h4>HandWash</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.450.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/koho.jpg\">\r\n");
      out.write("				<h4>Soap</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.140.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<h2 class=\"title\">Choco & Snacks</h2>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/kand.jpg\">\r\n");
      out.write("				<h4>Kandos Milk Chocolate</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.200.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/ritz.jpg\">\r\n");
      out.write("				<h4>Rugbury Choco-La</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.150.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/T.JPG\">\r\n");
      out.write("				<h4>Toblerone</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.950.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/chi.jpg\">\r\n");
      out.write("				<h4>Chit-Chat</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.50.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/kit.jpg\">\r\n");
      out.write("				<h4>KitKat</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.150.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/chan.jpg\">\r\n");
      out.write("				<h4>Chunky Choc</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.800.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/fin.jpg\">\r\n");
      out.write("				<h4>Chocolate Fingers</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.200.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<img src=\"images/sna.jpg\">\r\n");
      out.write("				<h4>Snickers</h4>\r\n");
      out.write("				<div class=\"rating\">\r\n");
      out.write("					<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\r\n");
      out.write("						class=\"fa fa-star-o\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p>Rs.300.00</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Button to display pending products -->\r\n");
      out.write("	<form action=\"displayItem\" method=\"post\">\r\n");
      out.write("		<button type=\"submit\">Pending Products...</button>\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("	<hr class=\"footer_line\">\r\n");
      out.write("	<!-- Footer Section -->\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<a href=\"link\" target=\"_blank\">\r\n");
      out.write("			<button type=\"button\" class=\"help_button\">Help and Support</button>\r\n");
      out.write("		</a>\r\n");
      out.write("\r\n");
      out.write("		<!-- Social Media Icons -->\r\n");
      out.write("		<div class=\"fb_icon\">\r\n");
      out.write("			<a href=\"https://www.facebook.com/\" target=\"_blank\"><img\r\n");
      out.write("				src=\"images/facebook.png\"></a>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"insta_icon\">\r\n");
      out.write("			<a href=\"https://www.instagram.com/\" target=\"_blank\"><img\r\n");
      out.write("				src=\"images/insta.png\"></a>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"twitt_icon\">\r\n");
      out.write("			<a href=\"https://www.twitter.com/\" target=\"_blank\"><img\r\n");
      out.write("				src=\"images/Twitter.png\"></a>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"yt_icon\">\r\n");
      out.write("			<a href=\"https://www.youtube.com/\" target=\"_blank\"><img\r\n");
      out.write("				src=\"images/yt.png\"></a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Contact Information -->\r\n");
      out.write("	<div class=\"contacts\">\r\n");
      out.write("		<h1 class=\"link\">www.freshcraze.lk</h1>\r\n");
      out.write("		<h1>Hotline: +94 225 225 25 / +94 225 225 35</h1>\r\n");
      out.write("	</div>\r\n");
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
