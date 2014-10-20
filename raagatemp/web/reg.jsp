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
    
    
    <style>
@import url(styles.css);
</style>
<script type="text/javascript" src="dropdowntabs.js" ></script>
     <script type="text/javascript">
                          
             function ischeck()
            {

                var apos=document.login.em.value.indexOf("@");
                var dotpos=document.login.em.value.lastIndexOf(".");

               var s=document.getElementById("mobn").value.toString();
                var flag=0;

               //For Mobile Number
                for(var i=0;i<document.getElementById("mobn").value.toString().length;i++)
                    {
                        for(var j=0;j<=9;j++)
                            if(s[i]==j)
                                flag=1;
                        if(j==10 && flag==0)
                            {
                                alert("Please check the mobile number");
                                document.getElemntById("mobn").focus();

                            }
                            flag=0;

                    }
                 //For Credit Card Number
                var t=document.getElementById("ccn").value.toString();             
                var flag1 = 0;
                 for(var i=0;i<document.getElementById("ccn").value.toString().length;i++)
                    {
                        for(var j=0;j<=9;j++)
                            if(t[i]==j)
                              flag1=1;
                        if(j==10 && flag1==0)
                            { 
                                alert("Please Enter Valid Credit Card Number");
                                document.getElemntById("ccn").focus();
                            }
                            flag1=0;                        
                    }

                  if(document.getElementById("classname").value =="" )
                    {
                        alert("Enter Your Name");
                        document.getElementById("classname").focus();
                    }
                  else  if(document.getElementById("username").value =="" )
                    {
                        alert("Enter the username");
                        document.getElementById("username").focus();
                    }
                    else if(document.getElementById("pass").value =="" )
                    {
                        alert("Enter password");
                        document.getElementById("pass").focus();
                    }
                    else if(document.getElementById("cpass").value =="" )
                    {
                        alert("Enter confirm password");
                        document.getElementById("cpass").focus();
                    }
                    else if(document.getElementById("pass").value != document.getElementById("cpass").value )
                    {
                        alert("Password and Confirm Password do not match");
                        return;
                    }
                else if(document.getElementById("add1").value =="" )
                    {
                        alert("Enter the address");
                        document.getElementById("add1").focus();
                    }

                     else if(document.getElementById("mobn").value =="" )
                    {
                        alert("Enter the Mobile number");
                        document.getElementById("mobn").focus();
                        document.getElementById("mobn").select();
                    }
                    else if(document.getElementById("em").value =="" )
                    {
                        alert("Enter your Email-id");
                        document.getElementById("em").focus();
                    }
                    else if(document.getElementById("ccn").value =="" )
                    {
                        alert("Enter your Credit Card Number");
                        document.getElementById("ccn").focus();
                        document.getElementById("ccn").select();
                    }
                    else if (document.login.em.value == "" || apos<1 || dotpos-apos<2)
                                {
                                             alert("Please fix: email")
                                            document.login.em.focus()
                                            
                                }   
                        else
                          {
                            //alert("DONE");
                            document.login.submit();
                          }

            }
            </script>
    </head>
    <br><br><br><br><br><br><br>
    <center>
                <form action="entry1" method="post" id="login" name="login">
   <pre>
    	 <table>
             <tr><td colspan="2"><h2>Registration Page</h2></td></tr>
             <tr><td><h3>  Name :</h3></td><td><input type="text" id="classname"name="name"  size="40"/></td>
             <tr><td><h3>Username:</h3></td><td><input type="text" id="username" name="username"></td>
             <tr><td><h3>Password:</h3></td><td><input type="password" id="pass" name="pass"></td>
             <tr><td><h3>Confirm:</h3></td><td><input type="password" id="cpass" name="cpass"></td>
             <tr><td><h3>Address:</h3></td><td><textarea name="add1" id="add1" cols=45 rows=4></textarea></td>
             <tr><td><h3>Confirm:</h3></td><td><input type="password" id="cpass" name="cpass"></td>
             <tr><td><h3>Mobile no:</h3></td><td><input type="text"  name="mobn" id="mobn" size="25" maxlength="10"/></td>
             <tr><td><h3>Email:</h3></td><td><input type="text"  name="em" id="em" size="50"/></td>
             <tr><td><h3>CC No:</h3></td><td><input type="text"  name="ccn" id="ccn" size="20" maxlength="16"/><img src="card.gif"></td>
             <tr><td></td>
                 <td><input type="button" onclick="ischeck();" value="  Submit  "  size ="30"  /><input type="reset" value="  Reset  " size="30" /></td>
             </tr>
                 
        
             </table>
  
</pre>
        <h4> Go To <a href ="newhome.html">Home</a> Page</h4>
</form>
    </center>
    </body>
</html>


