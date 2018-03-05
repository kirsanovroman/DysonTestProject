package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class YandexResultPage extends BasePageClass {

    public YandexResultPage(WebDriver driver) {
        super(driver);
    }
    @Step ("Открытие официального сайта компании Dyson")
    public DysonHomePage openDysonOfficialPage() {
       String URL = driver.findElement(By.xpath("//a[@href='https://www.dyson.com.ru/']")).getAttribute("href");
        driver.get(URL+"dyson-vacuums");
//        driver.get("https://www.dyson.com.ru/dyson-vacuums");
//        driver.findElement(By.xpath("//a[@href='https://www.dyson.com.ru/']")).click();
        return new DysonHomePage(driver);
    }
}
