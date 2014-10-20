<%--
    Document   : music.jsp
    Created on : 2 Nov, 2010, 12:44:33 PM
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
@import url(newstyle.css);
h4{font-family: Calligrapher;
color:#753A00;
size:15;
font-face: Calligrapher;
text-decoration:none;}
a:link {text-decoration: none; color:#753A00}
a:visited {text-decoration: none;}
a:hover {text-decoration: underline;}

</style>
<script type="text/javascript">

             function ischeck()
            {
                uname = document.getElementById("sname").value;
                if(uname=="")
                    alert("Please Enter Vaild Song Name");
                else
                    document.delmusic.submit();
            }

</script>

    </head>
    <body><br><br><br><br><br><br><br><br><br><br><br><br>
        <form name ="delmusic" method ="post" action="delmusic">
            <center>
                <table>
                <tr>
                    <td><h4>Song name :</h4></td>
                    <td><input type ="text" name ="sname" id="sname"></td>
                </tr>

                <tr>
                    <td></td>
                    <td><h4><input type ="button" name ="update" value ="Delete" onclick="ischeck();"></h4></td>
                </tr>
         </table>
            </center>
        </form>
    </body>

</html>
