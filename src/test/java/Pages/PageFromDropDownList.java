package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageFromDropDownList extends BasePageClass {

    public PageFromDropDownList(WebDriver driver) {
        super(driver);
    }
    @Step("Проверка наличия элемента '{nameOfElement}' на странице аксессуаров")
    public void checkPresenceOfElementOnAccesoriesPage(String nameOfElement) {
        Assert.assertTrue(isElementPresent(By.linkText(nameOfElement)),"Элемент отсутствует на странице");

    }
}
