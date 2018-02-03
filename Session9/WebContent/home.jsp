<%@page import="co.edureka.Student"%>
<%@page import="com.sun.xml.internal.ws.client.Stub"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="printdate.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<h3>Welcome Home Dear Admin</h3>
	
	<%
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		
		//String name = (String)pageContext.getAttribute("keyName",PageContext.SESSION_SCOPE);
		//int age = (int)pageContext.getAttribute("keyAge",PageContext.SESSION_SCOPE);
		
		out.print("Name is: "+name+"<br/>Age is: "+age+"<br/>");
		
		Student s1 = new Student();
		s1.setRoll(101);
		s1.setName("Jennie");
		
		
		out.println(s1.getRoll()+" belongs to "+s1.getName());
		
	%>
	
	<br/>
	
	<jsp:useBean id="s2" class="co.edureka.Student"/>
	<jsp:setProperty property="roll" name="s2" value="102"/>
	<jsp:setProperty property="name" name="s2" value="Jack"/>
	
	<b><jsp:getProperty property="roll" name="s2"/> belongs to <jsp:getProperty property="name" name="s2"/></b>
	
	
</body>
</html>