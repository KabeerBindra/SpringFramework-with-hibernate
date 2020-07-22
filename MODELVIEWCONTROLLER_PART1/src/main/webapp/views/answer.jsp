<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
your details are ${param.Name}

<br><br>
<hr><hr>
<form action="upper" method="GET">
	
		<input type="text" name="name"
			placeholder="What's your name?" />
			
		<input type="submit" />
			
	</form>

Enter to convert this to upper case

</body>
</html>