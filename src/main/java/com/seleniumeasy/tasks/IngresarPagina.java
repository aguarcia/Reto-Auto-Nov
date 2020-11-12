package com.seleniumeasy.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.seleniumeasy.interactions.AbrirNavegador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class IngresarPagina implements Task {

  public static IngresarPagina deSimpleForm() {
    return instrumented(IngresarPagina.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(AbrirNavegador.enSelenium());
  }
}
