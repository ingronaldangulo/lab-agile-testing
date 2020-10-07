package pe.com.intercorp.myapp.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import pe.com.intercorp.myapp.page.FinancialOverview;

public class Overviewdata {

    //Segunda forma: FACTORY de obtener informacion de un elemento
    //Ventajas: Puedo agregar muchos elementos.

    public static Question<String> creditAvailable(){
        return actor -> TextContent.of(FinancialOverview.CREDIT_AVAILIABLE).viewedBy(actor).asString().trim();
    }

    public static Question<String> dueToday(){
        return actor -> TextContent.of(FinancialOverview.DUE_TODAY).viewedBy(actor).asString();
    }
}
