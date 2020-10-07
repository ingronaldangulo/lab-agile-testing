package pe.com.intercorp.myapp.definition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import pe.com.intercorp.myapp.question.CreditAvailable;
import pe.com.intercorp.myapp.question.Overviewdata;
import pe.com.intercorp.myapp.task.LoginWith;
import pe.com.intercorp.myapp.task.NavigateTo;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;



public class Login {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) has an active account")
        public void sergey_has_an_active_account(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theApplicationLoginPage());
    }

    @When("he sends their valid {string} and {string}")
    public void he_sends_their_valid_and(String username, String password) {
        theActorInTheSpotlight().attemptsTo( LoginWith.credentials(username, password) );
    }


    @Then("he should have access to manage his account.")
    public void he_should_have_access_to_manage_his_account() {
        //Assert.assertThat(CreditAvailable.amount().answeredBy(theActorInTheSpotlight()), containsString("$"));
        theActorInTheSpotlight().should(
                seeThat("The displayed credit available", Overviewdata.creditAvailable(), equalTo("$17,800"))
        );
    }
}
