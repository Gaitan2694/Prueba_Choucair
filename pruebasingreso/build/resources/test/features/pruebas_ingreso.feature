@stories
Feature: pruebas de ingreso
  Como usuario comprador de internet, quiero poder:
  ingresar con mi usuario
  agregar articulos a mi carrito de compras
  eliminar articulos no deseados del carrito de compras

  @iniciarSesion
  Scenario:
    Given Dado que Airlenis tiene un perfil dentro de la plataforma
    When Coloca sus credenciales de usuario en la pantalla de inicio de sesion
    Then Debe de autenticarse exitosamente

  @agregarArticulos
  Scenario:
    Given Dado que Airlenis encuentra articulos de interes
    When Selecciona los articulos para agregar a su carrito de compras
    Then Debe reflejarse la modificacion de su carrito de compras

  @eliminarArticulos
  Scenario:
    Given Dado que Airlenis posee articulo que no desea comprar en su carrito
    When Selecciona los articulos que desea eliminar y lo quita de su carrito
    Then Debe reflejarse la modificacion de los articulos eliminados.
