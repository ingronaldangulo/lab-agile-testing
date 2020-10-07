package pe.com.intercorp.myapp.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pe.com.intercorp.myapp.page.LoginForm;


public class LoginWith implements  Task{

    private final String username;
    private final String password;

    public LoginWith(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable credentials(String username, String password){
        return Tasks.instrumented(LoginWith.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Clear.field(LoginForm.USERNAME_FIELD),
                Clear.field(LoginForm.PASSWORD_FIELD),
                Enter.theValue(username).into(LoginForm.USERNAME_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)
        );

    }


}
