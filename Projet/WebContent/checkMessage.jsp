<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rien</title>
</head>
<body>
<%@ page import = "java.util.*" %>
 <%@ page import = "entities.Discussion" %>
 <%@ page import = "entities.Message" %>
 <%@ page import = "entities.MessageTexte" %>
 <%@ page import = "entities.Compte" %>
<%String.valueOf(((Discussion) request.getAttribute("discussion")).getMessages().size());%>
 
 
  
 %>
</body>
</html>