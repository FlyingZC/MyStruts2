<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>index</title>
</head>

<body>
	<a href="test-aware.action">测试aware</a>
	<a href="login-ui">进入登录页面</a>
	<br /> 
	以下测试通配符
	<a href="UserAction-add">增</a>
	<br />
	<a href="UserAction-remove">删</a>
	<br />
	<a href="UserAction-change">改</a>
	<br />
	<a href="UserAction-find">查</a>
	<br /> 
	以下测试值栈
		<a href="testValueStack.action">查看值栈</a>

</body>
</html>
