<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Future RedHats</title>
</head>
<body>
<h2 align=center>JSP MVC Registration Demo</h2><hr color=red><hr color=red><br>
<h3 align=center><u>Employee Registration (Insert)</u></h3>
<center>
<form method="post" action="insertemployee">
Employee ID&nbsp;&nbsp;<input type="number" name="eid" required>
<br><br>
Employee Name&nbsp;&nbsp;<input type="text" name="ename" required>
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
Employee Salary&nbsp;&nbsp;<input type="number" name="esalary" required><br><br>
Employee Joining Date&nbsp;&nbsp;<input type="date" name="ejoindate" required><br><br>
Employee Manager Status&nbsp;&nbsp;
Yes<input type="radio" name="emanager" value="true" required>
No<input type="radio" name="emanager" value="false" required>
<br><br>
<input type="submit" value="Insert">
 </form>
</center>
</body>
</html>