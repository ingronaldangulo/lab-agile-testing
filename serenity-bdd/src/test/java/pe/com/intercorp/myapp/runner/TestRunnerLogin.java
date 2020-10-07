package pe.com.intercorp.myapp.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature"
        , glue = { "pe.com.intercorp.myapp.definition.Login"}
        , tags = "@RELEASE_1.0")
public class TestRunnerLogin {

}
