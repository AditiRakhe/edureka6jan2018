<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.client.ClientBuilder"%>
<%@page import="javax.ws.rs.client.Client"%>
<%@page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Consuming RESTful Web Service</h3>
	<%
		//1. Create Client
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		
		//2. WebTarget which shall target the WebService on a URI
		WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session14B").build());
		
		//3. Request the WebMethod and accept the response 
		// /rest/yourwebservice
		String plainResponse = target.path("rest").path("yourwebservice").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String htmlResponse = target.path("rest").path("yourwebservice").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xmlResponse = target.path("rest").path("yourwebservice").request().accept(MediaType.TEXT_XML).get(String.class);
		String jsonResponse = target.path("rest").path("yourwebservice").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		//4. Printing out the response from Web Service
		out.print("Plain Response: <br/>"+plainResponse+"<br/><br/>");
		out.print("HTML Response: <br/>"+htmlResponse+"<br/><br/>");
		out.print("XML Response: <br/>"+xmlResponse+"<br/><br/>");
		out.print("JOSN Response: <br/>"+jsonResponse+"<br/><br/>");

	%>

</body>
</html>