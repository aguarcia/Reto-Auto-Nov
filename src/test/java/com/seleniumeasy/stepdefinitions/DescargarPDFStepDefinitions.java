package com.seleniumeasy.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.seleniumeasy.tasks.IngresarPagina;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DescargarPDFStepDefinitions {

  @Before
  public void prepararActor() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que (.*) ingresa a la página de LATAM$")
  public void que_Agustin_ingresa_a_la_página_de_LATAM(String nombreActor) {
    theActorCalled(nombreActor).attemptsTo(IngresarPagina.deSimpleForm());
  }

  @Cuando("^navega hasta la autorizacion de tratamiento de datos$")
  public void navega_hasta_la_autorizacion_de_tratamiento_de_datos() {

    // throw new PendingException();
  }

  @Entonces("^descarga la politica en PDF$")
  public void descarga_la_politica_en_PDF() {
    // Write code here that turns the phrase above into concrete actions
    // throw new PendingException();
  }
}
