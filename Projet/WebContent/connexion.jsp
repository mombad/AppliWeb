<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="signIn.css" />
    <link
      href="https://fonts.googleapis.com/css?family=Coiny"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Libre+Baskerville"
      rel="stylesheet"
    />
    <meta charset="UTF-8" />
    <title>Page de Connexion</title>
  </head>
  <body>
    <center>
      <form action="Connexion" class="Container" method="get">
        <h1>Connectez-vous !</h1>
        <label class="h1" for="email"><b>Adresse Email </b></label>
        <input
          class="input1"
          type="text"
          placeholder="mail"
          name="mail"
          required
        /><br />

        <label class="h1" for="psw"
          ><b>Mot de passe <br /> </b
        ></label>
        <input
          class="input1"
          type="password"
          placeholder="mot de passe"
          name="psw"
          required
        /><br />
        <br />

        <input type="submit" class="sub" name="co" value="Connexion" />
      </form>
    </center>
  </body>
</html>