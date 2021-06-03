<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cette adresse existe deja!</title>
<link rel="stylesheet" href="error.css" />
</head>
<body>
<h1 class = "txt">Cette adresse existe deja!</h1>

<form action="Servlet" method = "get">
						<input type="submit" class="btn" name ="op" value="Se connecter"/>
						<input type="submit" class="btn" name="op" value="S'inscrire"/>
 </form>
</body>
</html>