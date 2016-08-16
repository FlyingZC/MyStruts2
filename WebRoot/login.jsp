<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>login</title>
  </head>
  <body>
  		<form action="user-login.action" method="post">
  			username:<input type="text" name="username"/>
  			<input type="submit" value="login"/>
  		</form>
  </body>
</html>
