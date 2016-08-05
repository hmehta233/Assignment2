<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><form action="" method = "post">
<table>
<tr> <td colspan="2" align="center"> Add Movie Show</td>
</tr>
<tr>
<td>Add Movie</td>
<td> <input type ="text" name="Moviename"  required ></tr>
<tr><td>Theater Name</td>
<td><input type = "text" name ="Theatername"  required></tr>
<tr><td>Total Seats Available</td>
<td><input type = "text" name ="Totalseatsavailable"  required></tr>
<tr><td>Start Time</td>
<td><input type = "text" name ="Starttime"  required></tr>
<tr><td>End Time</td>
<td><input type = "text" name ="Endtime"  required></tr>

<tr><td colspan="2" align="center">
<input type="submit" value="Add Movie" name="addmovie">
</td></tr></table></form>
</center>

</body>
</html>