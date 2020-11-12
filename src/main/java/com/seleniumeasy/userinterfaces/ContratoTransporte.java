package com.seleniumeasy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContratoTransporte {

    public static final Target LNK_ANEXO_CONTRATO_TRANSPORTE =
            Target.the("Enlace a Anexo de Contrato de Transporte").located(By.xpath("//a[contains(text(),'Anexo contrato transporte para Colombia')]"));

    private ContratoTransporte(){

    }
}
