<%@ page import="com.klef.ep.models.User"%>
<%
boolean result = (boolean)request.getAttribute("result");
User user = (User)request.getAttribute("user");

if(result)
{
	%>
	<h3>Login Success</h3><br>
	Welcome&nbsp;<i><%=user.getUsername()%></i>
	<%
}
else
{
	%>
	<h3>Login Fail</h3><br>
	<%
}

%>