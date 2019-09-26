<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add minutes</h1>

	<div>
		Language :<a href="?language=en">English</a> | <a href="?language=es">Spannish</a>
	</div>
	<form:form modelAttribute="exercise">
		<table>
			<tr>
				<td><spring:message code="goal.text" /></td>
				<td><form:input path="minutes"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" vakye="Enter excercise""></td>
			</tr>
			<tr></tr>
		</table>
	</form:form>
	<h1>Our Goal for the day is: ${goal.minutes }</h1>
</body>
</html>