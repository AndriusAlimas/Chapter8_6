<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
<!-- if bean is not existing we create a new one with scope of page
than we set all properties if form name and bean name match -->
	<jsp:useBean id='person' type='example.PersonBean'
		class='example.EmployeeBean'>
		<jsp:setProperty name='person' property='*' />
	</jsp:useBean>
	
	<table border="3" >
		<tr>
			<td>First Name:</td>
			<td><jsp:getProperty name='person' property='firstName' /></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><jsp:getProperty name='person' property='lastName' /></td>
		</tr>
		<tr>
			<td>Dog Name <b>without standart action[using scripting]: </b>:</td>
			<td><%= ((example.PersonBean)request.getAttribute("person_object")).getDog().getDname() %></td>
		</tr>
		
		
		<tr>
			<td>Dog Name<b>with standart action[no scripting[</b>:</td>
			<td><jsp:getProperty name='person' property='dog' /> </td>
		</tr>
		

		<tr>
			<td>Dog Name <b>using EL : </b>:</td>
			<!-- If the expression has variable followed by a dot, the left-hand variable MUST be a Map or a bean
			usually Map is implicit object. The thing to the right of the dot MUST be a Map key or a bean property.
			So person_object is a bean -> dog is bean property -> name is dog bean property -->
			<td>${person_object.dog.Dname}</td>
		</tr>
	</table>
	
</body>
</html>