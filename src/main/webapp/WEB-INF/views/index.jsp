<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet" type="text/css"href="${pageContext.request.contextPath}/css/style.css"/>
   </head>
   <body>
      <h1>Welcome</h1>
      <h2>${message}</h2>
      <a href="${pageContext.request.contextPath}/personList">Person List</a>
      <a href="${pageContext.request.contextPath}/loginPage">Login Page</a>  
   </body>
   
</html>