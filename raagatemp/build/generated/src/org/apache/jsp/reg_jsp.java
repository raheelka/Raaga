package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("@import url(styles.css);\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\" src=\"dropdowntabs.js\" ></script>\n");
      out.write("     <script type=\"text/javascript\">\n");
      out.write("                          \n");
      out.write("             function ischeck()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                var apos=document.login.em.value.indexOf(\"@\");\n");
      out.write("                var dotpos=document.login.em.value.lastIndexOf(\".\");\n");
      out.write("\n");
      out.write("               var s=document.getElementById(\"mobn\").value.toString();\n");
      out.write("                var flag=0;\n");
      out.write("\n");
      out.write("               //For Mobile Number\n");
      out.write("                for(var i=0;i<document.getElementById(\"mobn\").value.toString().length;i++)\n");
      out.write("                    {\n");
      out.write("                        for(var j=0;j<=9;j++)\n");
      out.write("                            if(s[i]==j)\n");
      out.write("                                flag=1;\n");
      out.write("                        if(j==10 && flag==0)\n");
      out.write("                            {\n");
      out.write("                                alert(\"Please check the mobile number\");\n");
      out.write("                                document.getElemntById(\"mobn\").focus();\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("                            flag=0;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                 //For Credit Card Number\n");
      out.write("                var t=document.getElementById(\"ccn\").value.toString();             \n");
      out.write("                var flag1 = 0;\n");
      out.write("                 for(var i=0;i<document.getElementById(\"ccn\").value.toString().length;i++)\n");
      out.write("                    {\n");
      out.write("                        for(var j=0;j<=9;j++)\n");
      out.write("                            if(t[i]==j)\n");
      out.write("                              flag1=1;\n");
      out.write("                        if(j==10 && flag1==0)\n");
      out.write("                            { \n");
      out.write("                                alert(\"Please Enter Valid Credit Card Number\");\n");
      out.write("                                document.getElemntById(\"ccn\").focus();\n");
      out.write("                            }\n");
      out.write("                            flag1=0;                        \n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                  if(document.getElementById(\"classname\").value ==\"\" )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter Your Name\");\n");
      out.write("                        document.getElementById(\"classname\").focus();\n");
      out.write("                    }\n");
      out.write("                  else  if(document.getElementById(\"username\").value ==\"\" )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter the username\");\n");
      out.write("                        document.getElementById(\"username\").focus();\n");
      out.write("                    }\n");
      out.write("                    else if(document.getElementById(\"pass\").value ==\"\" )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter password\");\n");
      out.write("                        document.getElementById(\"pass\").focus();\n");
      out.write("                    }\n");
      out.write("                    else if(document.getElementById(\"cpass\").value ==\"\" )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter confirm password\");\n");
      out.write("                        document.getElementById(\"cpass\").focus();\n");
      out.write("                    }\n");
      out.write("                    else if(document.getElementById(\"pass\").value != document.getElementById(\"cpass\").value )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Password and Confirm Password do not match\");\n");
      out.write("                        return;\n");
      out.write("                    }\n");
      out.write("                else if(document.getElementById(\"add1\").value ==\"\" )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter the address\");\n");
      out.write("                        document.getElementById(\"add1\").focus();\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                     else if(document.getElementById(\"mobn\").value ==\"\" )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter the Mobile number\");\n");
      out.write("                        document.getElementById(\"mobn\").focus();\n");
      out.write("                        document.getElementById(\"mobn\").select();\n");
      out.write("                    }\n");
      out.write("                    else if(document.getElementById(\"em\").value ==\"\" )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter your Email-id\");\n");
      out.write("                        document.getElementById(\"em\").focus();\n");
      out.write("                    }\n");
      out.write("                    else if(document.getElementById(\"ccn\").value ==\"\" )\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter your Credit Card Number\");\n");
      out.write("                        document.getElementById(\"ccn\").focus();\n");
      out.write("                        document.getElementById(\"ccn\").select();\n");
      out.write("                    }\n");
      out.write("                    else if (document.login.em.value == \"\" || apos<1 || dotpos-apos<2)\n");
      out.write("                                {\n");
      out.write("                                             alert(\"Please fix: email\")\n");
      out.write("                                            document.login.em.focus()\n");
      out.write("                                            \n");
      out.write("                                }   \n");
      out.write("                        else\n");
      out.write("                          {\n");
      out.write("                            //alert(\"DONE\");\n");
      out.write("                            document.login.submit();\n");
      out.write("                          }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <br><br><br><br><br><br><br>\n");
      out.write("    <center>\n");
      out.write("                <form action=\"entry1\" method=\"post\" id=\"login\" name=\"login\">\n");
      out.write("   <pre>\n");
      out.write("    \t <left><h2>Registration Page</h2></left>\n");
      out.write("         Name :<input type=\"text\" id=\"classname\"name=\"name\"  size=\"40\"/><br/>\n");
      out.write("         Username:<input type=\"text\" id=\"username\" name=\"username\">&nbsp;<br/>\n");
      out.write("         Password:<input type=\"password\" id=\"pass\" name=\"pass\"><br/>\n");
      out.write("         Confirm:<input type=\"password\" id=\"cpass\" name=\"cpass\"><br/>\n");
      out.write("         Address:<textarea name=\"add1\" id=\"add1\" cols=45 rows=4></textarea><br/><br/>\n");
      out.write("         Mobile no:<input type=\"text\"  name=\"mobn\" id=\"mobn\" size=\"25\" maxlength=\"10\"/><br/>\n");
      out.write("         Email:<input type=\"text\"  name=\"em\" id=\"em\" size=\"50\"/><br>\n");
      out.write("         CC No:<input type=\"text\"  name=\"ccn\" id=\"ccn\" size=\"20\" maxlength=\"16\"/><img src=\"card.gif\"><br/>\n");
      out.write("</pre>\n");
      out.write("<pre>\n");
      out.write("        <input type=\"reset\" value=\"  Reset  \" size=\"30\" />\n");
      out.write("        <input type=\"button\" onclick=\"ischeck();\" value=\"  Submit  \"  size =\"30\"  /><br>\n");
      out.write("</pre>\n");
      out.write("        <h4> Go To <a href =\"newhome.html\">Home</a> Page</h4>\n");
      out.write("</form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
