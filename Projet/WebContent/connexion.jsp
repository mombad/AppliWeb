<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page de Connexion</title>
</head>
<body>
connectez-vous !
<form action= "Connexion" method="get">
 	<label for="email"><b>Adresse Email <br></b></label>
    <input type="text" placeholder="mail" name="email" required><br>
    
    <label for="psw"><b>Mot de passe <br> </b></label>
    <input type="password" placeholder="mot de passe" name="psw" required><br>
    <br>
    
	<input type="submit" name="co" value="Connexion">
</form>
</body>
</html>