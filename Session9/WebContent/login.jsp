<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%-- <%@ page import="java.util.Date" %> --%>
<%@ include file="printdate.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login JSP</title>
</head>
<body>
	<h3>Login JSP Page</h3>
	
	<br/>
	Sciptlet
	<br/>
	
	<jsp:include page="printdate.jsp"/> <!-- Action Tag -->
	
	<%-- <b><i>Today is: <%= new Date() %></i></b> --%>
	
	<%
		int a = 10;
		int b = 20;
		int c = a+b;
		//out.println("c is: "+c+"<br/>");
		
		int[] arr = {10,20,30,40,50};
		out.print(arr[0]); // Exception
		
		/*try{
			out.print(arr[10]); // Exception
		}catch(Exception e){
			out.print("Some Exception: "+e);
		}*/
		
	%>
	
	<br/>
	
	<%-- <%
		String email1 = request.getParameter("txtEmail");
		out.print("Validating for "+email1+"<br/>");
	%> --%>
	
	<b> Validating for ${param.txtEmail} </b>
	
	<br/>
	
	<% 
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(email.equals("admin@example.com") && password.equals("password123")){
			//out.print("Welcome Admin");
			out.println("c is: "+c+"<br/>");
			out.println("x is: "+x+"<br/>");
			out.println("square of 5 is: "+squareOfNum(5)+"<br/>");
			
			String adminName = "John Watson";
			int age = 30;
			
			/*Cookie ck1 = new Cookie("keyName",adminName);
			Cookie ck2 = new Cookie("keyAge",String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			session.setAttribute("keyName", adminName);
			session.setAttribute("keyAge", age);
			//pageContext.setAttribute("keyName", adminName,PageContext.SESSION_SCOPE);
			//pageContext.setAttribute("keyAge", age,PageContext.SESSION_SCOPE);

	%>
	
		<jsp:forward page="home.jsp"/>
		<!-- <b><i>Welcome, Admin</i></b>
		<a href="home.jsp">Enter Home</a> -->
		
		
	<%		
		}else{
			out.print("Invalid Credentials");	
			response.sendRedirect("https://www.google.co.in");
		}
	%>
	
	
	<br/>
	Declarative
	<br/>
	<%!
		int x = 100;
	
		int squareOfNum(int num) {
			return num*num;
		}
	%>
	
	<br/>
	Declarative
	<br/>
	
	<br/>
	Expression
	<br/>
	x is: <%= x %>
	<br/>
	<b>Square of 7 is: <%= squareOfNum(7) %></b>
	
</body>
</html>