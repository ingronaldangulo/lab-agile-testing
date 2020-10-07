package pe.com.intercorp.myapp.question;

import lombok.Builder;
import lombok.Data;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import pe.com.intercorp.myapp.page.FinancialOverview;

@Data
@Builder
public class CreditAvailable{


    //Primera manera
    /*public static Question<String> value(){
        return new CreditAvailable();
    }*/

    //Segunda manera
    /*@Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinancialOverview.CREDIT_AVAILIABLE).getText();
    }*/

    public static Question<String> amount() {
        return actor -> TextContent.of(FinancialOverview.CREDIT_AVAILIABLE).viewedBy(actor).asString();
    }




}
