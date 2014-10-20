<%-- 
    Document   : quant
    Created on : 22 Oct, 2011, 4:13:03 PM
    Author     : tanvim
--%>


<%
String q=request.getQueryString();
String s1=q.substring(3);
String s2[]=s1.split(",");


int a=Integer.parseInt(s2[0]);
int b=Integer.parseInt(s2[1]);

out.println(a*b);
//String s1[]=q.split(".");
//for(int i=0;i<s1.length;i++)
//out.println(s1);



%>
