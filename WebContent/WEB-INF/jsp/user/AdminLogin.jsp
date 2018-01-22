<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html> 
<html>
<head>
	<link rel="stylesheet"  href="<c:url value="/resources/theme/css/bootstrap-theme.css"/>"/>
	<link rel="stylesheet"  href="<c:url value="/resources/theme/css/bootstrap.css"/>"/>
	<link rel="stylesheet"  href="<c:url value="/resources/theme/css/index.css"/>"/>
	<link rel="stylesheet"  href="<c:url value="/resources/theme/css/login.css"/>"/>
	
	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js'></script>
	<script src='https://use.fontawesome.com/7ee55d0e5e.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js'></script>
	        
	  
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
<%-- 	<form:form modelAttribute="admin" method="post">
			<table>
		
				<tr>
					<td>Email</td>
					<td><form:input path="email"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td> <form:password path="password"/> </td>
				</tr>
				<tr>
					<td></td>
					<td> <input type="submit" value="Login"/>  </td>
				</tr>
			</table>
		</form:form> --%>
		
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
		        <li><a href="register">Sign Up <i class="fa fa-user-plus" aria-hidden="true"></i></a></li>
		        <li><a href="login">Login <i class="fa fa-user" aria-hidden="true"></i></a></li>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
		
		  
		
		<section class="user">
		  <div class="user_options-container">
		    <div class="user_options-text">
		      <div class="user_options-unregistered">
		        <h2 class="user_unregistered-title">This Is Admin LogIn Page</h2>
		        <p class="user_registered-text">If u are Not a Admin Click here To Login/Signup</p>
		        <a href="#"><button class="user_unregistered-signup" id="signup-button">Sign up</button></a>
		      </div>
		    
		    <div class="user_options-forms" id="user_options-forms">
		      <div class="user_forms-login">
		        <h2 class="forms_title">Login</h2>
		       
		        <form:form modelAttribute="admin" method="post" class="forms_form">
		          <fieldset class="forms_fieldset">
		            <div class="forms_field">
		              <form:input type="email" path="email" placeholder="Email" class="forms_field-input" required="required"/> 
		            </div>
		            <div class="forms_field">
		              <form:input type="password" path="password" placeholder="Password" class="forms_field-input" required="required"/>
		            </div>
		          </fieldset>
		          <div class="forms_buttons">
		            <!-- <button type="button" class="forms_buttons-forgot">Forgot password?</button> -->
		            <input type="submit"  value="Log In" class="forms_buttons-action">
		          </div>
		        </form:form>
				
		      </div>
		    </div>
		  </div>
		</section>


</body>
</html>