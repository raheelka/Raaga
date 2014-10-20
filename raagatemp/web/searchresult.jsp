<%-- 
    Document   : searchresult
    Created on : 19 Sep, 2011, 4:18:23 PM
    Author     : tanvim
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <style>
        
    </style>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Results</title>
        
    </head>
    <body>
        <h1>Results for your search.</h1>
        <%
            ResultSet rs = (ResultSet)request.getAttribute("result");
            //String name,album,artist,genre,price;
               //String name = rs.getString("name");
               String album=rs.getString("album");
              // String artist=rs.getString("artist");
               //String genre=rs.getString("genre");
               //String price=rs.getString("price");
                
            
         
            
        %>
        <p>
        
        
        <h1>album = <%= album %></h1>
        
        </p>
            
    </body>
</html>
