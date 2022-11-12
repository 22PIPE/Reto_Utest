#Author: Andres Devia

@Stories

Feature: Resgistro de nuevo usuario en la pagina de Utest

  @scenario1
  Scenario: Registro de Andres como nuevo usuario en la pagina de Utest
    Given Andres quiere registrarse en la pagina Utest
    When ingresa toda la informacion que le pide la pagina
      | strNombre | strApellido | strEmail         | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad        | strCodigoPostal | strPais  | strComputador | strVersionComputador | strLenguajeComputador | strDispositivoMovil | strModeloDispositivoMovil | strSODispositivoMovil | StrContrasena   |
      | Andres    | Devia       | wmuz.njabq25@kygur.com | August           | 22               | 1998             | Santiago de Tolu | 706010          | Colombia | Windows       | 10                   | Spanish               | Xiaomi              | Poco X3                   | Android 11            | A2210Hernandez* |
    Then se completa este registro de manera exitosa
      | strTextoFinal  |
      | Complete Setup |