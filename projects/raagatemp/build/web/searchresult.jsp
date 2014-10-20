<%-- 
    Document   : searchresult
    Created on : 19 Sep, 2011, 4:18:23 PM
    Author     : tanvim
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            ResultSet rs = (ResultSet)request.getAttribute("result");
            String name = rs.getString("name");
        %>
        <p>name = <%= name %><p>
    </body>
</html>
