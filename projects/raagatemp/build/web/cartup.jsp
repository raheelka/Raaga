<%-- 
    Document   : cartup
    Created on : 22 Oct, 2011, 4:27:24 PM
    Author     : tanvim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<script type=\"text/javascript\">
function ischeck()
{
var xmlhttp;
var x;
var y;

if (window.XMLHttpRequest)
  {
  xmlhttp=new XMLHttpRequest();
  }
else
  {
  xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");
  }
xmlhttp.onreadystatechange=function()
  {
      
  
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
        

    document.getElementById(\"t1\").innerHTML=xmlhttp.responseText;
    }
  }
     x=document.getElementById(\"q1\").value;
    y=document.getElementById(\"u1\").value;
 var a1=3;
  

  var abc=\"\"+x+\",\"+y;
xmlhttp.open(\"GET\",\"quant.jsp?a2=\"+abc,true);
xmlhttp.send();
}
</script>

                </head>          
  <body>
        <h1>Hello World!</h1>
        <input type="text" id="q1" value="6"></input>
        <input type="text" id="u1" value="6"></input>

        <p id="t1"></p>
        <input type="submit" value="submit" onclick="ischeck()"></input>        
        
    </body>
</html>
