<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Error Page</title>
		<link rel="stylesheet" type="text/css" href="Styles.css">
	</head>
	<body>
		
			<table>
				<tr>
					<th>Error No.</th>
					<th>Error</th>
				</tr>
				<tr>
					<c:forEach var="error" items="${errorList }" varStatus="counter">
						<td>${counter }</td>
						<td>${error }</td>
					</c:forEach>
				</tr>
			</table>
	</body>
</html>