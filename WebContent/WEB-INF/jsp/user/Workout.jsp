<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
	<head>
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		
		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
		
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
				
		<link rel="stylesheet"  href="<c:url value="/resources/theme/css/style.css"/>"/>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
			<h1>Welcome ${ membSession.name }</h1>
				
			<div class="collapse navbar-collapse nav-justified" id="bs-example-navbar-collapse-1">
		        <ul class="nav nav-tabs nav-justified">
		          <li ><a href="details">Diet Plan</a></li>
		          <li class="active"><a href="workout">Workout Plan</a></li>
		          <li><a href="profile">Profile</a></li>
		        </ul>
		    </div>
		    
		     <div id="content">
  <h1>Classes Timetable</h1>

  <ul class="timeline">
    <li class="event" data-date="7:00am - 07:45am">
      <h3>Circuit Training</h3>
      <p>Short interval training circuits to condition muscles and burn fat fast. Circuits may vary from centre to centre.</p>
    </li>
    <li class="event" data-date="9:30am - 10:30am">
      <h3>Total tone</h3>
      <p>Focuses on strength and endurance for the whole body and improves muscle tone. Instructor led.</p>    
    </li>
    <li class="event" data-date="10:30am - 11:30am">
      <h3>Zumba</h3>
      <p>A vigorous dance class to Latin music. Helps tone, shape and condition your body, burning up to 800 calories in one hour depending on how much you put in.</p>    
    </li>
    <li class="event" data-date="12:30pm - 1:30pm">
      <h3>Active Me</h3>
      <p>Active Me is an inclusive sports programme aimed at disabled people in Liverpool who experience barriers to doing physical activities and sport.</p>
    </li>
    <li class="event" data-date="5:30pm - 6:30pm">
      <h3>Zumba</h3>
      <p>A vigorous dance class to Latin music. Helps tone, shape and condition your body, burning up to 800 calories in one hour depending on how much you put in.</p>    
    </li>
    <li class="event" data-date="6:00pm - 6:45pm">
      <h3>Spinning</h3>
      <p>A vigorous class using stationary bikes with weighted flywheel. Focuses on strength, endurance, intervals and recovery. Burns calories and shapes muscles. Instructor led.</p>    
    </li>
    <li class="event" data-date="6:30pm - 7:30pm">
      <h3>Pilates</h3>
      <p>Lengthens and tones muscles using breathing and slow controlled movements.</p>
    </li>
    <li class="event" data-date="7:00pm - 7:45pm">
      <h3>Spinning</h3>
      <p>A vigorous class using stationary bikes with weighted flywheel. Focuses on strength, endurance, intervals and recovery. Burns calories and shapes muscles. Instructor led.</p>    
    </li>
    <li class="event" data-date="7:00pm - 8:00pm">
      <h3>Aqua Fit</h3>
      <p>Splash your way to fitness with gentle exercise in a heated pool. A class that is kind to joints and good fun too. Instructor led.</p>    
    </li>
    <li class="event" data-date="7:30pm - 8:30pm">
      <h3>Total tone</h3>
      <p>Focuses on strength and endurance for the whole body and improves muscle tone. Instructor led.</p>    
    </li>
    <li class="event" data-date="8:00pm - 9:00pm">
      <h3>Aqua Running</h3>
      <p>Aqua Running is a water class which uses all the major muscle groups. It results in total body conditioning and burns calories faster than any known activity.</p>    
    </li>
    <li class="event" data-date="8:30pm - 9:00pm">
      <h3>Metafit</h3>
      <p>Metafit is a new exciting twist on circuit-style training.</p>    
    </li>        
  </ul>
</div>
  
  
  
  
	</body>
</html>