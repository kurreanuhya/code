<%@ page import="com.klef.ep.models.Employee"%>
<%
int result = (int)request.getAttribute("result");
Employee emp = (Employee)request.getAttribute("employee");

if(result>0)
{
	%>
	<h3><%=emp.getEmpid()%> Employee record Updted Succesfully</h3><br>
	<%
}


%>