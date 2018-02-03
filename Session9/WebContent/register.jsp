<%@page import="co.edureka.JDBCHelper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register User</title>
</head>
<body>

	<%
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper(); // Load the Driver
		helper.openConnection(); // Open the Connection
		int i = helper.registerUser(name, email, password); // Write and Execute SQL Statement
		
		if(i>0){
			out.println(name+" Registered Successfully..");
		}else{
			out.println("Registration Failure..");
		}
		
		helper.closeConnection(); // Close the Connection
	%>

</body>
</html>