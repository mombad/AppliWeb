<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Envoi de requete</title>

</head>
<body>
<h1>
Bienvenue dans la section de creation de requete
	<%if(request.getAttribute("compte") != null) {%> 
	${compte.nom} ${compte.prenom}
	<% } %>
</h1>

<h1> Creer une requete </h1>
<label for="name"> Sujet </label> <br> 
<input type="text" id="sujet (1 à 10 caractères)" name="sujet" required
       minlength="1" maxlength="10" size="12"> <br>

        	<form action="Session" method = "post">
        			
        			<input type="hidden" name="op1" value="${mail}">
					<label for="story">Ecrivez votre requete</label> <br>

					<textarea id="message" name="message"
					          rows="5" cols="33">
					Madame, Monsieur, ...
					</textarea> <br>
				<input type="submit" name ="op" value="Envoyer"/>
  			</form>
</body>
</html>