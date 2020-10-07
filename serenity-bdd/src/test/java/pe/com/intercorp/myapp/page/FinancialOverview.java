package pe.com.intercorp.myapp.page;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.openqa.selenium.By;


import java.util.List;

public class FinancialOverview {
    public static By CREDIT_AVAILIABLE = By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");

    public static By DUE_TODAY = By.xpath("//div[contains(text(), 'Due Today')]/following-sibling::div[@class='balance-value danger']");
}
