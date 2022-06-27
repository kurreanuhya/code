<%@ page import="com.klef.ep.models.Employee,java.util.*"%>
<%
	List<Employee> employees=(List<Employee>)request.getAttribute("employees");
%>
<h3 align="center">List Of Employees</h3>
<table align="center" border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Gender</th>
		<th>Employee Department</th>
		<th>Employee Salary</th>
		<th>Employee Joining Date</th>
		<th>Employee Manager Status</th>
		<th>Action</th>
	</tr>
	<%
		for(Employee emp:employees)
		{
			%>
				<tr>
					<td><%=emp.getEmpid() %></td>
					<td><%=emp.getEmpname() %></td>
					<td><%=emp.getEmpgender() %></td>
					<td><%=emp.getEmpdepartment() %></td>
					<td><%=emp.getEmpsalary() %></td>
					<td><%=emp.getEmpjoiningdate() %></td>
						<%
							if(emp.isEmpmanager())
							{
								%>
								<td>Yes</td>
								<%
							}
							else
							{
								%>
								<td>No</td>
								<%
							}
						%>
						<td>
						<a href="deleteemployee?empid=<%=emp.getEmpid()%>">Delete</a>&nbsp;&nbsp;
						<a href="viewemployeebyid?empid=<%=emp.getEmpid()%>">Update</a>&nbsp;&nbsp;
						</td>
				</tr>
			<%
		}
	%>
</table>