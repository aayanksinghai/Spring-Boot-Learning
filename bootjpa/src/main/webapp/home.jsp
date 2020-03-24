<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action = "addAlien">
	Enter your ID: <input type = "text" name = "aid"/><br>
	Enter your Name: <input type = "text" name = "aname"/><br>
	Enter your Tech: <input type = "text" name = "tech"/><br>
	<input type = "submit" value = "Submit"  /><br>
	</form>
	<br>
	<br>
	
	<form action = "getAlien">
	Display Records <br>
	Enter your ID: <input type = "text" name = "aid"/><br>
	<input type = "submit" value = "Search"  /><br>
	</form>
	<br>
	<br>
	
	<form action = "deleteAlien">
	Delete Record <br>
	Enter your ID: <input type = "text" name = "aid"/><br>
	</form>
	<br>
	<br>
	
	<form action = "updateAlien">
	Update a Record <br>
	Enter your ID: <input type = "text" name = "aid"/><br>
	Enter your Name: <input type = "text" name = "aname"/><br>
	Enter your Tech: <input type = "text" name = "tech"/><br>
	<input type = "submit" value = "Update"  /><br>

	</form>
	<br>
	<br>

</body>
</html>