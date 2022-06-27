<%@ page import="com.klef.ep.models.Employee"%>
<%
int result = (int)request.getAttribute("result");
Employee emp = (Employee)request.getAttribute("employee");

if(result>0)
{
	%>
	<h3>Employee record inserted succesfully</h3><br>
	Welcome&nbsp;<i><%=emp.getEmpname()%></i>
	<%
}


%>