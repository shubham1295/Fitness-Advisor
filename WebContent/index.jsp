<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet"  href="<c:url value="/resources/theme/css/bootstrap-theme.css"/>"/>
	<link rel="stylesheet"  href="<c:url value="/resources/theme/css/bootstrap.css"/>"/>
	<link rel="stylesheet"  href="<c:url value="/resources/theme/css/index.css"/>"/>
	
	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js'></script>
	<script src='https://use.fontawesome.com/7ee55d0e5e.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js'></script>
	        
	        
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<!-- <h3> <a href="member/register">New User</a> </h3>
	<h3> <a href="member/login">Login</a> </h3> -->
	
    <ul class="slideshow">
	  <li></li>
	  <li></li>
	  <li></li>
	</ul>
	
	<nav class="navbar navbar-inverse">
	  <div class="container">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="#">Fit Forever</a>
	    </div>
	
	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li class='active'><a href=''>Home</a></li>
	        <li><a href='#'>About</a></li>
	        <li><a href='#'>Contact</a></li>
	      </ul>
	      
	      <ul class="nav navbar-nav navbar-right">
	        <li><a href="member/register">Sign Up <i class="fa fa-user-plus" aria-hidden="true"></i></a></li>
	        <li><a href="member/login">Login <i class="fa fa-user" aria-hidden="true"></i></a></li>
	      </ul>
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav>
	
	
	<div id='content'>
		<h1>Fit ForEver</h1>
		<h3>Hustle For That Muscle</h3>
		<hr>
		<a href="member/login"><button class='btn btn-default btn-lg'>Login !!! <div id="barbell-icon"></div></button></a>
	</div> <!-- /content -->
	  
</body>
</html>