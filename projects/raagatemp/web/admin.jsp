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
@import url(newstyle.css);
h2{font-family: Calligrapher;
color:#753A00;
size:15;
font-face: Calligrapher;
text-decoration:none;}
a:link {text-decoration: none; color:#753A00}
a:visited {text-decoration: none;}
a:hover {text-decoration: underline;}

</style>
    </head>
    <body><table><tr><td><br><br><br><br><br><br><br><br><br></tr></table>

<table border="1" >

<tr>
	<td>
		<table border="1" width="150">

			<tr><td>
			<label>
                            <form name="form1" action="search" method="post">
			<input type="textbox" id="search" name="search" placeholder="search">


                                             </label>
			</tr>

			<tr><td align="center"><input type="submit" id="submit" name="submit" value="SEARCH">

                                </form>
                        </tr>


			<tr><td align="center"><h4><a href="NewReleases.html"><font color=#753A00>New Releases</font></a></h4></tr>
			<tr><td align="center"><h4><a href="LatestBollywoodSongs.html">Latest Songs</a></h4></tr>

			<tr><td align="center"><h4><a href="Retro Hits.html">Retro Hits</a></h4></tr>
			<tr><td align="center"><h4><a href="OldBollywoodSongs.html">Old Songs</a></h4></tr>
			<tr><td align="center"><h4><a href="Black&WhiteCollection.html">Black & White</a></h4></tr>
			</font>
		</table>
	</td>

	<td valign="top">

		<table border="1" width="670">
		<tr>
			<td>
<ul id="qm0" class="qmmc">

	<li><a href="newhome.html"><b>HOME</b></a></li>
	<li><span class="qmdivider qmdividery" ></span></li>



	<li><a class="qmparent" href="javascript:void(0)">ARTISTS</a>

		<ul>
		<li><a href="javascript:void(0)">ATIF ASLAM</a></li>
		<li><a href="javascript:void(0);">JAL</a></li>
		</ul></li>

	<li><span class="qmdivider qmdividery" ></span></li>
	<li><a class="qmparent" href="javascript:void(0)">TYPE</a>

		<ul>
		<li><a href="javascript:void(0)">SAD</a>
		</ul></li>
<li><span class="qmdivider qmdividery" ></span></li>
                <li><a href="loginmod.html"><b>BUY</b></a></li>
	<li><span class="qmdivider qmdividery" ></span></li>

	<li><a class="qmparent" href="javascript:void(0);">CONTACT US</a>

		<ul style="width:150px;">
		<li><a href="javascript:void(0);">ABOUT RAAGA</a></li>
		<li><a href="javascript:void(0);">DEVELOPERS</a></li>
		</ul></li>
                <li><span class="qmdivider qmdividery" ></span></li>

	<li><a href="logout"><b>LOGOUT</b></a></li>
	<li><span class="qmdivider qmdividery" ></span></li>

<li class="qmclear">&nbsp;</li></ul>

<!-- Create Menu Settings: (Menu ID, Is Vertical, Show Timer, Hide Timer, On Click ('all' or 'lev2'), Right to Left, Horizontal Subs, Flush Left, Flush Top) -->
<script type="text/javascript">qm_create(0,true,0,250,false,false,false,false,false);</script>

				</td>
			</tr>
<tr><td><br><br><br><br></td></tr>


<tr>
        <form name="update" method ="post">
            <td align="center">
          <table>
<center>              <tr><td><h2>WELCOME ADMIN!!!!!</h2>
           <tr><td valign="center"> <a href ="music.jsp"> <input type ="button" value =" Add To Music Table" name="umusic"></a></tr>
            <tr><td valign="center"><a href ="userdetails.jsp"><input type ="button" value =" Delete from User Table" name ="uuserdet"></a></tr>
           <tr><td valign="center"> <a href ="delmusic.jsp"> <input type ="button" value =" Delete from Music Table" name="umusic"></a></tr>
        </form>
</center>
    </body>
</html>
