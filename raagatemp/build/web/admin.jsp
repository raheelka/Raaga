<%--
    Document   : admin
    Created on : 2 Nov, 2010, 12:23:41 PM
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
    </head>
    <body><table><tr><td><br><br><br><br><br><br><br><br><br></tr></table>

<table border="1" >

<tr>
	<td>
		<table border="2" width="150">
			<tr><td>
			<label>
                            <form name="form1" action="search" method="post">
			<input type="textbox" id="search" name="search" placeholder="search">


                                             </label>
			<td align="center"><input type="submit" id="submit" name="submit" value="SEARCH">

                                </form>
                       


			<tr><td colspan="2" align="center"><h4><a href="link3.html">New Releases</a></h4></tr>
			<tr><td colspan="2" align="center"><h4><a href="link.html">Latest Songs</a></h4></tr>

			<tr><td colspan="2" align="center"><h4><a href="link2.html">Retro Hits</a></h4></tr>
			<tr><td colspan="2" align="center"><h4><a href="link1.html">Old Songs</a></h4></tr>
                        <tr><td colspan="2" align="center"><h4><a href="Black&WhiteCollection.html">Black & White</a></h4></tr>
		</table>
	</td>

	<td valign="top">

		<table border="2" width="670">
		<tr>
			<td>
                            <div id="colortab" class="ddcolortabs">
<ul>
<li><a href="newhome.html" title="Home"><span>Home</span></a></li>
<li><a href="Artist 1.html" title="Artist" rel="artists"><span>Artist</span></a></li>
<li><a href="Album 1.html" title="Albums" rel="albums"><span>Albums</span></a></li>
<li><a href="checkwhlog" title="Buy" ><span>Buy</span></a></li>	
<li><a href="login.html" title="Login"><span>Login</span></a></li>	
<li><a href="aboutus.html" title="About Us" rel="contact"><span>About Us</span></a></li>	

</ul>
</div>
                                
            <div id="artists" class="dropmenudiv_a">

		
		<a href="atif.jsp">ATIF ASLAM</a>
		<a href="jal.jsp">JAL</a>
                <a href="bappi.jsp">Bappi Lahiri</a>
                <a href="JavedAli.jsp">Javed Ali</a>
                <a href="mohit.jsp">Mohit Chauhan</a>
                <a href="vishal.jsp">Vishal</a>
                <a href="roopkumar.jsp">Roopkumar</a>
                <a href="shankar.jsp">Shankar</a>
                <a href="karan.jsp">Karan</a>
                <a href="shreya.jsp">Shreya Ghoshal</a>
                <a href="allen.jsp">Allen</a>
                <a href="akon.jsp">Akon</a>
                <a href="backstreet.jsp">Backstreet Boys</a>
                <a href="mj.jsp">MJ</a>
                <a href="hoobastank.jsp">Hoobastank</a>
                <a href="linkinpark.jsp">Linkin park</a>
                <a href="metallica.jsp">Metallica</a>
                <a href="usher.jsp">Usher</a>
                <a href="tpain.jsp">Tpain</a>

            </div>

            <div id="contact" class="dropmenudiv_a">
                <a href="abtraaga.html">ABOUT RAAGA</a>
		<a href="develpors.html">DEVELOPERS</a>
            </div>
                            <div id="albums" class="dropmenudiv_a">
    <a href="">Albums 1</a>
    <a href="">Albums 2</a>
    <a href="">Albums 3</a>
    <a href="">Albums 4</a>
    <a href="">Albums 5</a>
    <a href="">Albums 6</a>
    <a href="">Albums 7</a>
</div>
	


	<script type="text/javascript">
//SYNTAX: tabdropdown.init("menu_id", [integer OR "auto"])
tabdropdown.init("colortab", -1)
</script>
				</td>
			</tr>
<tr><td><br><br><br><br></td></tr>


<tr>
        <form name="update" method ="post">
            <td align="center">
          <table border="2">
              <center><tr><td colspan="3"><h2>WELCOME ADMIN!!!!!</h2></center>       
           <tr>
               <td valign="center" align="center"> <a href ="music.jsp"><input type ="button" value =" Add Music" name="umusic"></a></td>
               <td valign="center" align="center"><a href ="userdetails.jsp"><input type ="button" value =" Remove User" name ="uuserdet"></a></td>
            <td valign="center" align="center"> <a href ="delmusic.jsp"> <input type ="button" value =" Delete Music" name="umusic"></a></td></tr>
        </form>
</center>
    </body>
</html>
