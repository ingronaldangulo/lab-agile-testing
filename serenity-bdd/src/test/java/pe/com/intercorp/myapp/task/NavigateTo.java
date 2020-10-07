package pe.com.intercorp.myapp.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pe.com.intercorp.myapp.page.ApplicationHomePage;
import pe.com.intercorp.myapp.page.ApplicationLoginPage;


public class NavigateTo {

    public static Performable theApplicationHomePage() {
        return Task.where("{0} opens the application home page",
                Open.browserOn().the(ApplicationHomePage.class)
        );
    }

    public static Performable theApplicationLoginPage() {
        return Task.where("{0} opens the application login page",
                Open.browserOn().the(ApplicationLoginPage.class)
        );
    }

    /*public static Performable aMissingPage() {
        return Task.where("{0} opens the application home page",
                Open.browserOn().the(WrongPage.class)
        );
    }*/
}
