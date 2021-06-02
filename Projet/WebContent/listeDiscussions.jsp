<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Liste des requetes</title>
    <link rel="stylesheet" href="listeRequetes.css" />
    <meta charset="UTF-8" />
  </head>

  <body>
    <div id="app"></div>
    <%@ page import = "java.util.Collection" %>
    <%@ page import = "entities.Discussion" %>
    <%if (((Collection<Discussion>) request.getAttribute("discussions")) == null) {
    	
    	%> 
    	<h1> Vous n'avez pas de requete en cours</h1>
    <%} else { %>
	<%for(Discussion r : (Collection<Discussion>) request.getAttribute("discussions")){ %>
    <div class="container">
      <div class="content">
        <div class="content-preview">
          <h6>Numero</h6>
          <h2><%= r.getNum() %></h2>
        </div>

        <div class="content-info">
          <div class="content-container">
            <h2>Nombre de participants: </h2>
            <%= r.getParticipants().size() %>
          </div>
          
		  <form action="Session" method="get">
		    <input type = "hidden" name = "num" value = <%= r.getNum() %>>
          	<input type="submit" class="btn" value ="consulter" name = "op">
          	<input type = "hidden" name = "mail" value = "${mail}">
          </form>
        </div>
      </div>
    </div>
    <%}} %>
  </body>
</html>
