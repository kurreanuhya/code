<%@ page import="com.klef.ep.models.Employee"%>
<%
int result = (int)request.getAttribute("result");
int id=(int)request.getAttribute("empid");

if(result>0)
{
	%>
	<h3><%=id%> Employee record Deleted Succesfully</h3><br>
	<a href="viewemployees">Back</a>
	<%
}


%>