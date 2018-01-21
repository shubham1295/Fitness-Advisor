<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html> 
<html>
	<head>
		<link rel="stylesheet"  href="<c:url value="/resources/theme/css/bootstrap-theme.css"/>"/>
		<link rel="stylesheet"  href="<c:url value="/resources/theme/css/bootstrap.css"/>"/>
		<%-- <link rel="stylesheet"  href="<c:url value="/resources/theme/css/index.css"/>"/>
		<link rel="stylesheet"  href="<c:url value="/resources/theme/css/signin.css"/>"/>
		 --%>
		<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
		<script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js'></script>
		<script src='https://use.fontawesome.com/7ee55d0e5e.js'></script>
		<script src='https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js'></script>
		      
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form:form modelAttribute="user" method="post">
			<table>
				
				<tr>
					<td>Name</td>
					<td><form:input path="name"/> </td>
				</tr>
				
				
				<tr>
					<td>Email</td>
					<td><form:input path="email"/></td>
				</tr>
				
				<tr>
					<td>Password</td>
					<td> <form:password path="password"/> </td>
				</tr>
				
				<tr>
					<td> <form:input path="perm" type="hidden" value="member"/> </td>
				</tr>
				
				<tr>
					<td></td>
					<td> <input type="submit" value="Register"/>  </td>
				</tr>
			</table>
		</form:form>
		
			
	<%-- <nav class="navbar navbar-inverse">
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
	    <h2 class="user_unregistered-title">Don't have an account?</h2>
	    <button class="user_unregistered-signup" id="signup-button">Sign up</button>
	   </div>
	
	   <div class="user_options-registered">
	    <h2 class="user_registered-title">Have an account?</h2>
	    <a href="login"><button class="user_registered-login" id="login-button">Login</button></a>
	   </div>
	  </div>
	
	  <div class="user_options-forms signup-click" id="user_options-forms">
	   <div class="user_forms-login">
	    <h2 class="forms_title">Login</h2>
	    <form class="forms_form">
	     <fieldset class="forms_fieldset">
	      <div class="forms_field">
	       <input type="email" placeholder="Email" class="forms_field-input" required autofocus />
	      </div>
	      <div class="forms_field">
	       <input type="password" placeholder="Password" class="forms_field-input" required />
	      </div>
	     </fieldset>
	     <div class="forms_buttons">
	      <button type="button" class="forms_buttons-forgot">Forgot password?</button>
	      <input type="submit" value="Log In" class="forms_buttons-action">
	     </div>
	    </form>
	   </div>
	   <div class="user_forms-signup">
	    <h2 class="forms_title">Sign Up</h2>
	   
	   <form:form modelAttribute="user" method="post" class="forms_form">
	    <form class="forms_form">
	     <fieldset class="forms_fieldset">
	      
	      <div class="forms_field">
	     <input type="text" placeholder="Full Name" class="forms_field-input" required />
	      </div>
	      
	      <div class="forms_field">
	       <input type="email" placeholder="Email" class="forms_field-input" required />
	      </div>
	      
	      <div class="forms_field">
	       <input type="password" placeholder="Password" class="forms_field-input" required />
	      </div>
	     
	     </fieldset>
	     
	     <div class="forms_buttons">
	      <input type="submit" value="Sign up" class="forms_buttons-action">
	     </div>
	    </form>
	    
	    <form:form modelAttribute="user" method="post">
			<table>
				
				<tr>
					<td>Name</td>
					<td><form:input path="NAME"/> </td>
				</tr>
				
				
				<tr>
					<td>Email</td>
					<td><form:input path="EMAIL"/></td>
				</tr>
				
				<tr>
					<td>Password</td>
					<td> <form:password path="PASSWORD"/> </td>
				</tr>
				
				<tr>
					<td> <form:input path="PERM" type="hidden" value="member"/> </td>
				</tr>
				
				<tr>
					<td></td>
					<td> <input type="submit" value="Register"/>  </td>
				</tr>
			</table>
		</form:form>
	    
	   </div>
	  </div>
	 </div>
	</section>  
	   --%>
	 
	</body>
</html>