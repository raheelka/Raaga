<%-- 
    Document   : reg
    Created on : Aug 28, 2010, 10:49:36 AM
    Author     : Junaid Kazi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        @import url(newstyle.css);
        h4{font-family: Calligrapher;font-face: Calligrapher;}
        </style>
     <script type="text/javascript">
          function check(abc)
            {
                var xmlhttp;
                var url="val.jsp";
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  
         
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
          if(abc=="pass")
          {
            if(document.getElementById("pass").value.toString().length <6)
            document.getElementById("hid_p").innerHTML='<valign="top">'+xmlhttp.responseText;
            else
            document.getElementById("hid_p").innerHTML=" "+"";
          }
          else if(abc =="c_pass")
              {
                  if(document.getElementById("pass").value != document.getElementById("cpass").value)
                      document.getElementById("hid_cp").innerHTML=xmlhttp.responseText;
                  else
                      document.getElementById("hid_cp").innerHTML=" "+"<br>";
              }
              else if(abc == "mob")
                  { var flag=0;
                      var s = document.getElementById("mobn").value.toString();
                      for(var i=0;i<document.getElementById("mobn").value.toString().length;i++)
                    {
                        for(var j=0;j<=9;j++)
                            if(s[i]==j)
                                flag=1;
                        if(j==10 && flag==0 )
                            {
                                document.getElementById("hid_m").innerHTML=xmlhttp.responseText;
                                document.getElemntById("mobn").focus();
                             
                            }
                           
                            else
                      document.getElementById("hid_m").innerHTML=" "+"<br>";
                      flag =0;
                    }
                  }
                  else if(abc =="email")
                      {
                          var apos=document.login.em.value.indexOf("@");
                          var dotpos=document.login.em.value.lastIndexOf(".");
                          if (document.login.em.value == "" || apos<1 || dotpos-apos<2)
                                {
                                    document.getElementById("hid_e").innerHTML=xmlhttp.responseText;
                                    document.login.em.focus()
                                            
                                }  
                          else
                              document.getElementById("hid_e").innerHTML =" "+"<br>";
                      }
                
    }
  }
url=url+"?param="+abc;
xmlhttp.open("GET",url,true);
xmlhttp.send();
            }
            
            function ischeck()
            {
                
            }
 
        </script>
    </head>
    <br><br><br><br><br><br><br>
   
                <form action="entry1" method="post" id="login" name="login">
   <pre>
    	 <center><h2>Registration Page</h2>

          <table border="2">
            <tr><td>Username</td>
                <td><input type="text" name="txt1"/></td>
                <td><font color ="black"><span id="hid_u"></span></font></td>
           </tr>
               <tr>
                <td>Password</td>
                <td><input type="password" id="pass" name="txt2" value="" onchange="check('pass')" /></td>
                <td><font color="black"><span id="hid_p" area ="20"></span></font></td>
            </tr>
            
            <tr>
                <td>Confirm:</td>
                <td><input type="password" id="cpass" name="cpass" onchange="check('c_pass')"></td>
                <td><font color ="black"><span id="hid_cp"></span></font></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><textarea name="add1" id="add1" cols=45 rows=4></textarea></td>
                <td><font color ="black"><span id="hid_a"></span></font></td>
            </tr> 
            <tr>
                <td> Mobile no:</td>
                <td><input type="text"  name="mobn" id="mobn" size="25" maxlength="10" onchange="check('mob')"/></td>
                <td><font color ="black"><span id="hid_m"></span></font></td>
            </tr>
            <tr>                
                <td>Email:</td>
                <td><input type="text"  name="em" id="em" size="50" onchange="check('email')"/></td>
                <td><font color ="black"><span id="hid_e"></span></font></td>
            </tr>
            <tr>
                <td> CC No:</td>
                <td><input type="text"  name="ccn" id="ccn" size="20" maxlength="16"/><img src="card.gif"></td>
                <td><font color ="black"><span id="hid_c"></span></font></td>
            </tr>
            <tr>                
                <td></td>
                <td><input type="reset" value="  Reset  " size="30" /><input type="submit" value="  Submit  "  size ="30" onclick="ischeck()" /></td>
            </tr>
        </table>
             </center>
</pre>
        <h4> Go To <a href ="newhome.html">Home</a> Page</h4>
</form>
    
   </body>
</html>


