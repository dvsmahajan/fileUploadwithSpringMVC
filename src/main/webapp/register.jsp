<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1 align="center">${fail}</h1>
	<form method="post" action="register.do" enctype="multipart/form-data">
		<table border="1">
			<thead>
				<tr>
					<td colspan="2" align="center">Register Details</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="username" placeholder="Enter Username"/></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" placeholder="Enter Password"/></td>
				</tr>
				
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email" placeholder="Enter Email"/></td>
				</tr>

				<tr>
					<td>Photo:</td>
					<td><input type="file" name="photoUpload" accept="image/*" placeholder="Select Photo"/></td>
				</tr>
				
				<tr>
					
					<td colspan="2" align="center"><input type="submit" value="Register" /></td>
				</tr>

				
			</tbody>
		</table>
	</form>
</body>
</html>