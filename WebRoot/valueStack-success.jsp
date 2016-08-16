<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  </head>
  
  <body>
  valueStack-success页面
    <s:debug></s:debug>
    <br/>
    productName:<s:property value="[0].product.productPrice"></s:property>
    <s:property value="productPrice"></s:property>
    
    productName: ${product.productName}
    productPrice:${product.productPrice}
    
  </body>
</html>
