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
@import url(styles.css);
</style>
<script type="text/javascript" src="dropdowntabs.js" ></script>
       <script type="text/javascript">

             function ischeck()
            {
                sname = document.getElementById("sname").value;
                artist = document.getElementById("artist").value;
                type = document.getElementById("type").value;
                price = document.getElementById("price").value;
                imageid = document.getElementById("imageid").value;                
         if(sname =="" || artist ==""|| type =="" || price =="" || imageid =="")
                       alert("Please Fill In The Details");
                   else
                       document.music.submit();
            }

        </script>
    </head>
    <body><br><br><br><br><br><br><br><br><br><br><br><br>
        <form name ="music" method ="post" action="music">
            <center>
                <table>
                <tr>
                    <td><h4>Song name :</h4></td>
                    <td><input type ="text" name ="sname" id ="sname"></td>
                </tr>
                <tr><td><h4>Artist :</h4></td>
                    <td><input type ="text" name ="artist" id ="artist"></td>
                </tr>
                <tr>
                    <td><h4>Song Type :</h4></td>
                    <td><input type ="text" name ="type" id ="type"></td>
                </tr>
                <tr>
                    <td><h4>Price :</h4></td>
                    <td><input type ="text" name ="price" id ="price"></td>
                </tr>
                <tr>
                    <td><h4>Image Id :</h4></td>
                    <td><input type ="text" name ="imageid" id ="imageid"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><h4><input type="button" onclick="ischeck();" value="Add"  size ="30"/></h4></td>
                </tr>
      
         </table>
        </form>
    </body>

</html>
