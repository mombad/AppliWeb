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

    <%@ page import = "java.util.Collection" %>
    <%@ page import = "entities.Requete" %>
    <%if (((Collection<Requete>) request.getAttribute("requetes")) == null || ((Collection<Requete>) request.getAttribute("requetes")).isEmpty() ) {%>
    	<h1> Vous n'avez pas de requete en cours</h1>
    	
    <%} else { %>
    
	<%for(Requete r : (Collection<Requete>) request.getAttribute("requetes")){ %>
    <div class="container">
      <div class="content">
        <div class="content-preview">
          <h6>Sujet</h6>
          <h2><%= r.getSujet() %></h2>
        </div>

        <div class="content-info">
          <div class="content-container">
            <h2>Message</h2>
            <%= r.getMessage() %>
          </div>
          
		  <form action="Session" method="get">
		    <input type = "hidden" name = "requete" value = <%= r.getCompte().getMail() %>>
          	<input type="submit" class="btn" value ="creer une discussion" name = "op">
          	<input type = "hidden" name = "mail" value = "${mail}">
          	<input type = "hidden" name = "sujet" value = <%=r.getSujet() %>>
          	<input type = "hidden" name = "num" value = <%=r.getNum() %>>
          </form>
        </div>
      </div>
    
    <%}} %>

  </body>
</html>
