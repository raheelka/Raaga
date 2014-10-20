<%--
    Document   : userdetails
    Created on : 2 Nov, 2010, 1:27:57 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
@import url(styles.css);
</style>
<script type="text/javascript" src="dropdowntabs.js" ></script>
 <script type="text/javascript">

             function ischeck()
            {
                uname = document.getElementById("username").value;
                if(uname=="")
                    alert("Please Enter Vaild Username");
                else
                    document.userdetails.submit();
            }

</script>
    </head>
    <body><body><br><br><br><br><br><br><br><br><br><br><br><br>

        <form name ="userdetails" action ="userdetails" method ="post">
           <center> <table>
                   <tr><td colspan="2" align="center"><h2>TO DELETE  THE USER:</h2>
                </tr>
                   <tr>
                    <td><h2>Username :</h2></td>
                    <td><input type ="text"  name="username" id="username"></td>
                </tr>
                <tr>

                    <td colspan="2" align="center"><input type ="button"  name="delete" value ="Delete" onclick="ischeck();"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
