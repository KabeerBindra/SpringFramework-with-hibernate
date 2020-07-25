<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<style> 
		table, th, td { 
			border: 1px solid black; 
			border-collapse: collapse; 
		} 
		
		th, td { 
			padding: 5px; 
			text-align: left; 
		} 
		
		table#t01 { 
			width: 100%; 
			background-color: #f2f2d1; 
		} 
	</style> 
<meta charset="ISO-8859-1">
<title>AirTicket</title>
</head>
<body>



	<table style="width:100%"> 
		<tr> 
			<th>Firstname</th> 
			<th>Lastname</th> 
			<th>Age</th> 
		</tr> 
		<tr> 
			<td>Priya</td> 
			<td>Sharma</td> 
			<td>24</td> 
		</tr> 
		<tr> 
			<td>Arun</td> 
			<td>Singh</td> 
			<td>32</td> 
		</tr> 
		<tr> 
			<td>Sam</td> 
			<td>Watson</td> 
			<td>41</td> 
		</tr> 
	</table> 

	<br /> 
	<br /> 

	<table id="t01"> 
		<tr> 
			<th>Firstname</th> 
			<th>Lastname</th> 
			<th>Age</th> 
		</tr> 
		<tr> 
			<td>Priya</td> 
			<td>Sharma</td> 
			<td>24</td> 
		</tr> 
		<tr> 
			<td>Arun</td> 
			<td>Singh</td> 
			<td>32</td> 
		</tr> 
		<tr> 
			<td>Sam</td> 
			<td>Watson</td> 
			<td>41</td> 

		</tr> 
		<spring:nestedPath path="Passenger">
		<form action="" method="post">
		<td>Number of Travellers</td>
		<td><spring:bind path="num">
		<input type="text" name="${status.expression}" value="${status.value }"/>
		</spring:bind>
		</td>
		<td>
		<br><br>
		<hr>
			<td>Enter the Password to Login</td>
		<td><spring:bind path="password">
		<input type="text" name="${status.expression}" value="${status.value }"/>
		</spring:bind>
		</td>
		<td>
		<input type="submit" value="book">
		</td>
		</form>
		</spring:nestedPath>
	</table> 

</body>
</html>