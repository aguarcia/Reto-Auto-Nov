package com.seleniumeasy.tasks;

import static com.seleniumeasy.userinterfaces.ContratoTransporte.LNK_ANEXO_CONTRATO_TRANSPORTE;
import static com.seleniumeasy.userinterfaces.PaginaPrincipal.LNK_CONTRATO_TRANSPORTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class NavegarPagina implements Task {

  public static NavegarPagina deSimpleForm() {
    return instrumented(NavegarPagina.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(LNK_CONTRATO_TRANSPORTE, isVisible()).forNoMoreThan(60).seconds(),
        Click.on(LNK_CONTRATO_TRANSPORTE),
        WaitUntil.the(LNK_ANEXO_CONTRATO_TRANSPORTE, isVisible()).forNoMoreThan(60).seconds(),
        Click.on(LNK_ANEXO_CONTRATO_TRANSPORTE));
  }
}
