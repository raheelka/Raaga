package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <style>\n");
      out.write("@import url(newstyle.css);\n");
      out.write("h4{font-family: Calligrapher;\n");
      out.write("color:#753A00;\n");
      out.write("size:15;\n");
      out.write("font-face: Calligrapher;\n");
      out.write("text-decoration:none;}\n");
      out.write("a:link {text-decoration: none; color:#753A00}\n");
      out.write("a:visited {text-decoration: none;}\n");
      out.write("a:hover {text-decoration: underline;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("             function ischeck()\n");
      out.write("            {\n");
      out.write("                sname = document.getElementById(\"sname\").value;\n");
      out.write("                artist = document.getElementById(\"artist\").value;\n");
      out.write("                type = document.getElementById(\"type\").value;\n");
      out.write("                price = document.getElementById(\"price\").value;\n");
      out.write("                imageid = document.getElementById(\"imageid\").value;                \n");
      out.write("         if(sname ==\"\" || artist ==\"\"|| type ==\"\" || price ==\"\" || imageid ==\"\")\n");
      out.write("                       alert(\"Please Fill In The Details\");\n");
      out.write("                   else\n");
      out.write("                       document.music.submit();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        <form name =\"music\" method =\"post\" action=\"music\">\n");
      out.write("            <center>\n");
      out.write("                <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h4>Song name :</h4></td>\n");
      out.write("                    <td><input type =\"text\" name =\"sname\" id =\"sname\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h4>Artist :</h4></td>\n");
      out.write("                    <td><input type =\"text\" name =\"artist\" id =\"artist\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h4>Song Type :</h4></td>\n");
      out.write("                    <td><input type =\"text\" name =\"type\" id =\"type\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h4>Price :</h4></td>\n");
      out.write("                    <td><input type =\"text\" name =\"price\" id =\"price\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h4>Image Id :</h4></td>\n");
      out.write("                    <td><input type =\"text\" name =\"imageid\" id =\"imageid\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><h4><input type=\"button\" onclick=\"ischeck();\" value=\"Add\"  size =\"30\"/></h4></td>\n");
      out.write("                </tr>\n");
      out.write("      \n");
      out.write("         </table>\n");
      out.write("        </form>\n");
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
