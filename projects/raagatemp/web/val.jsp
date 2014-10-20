<%-- 
    Document   : val
    Created on : 29 Sep, 2011, 12:03:04 AM
    Author     : tanvim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String s=request.getParameter("param");
if(s.equals("pass"))
out.print("Password should not be less than 6 characters."+"");
else if(s.equals("c_pass"))
        out.print("Password did not match");
else if(s.equals("mob"))
        out.print("Please Enter valid no");
else if(s.equals("email"))
        out.print("Please Fix : Email");
   else out.print("madd"+"");
%>