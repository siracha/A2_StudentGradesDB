<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Modify Records</title>
		<link rel="stylesheet" type="text/css" href="Styles.css">
	</head>
	<body>
		<table id="modifyTable">
			<tr>
				<th>Assignment</th>
				<th>Mark</th>
			</tr>
			<c:forEach var="mark" items="${currentStudent.grades }">
				<tr>
					<td>${mark.assignment }</td>
					<td>${mark.grade }</td>
				</tr>
			</c:forEach>
				<tr>
					<form name="recordForm" action="Modified.jsp" method="post">
					<td>
						<input type="text" placeholder="assignment" name="assignment" >
						<input type="text" placeholder="grade" name="grade">
						<input type="submit" value="submit" id="button" >
					</td>
					</form>
				</tr>
		</table>
	</body>
</html>