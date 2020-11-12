package com.seleniumeasy.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/descarga.pdf.feature",
    glue = {"com.seleniumeasy.stepdefinitions"})
public class DescargarPDFRunner {}
