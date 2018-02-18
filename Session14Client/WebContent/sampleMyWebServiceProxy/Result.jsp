<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleMyWebServiceProxyid" scope="session" class="co.edureka.MyWebServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleMyWebServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleMyWebServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleMyWebServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        co.edureka.MyWebService getMyWebService10mtemp = sampleMyWebServiceProxyid.getMyWebService();
if(getMyWebService10mtemp == null){
%>
<%=getMyWebService10mtemp %>
<%
}else{
        if(getMyWebService10mtemp!= null){
        String tempreturnp11 = getMyWebService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String name_1id=  request.getParameter("name16");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        java.lang.String sayHello13mtemp = sampleMyWebServiceProxyid.sayHello(name_1idTemp);
if(sayHello13mtemp == null){
%>
<%=sayHello13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHello13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String mtrs_2id=  request.getParameter("mtrs21");
        int mtrs_2idTemp  = Integer.parseInt(mtrs_2id);
        int mtrToCm18mtemp = sampleMyWebServiceProxyid.mtrToCm(mtrs_2idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(mtrToCm18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 23:
        gotMethod = true;
        String eid_3id=  request.getParameter("eid26");
        int eid_3idTemp  = Integer.parseInt(eid_3id);
        String name_4id=  request.getParameter("name28");
            java.lang.String name_4idTemp = null;
        if(!name_4id.equals("")){
         name_4idTemp  = name_4id;
        }
        String salary_5id=  request.getParameter("salary30");
        int salary_5idTemp  = Integer.parseInt(salary_5id);
        java.lang.String registerEmployee23mtemp = sampleMyWebServiceProxyid.registerEmployee(eid_3idTemp,name_4idTemp,salary_5idTemp);
if(registerEmployee23mtemp == null){
%>
<%=registerEmployee23mtemp %>
<%
}else{
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(registerEmployee23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
}
break;
case 32:
        gotMethod = true;
        String feet_6id=  request.getParameter("feet35");
        int feet_6idTemp  = Integer.parseInt(feet_6id);
        int feetToInches32mtemp = sampleMyWebServiceProxyid.feetToInches(feet_6idTemp);
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(feetToInches32mtemp));
        %>
        <%= tempResultreturnp33 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>