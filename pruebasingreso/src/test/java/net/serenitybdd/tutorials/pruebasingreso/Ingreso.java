package net.serenitybdd.tutorials.pruebasingreso;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/",
        tags = "@agregarArticulos",
        glue="net.serenitybdd.tutorials"
)
public class Ingreso {}
