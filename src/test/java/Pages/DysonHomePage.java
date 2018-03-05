package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class DysonHomePage extends BasePageClass {
    public DysonHomePage(WebDriver driver) {
        super(driver);
        
    }

    @Step("Выбор элемента '{nameElement}' из выпадающего списка '{nameList}'")
    public PageFromDropDownList dropDownSelect(String nameList, String nameElement) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText(nameList))).perform();
        Thread.sleep(2000);
        action.click(driver.findElement(By.linkText(nameElement))).perform();
        return new PageFromDropDownList(driver);
    }

    @Step("Проверка наличия элемента '{nameOfElement}' на странице")
    public void checkElementPresence(String nameOfElement) {
        Assert.assertTrue(isElementPresent(By.xpath("//img[contains(@src,'"+nameOfElement+"')]")),"Элемент отсутствует на странице");
    }
}
