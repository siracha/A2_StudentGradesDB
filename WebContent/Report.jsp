<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Report page</title>
		<link rel="stylesheet" type="text/css" href="Styles.css">
	</head>
	<body>
		<h1>${fName } ${lname }'s Grade Report</h1>
		<table>
			<tr>
				<th>assignment</th>
				<th>mark</th>
			</tr>
				<c:forEach var="assignment" items="${currentStudent.grades }">
					<td>${assignment.assignment }</td>
					<td>${assignment.grade }
				</c:forEach>
			<tr>
				<td>Total GPA</td>
				<td>${gpa }</td>
			</tr>
		</table>
	</body>
</html>