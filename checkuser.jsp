<%
String uname = request.getParameter("uname");
String pwd = request.getParameter("pwd");

if(uname.equals("klu")&&pwd.equals("klu"))
{
  session.setAttribute("uname", uname);
  //out.println("Login Success");
  response.sendRedirect("demo.jsp");
}
else
{
  out.println("Login Failed");
}

%>