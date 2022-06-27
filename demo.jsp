<%
 String uname =  (String)session.getAttribute("uname");
session.removeAttribute("uname");
session.invalidate();
session.setMaxInactiveInterval(5);

%>
Welcome&nbsp;<%=uname%>