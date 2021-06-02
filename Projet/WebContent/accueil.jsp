<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="st2.css" />
    <title>Accueil</title>
    <meta charset="UTF-8" />
  </head>

  <body>
    <div id="app"></div>
    <div class="topnav">
      <div class="moduleleft">
        SCOLAREO
      </div>
      <a class="active" href="">Accueil</a>
      <a href="Session?op1=${mail}&op=Deconnexion">Deconnexion</a>
      <a href="Session?op1=${mail}&op=Creer+une+requete">Creer une requete</a>
      <a href="Session?op1=${mail}&op=Mes+requetes">Mes requetes</a>
      <a href="Session?op1=${mail}&op=DiscussionsEleve">Discussions</a>
	</div>	
		<div class="bgnd col-sm-offset-1 text-center col-sm-10">
			<h1 class="mb40 mb-xs-16 large">
				Bienvenue sur notre plateforme digitale scolareo
			</h1>
			<h6 class="uppercase mb16">Votre réussite est notre priorité</h6>
			<a class="btn btn-lg btn-filled" href="#">Explorer</a>
		</div>
  </body>
</html>