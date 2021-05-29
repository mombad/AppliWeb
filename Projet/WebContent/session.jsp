<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Roboto:400,700,900&display=swap"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="session.css" />

    <title>Requete</title>
  </head>
  <body>
    <div class="content">
      <div class="row">
        <div class="row">
          <div class="col-md-6">
            <h3>Besoin d'aide? Creez une requete!</h3>
            <p>
              Nos enseignants seront disposés à répondre à vos messages de
              manière rapide et efficace
            </p>
          </div>
          <div class="col-md-6">
            <form method="post" action="Session">
              <input type="hidden" name="op1" value="${mail}" />
              <div class="row">
                <div class="form-group">
                  <input
                    type="text"
                    class="sujet"
                    name="sujet"
                    placeholder="Sujet"
                    required
                  />
                </div>
              </div>
              <div class="row">
                <div class="form-group">
                  <textarea
                    name="message"
                    cols="30"
                    rows="7"
                    placeholder="Ecrivez votre requete"
                    required
                  ></textarea>
                </div>
              </div>
              <div class="row">
                <input type="submit" value="Envoyer" name = "op" class="sub" />
                <span class="submitting"></span>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>