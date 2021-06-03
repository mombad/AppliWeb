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
    <%@ page import = "entities.Compte" %>
    <%if (((Collection<Discussion>) request.getAttribute("discussions")) == null || ((Collection<Discussion>) request.getAttribute("discussions")).isEmpty() ) {%>
    	<h1> Vous n'avez pas de discussion en cours</h1>
    	<form action="Session" method="get">
    		<input type = "hidden" name = "op1" value = <%= request.getParameter("op1") %>>
    		<input class = "btn" type = "submit" name = "op" value = "Revenir a l'accueil">
    	</form>
    	
    <%} else { %>
	<%for(Discussion r : (Collection<Discussion>) request.getAttribute("discussions")){ %>
    <div class="container">
      <div class="content">
        <div class="content-preview">
          <h6>Sujet</h6>
          <h2><%= r.getSujet() %></h2>
        </div>

        <div class="content-info">
          <div class="content-container">
            <h2> Participants: </h2>
             <ul class="un">
            <%for (Compte p : r.getParticipants()){ %>
            	<li> <%=p.getNom()%> </li>
            <%} %>
            </ul>
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
