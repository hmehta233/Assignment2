<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><form action="LoginServlet" method = "post">
<table>
<tr> <td colspan="2" align="center"> Login Form</td>
</tr>
<tr>
<td>username</td>
<td> <input type ="text" name="username" id="user" required ></tr>
<tr><td>password</td>
<td><input type = "password" name ="password" id="password" required></tr>
<tr><td colspan="2" align="center">
<input type="submit" value="Login" name="Login">
</td></tr></table></form>
</center>
</body>
</html>