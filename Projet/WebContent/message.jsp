<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Discussion</title>
<link rel="stylesheet" href="message.css" />
</head>
<body>
 <div class = "app">
 <%@ page import = "java.util.*" %>
 <%@ page import = "entities.Discussion" %>
 <%@ page import = "entities.Message" %>
 <%@ page import = "entities.MessageTexte" %>
 <%if (((Discussion) request.getAttribute("discussion")).getMessages() == null || (((Discussion) request.getAttribute("discussion")).getMessages()).isEmpty() ){%>
	 <div class="message-list">
	 	<div class="message">
     		
  		</div>
 <%  }else{%>
 <div class = "message-list">
 <%for (Message m : ((Discussion) request.getAttribute("discussion")).getMessages() ) {%>
 
 <div class="message">
     <div class="message-username"><%=m.getExpediteur().getNom()%></div>
     <div class="message-text"><%=((MessageTexte) m).getTexte() %></div>
  </div>
  
 <%}} %>
 </div>
 <form class="send-message-form" action = "Session" method = "post">
        <input placeholder="Ecrivez ici" type="text" name ="msg" />
        <input type = "hidden" name ="id" value = "${id}"/>
        <input type = "hidden" name ="mail" value = "${mail}"/>
        <input type="submit" value="send" name = "op" class="btn" />
 </form>
 <div class="rooms-list">
        <div class="help-text">Participants :</div>
  </div>
  </div>
  
  
 
</body>
</html>