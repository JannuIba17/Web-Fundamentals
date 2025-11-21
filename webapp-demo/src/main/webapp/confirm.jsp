<html>
<body>
<h2>Student Details:</h2>
<%
    String name=request.getParameter("name");
    String email=request.getParameter("email");
%>
Name: <%= name %>
Email: <%= email %>
</body>
</html>
