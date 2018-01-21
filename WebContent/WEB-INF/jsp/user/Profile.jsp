<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html> 
<html>
	<head>
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		
		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
		
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
				
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
	<h1>Welcome ${ membSession.name }</h1>
				
			<div class="collapse navbar-collapse nav-justified" id="bs-example-navbar-collapse-1">
		        <ul class="nav nav-tabs nav-justified">
		          <li ><a href="details">Diet Plan</a></li>
		          <li ><a href="workout">Workout Plan</a></li>
		          <li class="active"><a href="profile">Profile</a></li>
		        </ul>
		    </div>
		
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		
		
		
		<form:form modelAttribute="members" method="post">
			<table>
				
				<tr>
					<td>Name</td>
					<td><form:input path="name" value="${ membSession.name }"/> </td>
				</tr>
				
				<tr>
					<td>Gender</td>
					<td> <form:select path="gender"> 
						<form:option value="m">Male</form:option>
						<form:option value="f">Female</form:option>
						</form:select>
					</td>
				</tr>
				
				<tr>
					<td>Height</td>
					<td><form:input type="number" path="height"/></td>
				</tr>
				
				<tr>
					<td>Weight</td>
					<td><form:input type="number" path="weight"/></td>
				</tr>
				
				<tr>
					<td>Phone</td>
					<td><form:input type="number" path="phone"/></td>
				</tr>
				
				<tr>
					<td>Age</td>
					<td><form:input type="number" path="age"/></td>
				</tr>
				
				<tr>
					<td>Address</td>
					<td><form:input path="address"/></td>
				</tr>
				
				<tr>
					<td>Email</td>
					<td><form:input path="email" value="${ membSession.email }"/></td>
				</tr>
				
				<tr>
					<td></td>
					<td> <input type="submit" value="Save"/>  </td>
				</tr>
			</table>
		</form:form>
	</body>
</html>