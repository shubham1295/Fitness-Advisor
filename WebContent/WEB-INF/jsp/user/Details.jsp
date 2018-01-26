<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
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
		          <li class="active"><a href="#">Diet Plan</a></li>
		          <li ><a href="workout">Workout Plan</a></li>
		          <li><a href="profile">Profile</a></li>
		        </ul>
		    </div>
		    
		    <table border="1">
		   <a:forEach var="diet" items="${dietplan}">
		   	<tbody>
		   		<tr> 
			   		<td> <a:out value="${diet.name}"/> </td>
			   		<td> <a:out value="${diet.url}"/> </td>
			   		<td> <a:out value="${diet.description}"/> </td>
			   		<td> <a:out value="${diet.timing}"/> </td>
		   		</tr>
		   	</tbody>
		   </a:forEach>
  		   	</table>
	</body>
</html>