<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Spring Security Example</title>


</head>
<body class="security-app">

${SPRING_SECURITY_LAST_EXCEPTION.message}
	<div class="details">
		<h2>Spring Security for Spring MVC  Application </h2>
	</div>

	<form action="login" method="post">
<table>
<tr>
	<td>User:</td>
	<td><input type='text' name='username' value=''> </td>
</tr>

<tr>
	<td>Password:</td>
	<td><input type='text' name='password' value=''></td>	
</tr>

<tr>
	<td><input name='submit' type='submit' value='submit'></td>	
</tr>

</table>
</form>
	
</body>
</html>

    