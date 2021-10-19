package kyleTests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"/Users/KyleOrr/Desktop/TSI Training/sonarCloudExample/src/test/resources/sonarCloudExample"},
        glue = {"/Users/KyleOrr/Desktop/TSI Training/sonarCloudExample/src/test/java"})
public class CucumberRunner {

}