package com.ibgimenez.opencart.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.ibgimenez.opencart.stepDefinitions","com.ibgimenez.opencart.hooks"},
    snippets = CucumberOptions.SnippetType.CAMELCASE
    )

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
