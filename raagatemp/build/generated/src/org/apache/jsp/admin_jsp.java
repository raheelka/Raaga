package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("@import url(styles.css);\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body><table><tr><td><br><br><br><br><br><br><br><br><br></tr></table>\n");
      out.write("\n");
      out.write("<table border=\"1\" >\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t<td>\n");
      out.write("\t\t<table border=\"1\" width=\"150\">\n");
      out.write("\n");
      out.write("\t\t\t<tr><td>\n");
      out.write("\t\t\t<label>\n");
      out.write("                            <form name=\"form1\" action=\"search\" method=\"post\">\n");
      out.write("\t\t\t<input type=\"textbox\" id=\"search\" name=\"search\" placeholder=\"search\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                             </label>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t<tr><td align=\"center\"><input type=\"submit\" id=\"submit\" name=\"submit\" value=\"SEARCH\">\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<tr><td align=\"center\"><h4><a href=\"NewReleases.html\">New Releases</a></h4></tr>\n");
      out.write("\t\t\t<tr><td align=\"center\"><h4><a href=\"LatestBollywoodSongs.html\">Latest Songs</a></h4></tr>\n");
      out.write("\n");
      out.write("\t\t\t<tr><td align=\"center\"><h4><a href=\"Retro Hits.html\">Retro Hits</a></h4></tr>\n");
      out.write("\t\t\t<tr><td align=\"center\"><h4><a href=\"OldBollywoodSongs.html\">Old Songs</a></h4></tr>\n");
      out.write("\t\t\t<tr><td align=\"center\"><h4><a href=\"Black&WhiteCollection.html\">Black & White</a></h4></tr>\n");
      out.write("\t\t\t</font>\n");
      out.write("\t\t</table>\n");
      out.write("\t</td>\n");
      out.write("\n");
      out.write("\t<td valign=\"top\">\n");
      out.write("\n");
      out.write("\t\t<table border=\"1\" width=\"670\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("<ul id=\"qm0\" class=\"qmmc\">\n");
      out.write("\n");
      out.write("\t<li><a href=\"newhome.html\"><b>HOME</b></a></li>\n");
      out.write("\t<li><span class=\"qmdivider qmdividery\" ></span></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<li><a class=\"qmparent\" href=\"javascript:void(0)\">ARTISTS</a>\n");
      out.write("\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t<li><a href=\"javascript:void(0)\">ATIF ASLAM</a></li>\n");
      out.write("\t\t<li><a href=\"javascript:void(0);\">JAL</a></li>\n");
      out.write("\t\t</ul></li>\n");
      out.write("\n");
      out.write("\t<li><span class=\"qmdivider qmdividery\" ></span></li>\n");
      out.write("\t<li><a class=\"qmparent\" href=\"javascript:void(0)\">TYPE</a>\n");
      out.write("\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t<li><a href=\"javascript:void(0)\">SAD</a>\n");
      out.write("\t\t</ul></li>\n");
      out.write("<li><span class=\"qmdivider qmdividery\" ></span></li>\n");
      out.write("                <li><a href=\"loginmod.html\"><b>BUY</b></a></li>\n");
      out.write("\t<li><span class=\"qmdivider qmdividery\" ></span></li>\n");
      out.write("\n");
      out.write("\t<li><a class=\"qmparent\" href=\"javascript:void(0);\">CONTACT US</a>\n");
      out.write("\n");
      out.write("\t\t<ul style=\"width:150px;\">\n");
      out.write("\t\t<li><a href=\"javascript:void(0);\">ABOUT RAAGA</a></li>\n");
      out.write("\t\t<li><a href=\"javascript:void(0);\">DEVELOPERS</a></li>\n");
      out.write("\t\t</ul></li>\n");
      out.write("                <li><span class=\"qmdivider qmdividery\" ></span></li>\n");
      out.write("\n");
      out.write("\t<li><a href=\"logout\"><b>LOGOUT</b></a></li>\n");
      out.write("\t<li><span class=\"qmdivider qmdividery\" ></span></li>\n");
      out.write("\n");
      out.write("<li class=\"qmclear\">&nbsp;</li></ul>\n");
      out.write("\n");
      out.write("<!-- Create Menu Settings: (Menu ID, Is Vertical, Show Timer, Hide Timer, On Click ('all' or 'lev2'), Right to Left, Horizontal Subs, Flush Left, Flush Top) -->\n");
      out.write("<script type=\"text/javascript\">qm_create(0,true,0,250,false,false,false,false,false);</script>\n");
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("<tr><td><br><br><br><br></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("        <form name=\"update\" method =\"post\">\n");
      out.write("            <td align=\"center\">\n");
      out.write("          <table>\n");
      out.write("<center>              <tr><td><h2>WELCOME ADMIN!!!!!</h2>\n");
      out.write("           <tr><td valign=\"center\"> <a href =\"music.jsp\"> <input type =\"button\" value =\" Add To Music Table\" name=\"umusic\"></a></tr>\n");
      out.write("            <tr><td valign=\"center\"><a href =\"userdetails.jsp\"><input type =\"button\" value =\" Delete from User Table\" name =\"uuserdet\"></a></tr>\n");
      out.write("           <tr><td valign=\"center\"> <a href =\"delmusic.jsp\"> <input type =\"button\" value =\" Delete from Music Table\" name=\"umusic\"></a></tr>\n");
      out.write("        </form>\n");
      out.write("</center>\n");
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
