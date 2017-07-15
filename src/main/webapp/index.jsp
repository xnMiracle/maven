<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    String path = request.getContextPath();
    %>
<html>
<body>
<h2>Hello World!</h2>
<form action="<%=path %>/loginServlet" method="post">
	姓名：<input type="text" name = "name" ><br>
	密码：<input type="password" name = "password" ><br>
	<input type="submit" value="登陆">
</form>

</body>
</html>
