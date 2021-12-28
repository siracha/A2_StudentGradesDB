<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New User Created</title>
		<link rel="stylesheet" type="text/css" href="Styles.css">
	</head>
	<body>
		
		<h1>Student ${studentList[fn:length(studentList)-1].fName } 
		${studentList[fn:length(studentList)-1].lName } 
		${studentList[fn:length(studentList)-1].studentID }
		created</h1> <br><br>
		
		
		<a href="index.html">Back</a>
	</body>
</html>