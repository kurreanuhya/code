<%@ page import="com.klef.ep.models.Employee"%>
<%

Employee emp = (Employee)request.getAttribute("emp");


%>
<h3 align=center><u>Employee Registration (Insert)</u></h3>
<center>
<form method="post" action="updateemployee">
Employee ID&nbsp;&nbsp;<input type="" name="eid" value="<%=emp.getEmpid()%>" required readonly>
<br><br>
Employee Name&nbsp;&nbsp;<input type="text" name="ename" value="<%=emp.getEmpname()%>" required>
<br><br>
Employee Gender&nbsp;&nbsp;
Male<input type="radio" name="egender" value="male" required>
Female<input type="radio" name="egender" value="female" required>
<br><br>
Employee Department&nbsp;&nbsp;
<select name="edept" required>
<option value="">--Select--</option>
<option value="Sales">Sales</option>
<option value="Marketing">Marketing</option>
<option value="Development">Development</option>
</select>
<br><br>
Employee Salary&nbsp;&nbsp;<input type="number" name="esalary" value="<%=emp.getEmpsalary()%>" required><br><br>
Employee Joining Date&nbsp;&nbsp;<input type="date" name="ejoindate" value="<%=emp.getEmpjoiningdate()%>" required><br><br>
Employee Manager Status&nbsp;&nbsp;
Yes<input type="radio" name="emanager" value="true" required>
No<input type="radio" name="emanager" value="false" required>
<br><br>
<input type="submit" value="Update">
 </form>
</center>