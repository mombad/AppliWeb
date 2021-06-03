<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mes fiches</title>
<link rel="stylesheet" href="fiches.css" />
</head>
<body>
<%@ page import = "entities.FicheCours" %>
<%@ page import = "java.util.Collection" %>
<%@ page import = "java.util.LinkedList" %>
<ul class="cards">
<%if (((LinkedList<FicheCours>) request.getAttribute("fiches")) == null || ((LinkedList<FicheCours>) request.getAttribute("fiches")).isEmpty() ) {%>

    	
    	<form action="Session" method="get">
    		<h1 class = "txt"> Pas de fiches recommandees </h1> <br>
    		<input type = "hidden" name = "op1" value = <%= request.getParameter("op1") %>>
    		<input class = "btn" type = "submit" name = "op" value = "Revenir a l'accueil">
    	</form>
    	
    	
    <%} else { %>
<%for (FicheCours f : (LinkedList <FicheCours>) request.getAttribute("fiches")) { %>

		<li>
			<a href="<%=f.geturlFiche() %>" class="card" download>
				<img src=<%=f.geturlFiche() %> class="card__image" alt="" />
				<div class="card__overlay">
					<div class="card__header">
						<svg class="card__arc" xmlns="http://www.w3.org/2000/svg"><path /></svg>                     
						<img class="card__thumb" src=<%=f.geturlTheme() %> alt="" />
						<div class="card__header-text">
							<h3 class="card__title"><%=f.getSujet() %></h3>            
							
						</div>
					</div>
					<p class="card__description" >
			
						Telecharger
						

					</p>

				</div>
				
			</a>      
		</li>
<%}} %>
</ul>
</body>
</html>