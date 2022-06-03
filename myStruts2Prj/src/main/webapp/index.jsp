<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Index</title>
</head>
<body>
	<h1>Hello from Struts2</h1>
	<form action="hello">
		<label for="name">Enter your name </label> 
		<input type="text" name="name" /> 
		
		<input type="submit" value="Click here" />

	</form>
</body>
</html>