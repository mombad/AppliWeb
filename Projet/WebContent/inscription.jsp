<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page d'inscription</title>
</head>
<body>
inscrivez-vous !
<form action= "Connexion" method="get">
	<label for="nom"><b>Nom <br></b></label>
    <input type="text" placeholder="Nom" name="nom" value="nom" required><br>
    
    <label for="prénom"><b>Prénom <br></b></label>
    <input type="text" placeholder="Prénom" name="prénom" value="prénom" required><br>
    
    Vous êtes : <br>
    <select name="choix" id="choix-selection">
    <option value="">--Please choose an option--</option>
	    <option value="eleve">élève</option>
	    <option value="professeur">professeur</option>
	</select> <br>
    
 	<label for="email"><b>Adresse Email <br></b></label>
    <input type="text" placeholder="mail" name="mail" value="mail" required><br>
    
    <label for="psw"><b>Mot de passe <br> </b></label>
    <input type="password" placeholder="mot de passe" name="psw" value="psw" required><br>
    <br>
    
	<input type="submit" name="co" value="Inscription">
</form>
</body>
</html>