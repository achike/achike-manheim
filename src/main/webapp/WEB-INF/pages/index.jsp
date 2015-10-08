<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<body>
	<h3>Greetings!</h3>
	<form:form method="POST" commandName="greeting" action="${request.contextPath}/hello">
		<table>
			<tbody>
				<tr>
					<td>Enter Person's Name to Greet: </td>
					<td><form:input path="name" /></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>