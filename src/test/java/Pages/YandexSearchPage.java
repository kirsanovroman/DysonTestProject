package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class YandexSearchPage extends BasePageClass {

    public YandexSearchPage(WebDriver driver) {
        super(driver);
    }
    @Step("Открытие поисковой страницы Яндекс")
    public void openYaSearchPage() {
        driver.get("https://yandex.ru/");
    }

    @Step("Осуществление поискового запроса '{input}'")
    public YandexResultPage sendingSearchQuery(String input) {
//        driver.findElement(By.xpath("//input[@aria-label='Запрос']")).sendKeys(input);
        driver.findElement(By.xpath("//div[@class='search2__input']//input[@class='input__control input__input']")).sendKeys(input);

        driver.findElement(By.xpath("//button[span[contains(text(),'Найти')]]")).click();
        return new YandexResultPage(driver);
    }
}
