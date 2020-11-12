package com.seleniumeasy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

  public static final Target LNK_CONTRATO_TRANSPORTE =
      Target.the("Enlace Contrato de Transporte")
          .located(By.xpath("//a[contains(text(),'Contrato de transporte')]"));

  private PaginaPrincipal() {}
}
