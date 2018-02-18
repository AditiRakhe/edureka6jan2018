<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String data = request.getParameter("number");
	int num = 0;
	try{
		num = Integer.parseInt(data);
	}catch(Exception e){
		out.println("Enter a valid number !!");
	}
	
	for(int i=1;i<=10;i++){
		out.println(num+" "+i+"'s are "+(num*i)+"<br/>");
	}
%>