package co.com.utest.stepdefinitions;

import co.com.utest.model.Utest_Datos;
import co.com.utest.questions.Responder;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Andres quiere registrarse en la pagina Utest$")
    public void andresQuiereRegistrarseEnLaPaginaUtest() throws Exception {
        theActorCalled("Andres").wasAbleTo(AbrirPaginaUtest.laPagina());

    }

    @When("^ingresa toda la informacion que le pide la pagina$")
    public void ingresaTodaLaInformacionQueLePideLaPagina(List<Utest_Datos> datos) throws Exception {
        theActorInTheSpotlight().attemptsTo(LLenarPaginaInfoPersonal.laPagina(datos), LlenarPaginaDireccion.laPagina(datos),
                LlenarPaginaDispositivos.laPagina(datos), LlenaPaginaFinal.laPagina(datos)
                );

    }

    @Then("^se completa este registro de manera exitosa$")
    public void seCompletaEsteRegistroDeManeraExitosa(List<Utest_Datos> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(datos)));

    }
}
