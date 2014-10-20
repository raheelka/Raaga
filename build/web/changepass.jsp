<%--
    Document   : changepass
    Created on : 2 Nov, 2010, 2:12:48 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            @import url(newstyle.css);
</style>
    </head>
    <body>
        <center>
        <table>
            <tr><br><br><br><br><br><br><br><br><br></tr>
            <tr><td colspan="2" align="center"><h1>Change password</h1></td></tr>
            <tr>
                 <form action="changepass" method="post">
            <td><h4>Enter old password:</h4></td><td><input type="password" name="opass"></td></tr>
            <tr><td><h4>Enter new password:</h4></td><td> <input type="password" name="npass"></td></tr>
            <tr><td colspan="2" align="center">
                    <input type="submit" name="submit" value="change"><br><a href="newhome.html">Go back</a></td></tr>
        </form>
        </table>
            </center>
    </body>
</html>
