<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create a new user</title>
		<link rel="stylesheet" type="text/css" href="Styles.css">
	</head>
	<body>
		<h1>Create a user for ${studentNumber }</h1>
		<form name="createUserForm" action="CreateUserServlet" method="post">
			<label>First Name <input type="text" name="fName"></label>
			<label>Last Name <input type="text" name="lName"></label><br><br>
			<input type="submit" name="Submit" value="Create">
		</form>
	</body>
</html>