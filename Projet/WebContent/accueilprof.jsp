<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page d'accueil</title>
    <link rel="stylesheet" href="./styles.css">
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&display=swap" rel="stylesheet">
</head>
<body>
		
    
    <div class="lignes">
        <div class="l1"></div>
        <div class="l2"></div>
    </div>

    <div class="container-first">
        
        <div class="container-btns">
        	<form action="Session" method = "get">
        				
        				  
						<input type="hidden" name="op1" value="${mail}">
						<input type="submit" class="btn-first b1" name ="op" value="Messagerie"/>
						<input type="submit" name="op" value="Deconnexion"/>
						<input type="submit"  name="op" value="Lire les requetes"/>
						
				
  			</form>
        </div>
        <h2><span> TROUVEZ </span><span> UN </span><span> PROF </span><span></h1>
            <div class="topnav">
                <input type="text" placeholder="Search..">
              </div>
        </div>
       
        
        <h4><span> Bienvenue sur votre espace professeur. <br> Notre Objectif est de vous accompagner dans vos journées scolaires <br> en vous offrant un soutien scolaire révolutionnaire.<br> Que vous bloquez sur un exercice de Maths ou un DM de physique, <br> nos enseignants seront disposés et prêts à répondre à vos messages de manière rapide et efficace <br> afin de vous débloquer en quelques échanges. <br> Chez Scolareo, votre réussite est notre priorité. </span><span></h4>
        
        <h3><span>  Une communauté d'élève et de professeur </span><span> PROF </span><span></h1>
        
    
</body>

</html>
