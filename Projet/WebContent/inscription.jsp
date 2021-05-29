<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="signUp.css" />
    <link
      href="https://fonts.googleapis.com/css?family=Coiny"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Libre+Baskerville"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <meta charset="UTF-8" />
    <title>Page d'inscription'</title>
  </head>
  <body>
    <center>
      <form action="Connexion" class="Container" method="get">
        <h1>Inscrivez-vous !</h1>
        <label class="h1" for="email"><b>Adresse Email </b></label>
        <input
          class="input1"
          type="text"
          placeholder="mail"
          name="mail"
          required
        />

        <label class="h1" for="psw"
          ><b>Mot de passe <br /> </b
        ></label>
        <input
          class="input1"
          type="password"
          placeholder="mot de passe"
          name="psw"
          required
        />

        <label class="h1" for="psw"
          ><b>Nom <br /> </b
        ></label>
        <input
          class="input1"
          type="text"
          placeholder="Nom"
          name="nom"
          required
        />
        <label class="h1" for="psw"
          ><b>Prénom <br /> </b
        ></label>
        <input
          class="input1"
          type="text"
          placeholder="Prénom"
          name="prénom"
          required
        /><br />
        <div class="wrapper">
          <input type="radio" name="select" value = "eleve" id="option-1" checked />
          <input type="radio" name="select" value = "professeur" id="option-2" />
          <label for="option-1" class="option option-1">
            <div class="dot"></div>
            <span>Student</span>
          </label>
          <label for="option-2" class="option option-2">
            <div class="dot"></div>
            <span>Teacher</span>
          </label>
        </div>

        <input type="submit" class="sub" name="co" value="Inscription" />
        <button type="submit" name="co" value="RetourConnexion" class="btn"><i class="fa fa-arrow-left"></i>Connexion</button> 
      </form>
    </center>
  </body>
</html>