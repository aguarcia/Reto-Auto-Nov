package com.seleniumeasy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AnexoContratoTransporte {
  public static final Target LNK_DESCARGA_PDF =
      Target.the("Enlace a descarga de PDF")
          .located(By.xpath("//a[contains(text(),'Anexo contrato transporte para Colombia')]"));

  private AnexoContratoTransporte() {}
}
