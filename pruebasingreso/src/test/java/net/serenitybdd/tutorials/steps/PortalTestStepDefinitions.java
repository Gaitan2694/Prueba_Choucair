package net.serenitybdd.tutorials.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PortalTestStepDefinitions {

    private WebDriver driverChrome;

    private String username;
    private String password;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.manage().window().maximize();
        driverChrome.get("http://automationpractice.com/index.php");
    }

    @Given("Dado que Airlenis tiene un perfil dentro de la plataforma")
    public void dado_que_Airlenis_tiene_un_perfil_dentro_de_la_plataforma() {
        // Asignación de credenciales a variables de la clase
        this.username = "airl2694@gmail.com";
        this.password = "compras123";
    }

    @When("Coloca sus credenciales de usuario en la pantalla de inicio de sesion")
    public void coloca_sus_credenciales_de_usuario_en_la_pantalla_de_inicio_de_sesion() {
        // Write code here that turns the phrase above into concrete actions
        WebElement signin = driverChrome.findElement(By.xpath("//A[@class='login'][text()='\n" + "\t\t\tSign in\n" + "\t\t']"));
        signin.click();
        WebElement emailInput = driverChrome.findElement(By.id("email"));
        WebElement passInput = driverChrome.findElement(By.id("passwd"));
        WebElement login = driverChrome.findElement(By.id("SubmitLogin"));
        emailInput.sendKeys(username);
        passInput.sendKeys(password);
        login.click();
    }

    @Then("Debe de autenticarse exitosamente")
    public void debe_de_autenticarse_exitosamente() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("Dado que Airlenis encuentra articulos de interes")
    public void dado_que_Airlenis_encuentra_articulos_de_interes() {
        // Write code here that turns the phrase above into concrete actions
        WebElement articulo = driverChrome.findElement(By.xpath("(//DIV[@class='product-container'])[1]"));
        articulo.click();
    }

    @When("Selecciona los articulos para agregar a su carrito de compras")
    public void selecciona_los_articulos_para_agregar_a_su_carrito_de_compras() {
        /*
        Al momento de seleccionar el boton de agregar al carrito, se dificulta ya que el comportamiento al dar click
        sobre el articulo seleccionado no es el similar desde el navegador que desde el webdriver instanciado
        Las dos lineas de codigo acontinuación comentadas suponen el elegir el boton de agregar al carrito el articulo deseao
        */
        //WebElement btnCarrito = driverChrome.findElement(By.xpath("//SPAN[text()='Add to cart']"));
        //btnCarrito.click();

    }

    @Then("Debe reflejarse la modificacion de su carrito de compras")
    public void debe_reflejarse_la_modificacion_de_su_carrito_de_compras() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("Dado que Airlenis posee articulo que no desea comprar en su carrito")
    public void dado_que_Airlenis_posee_articulo_que_no_desea_comprar_en_su_carrito() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("Selecciona los articulos que desea eliminar y lo quita de su carrito")
    public void selecciona_los_articulos_que_desea_eliminar_y_lo_quita_de_su_carrito() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("Debe reflejarse la modificacion de los articulos eliminados.")
    public void debe_reflejarse_la_modificacion_de_los_articulos_eliminados() {
        // Write code here that turns the phrase above into concrete actions
    }

}
