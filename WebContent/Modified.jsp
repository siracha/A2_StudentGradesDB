<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Grade Modified</title>
		<link rel="stylesheet" type="text/css" href="Styles.css">
	</head>
	<body>
		<table>
			<tr>
				<th>Assignment</th>
				<th>Mark</th>
			</tr>
			<c:set var="gpa" value="0" scope="page"/>
			<c:forEach var="mark" items="${currentStudent.grades }">
				<c:set var="gpa" value="${gpa + 1 }"/>
				<tr>
					<td>${mark.assignment}</td>
					<td>${mark.grade}</td> 
				</tr>
			</c:forEach>
		</table>
	</body>
</html>