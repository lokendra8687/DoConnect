<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DoConnect</title>
<style>
#first {
	background-image: url("IMG.jpg");
	text-align: center;
	background-size: cover;
	background-repeat: no-repeat;
	font-family: georgia;
	color: whitesmoke;
	margin:0px;
}

#second {
	float: left;
	display: block;
}

#third {
	padding: 250px 0px;
}

#fourth {
	background-color: black;
	padding: 1px;
	color: whitesmoke;
	font-family: calibri;
	text-align: center;
	margin-top: 8px;
}
li,a{
display:inline-block;
text-decoration:none;
color:whitesmoke;
font-family:cambria math;
padding:12px 30px 0px 0px;
font-weight:bold;
font-size:18px;
}
a:hover{
color:grey;
}
a:active{
color:#88AFEC;
}
</style>
</head>

<body>
	<div id="first">
		<div id="fifth">
			<ul>
				<!--<li><a href="http://localhost:8080/adminlogin">Admin Login</a></li>-->
				<li><a href="http://localhost:8080/userregistration">User Registration</a>
				<!--<li><a href="http://localhost:8080/userlogin">User Login</a>-->
				<li><a href="http://localhost:8080/adminregistration">Admin Registration</a>
			</ul>
		</div>

		<div id="third">
			<h1>DoConnectt</h1>
			<h3></h3>
		</div>
	</div>
	<div id="fourth">
		<p>Group4</p>
	</div>

</body>
</html>