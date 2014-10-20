<%-- 
    Document   : usher
    Created on : 2 Nov, 2010, 9:12:14 PM
    Author     : Karan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form name="foo" action="search" method="post" id="foo">
            <input type="text" name="search" id="search" value="usher">

        </form>
        <script type="text/javascript">
            window.onload=document.foo.submit();;
        </script>

    </body>
</html>
