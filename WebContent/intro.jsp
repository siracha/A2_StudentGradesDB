<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>main</title>
		<link rel="stylesheet" type="text/css" href="Styles.css">
	</head>
	<body>
		<c:choose>
			<c:when test="${empty studentList }">
				<a href="Create.jsp">Create a New User</a>
				<a href="index.html">Back</a>
			</c:when>
			
			<c:otherwise>
				<a href="Report.jsp">Print a report</a>
				<a href="<c:url value="Modify.jsp"/>">Modify Grades</a>
			</c:otherwise>
		</c:choose>
			
		
	</body>
</html>