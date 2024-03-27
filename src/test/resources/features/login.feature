# language: es

  Característica: Login

    Escenario: Login válido
      Dado que el usuario ingresa a la página de login
      Cuando el usuario se loguea con credenciales válidas
      Entonces el usuario se encuentra en su cuenta


    Escenario: Login invalido
      Dado que el usuario ingresa a la página de login
      Cuando el usuario se loguea con credenciales inválidas
      Entonces se muestra un mensaje de error de credenciales




