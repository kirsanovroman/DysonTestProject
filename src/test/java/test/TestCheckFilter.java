package test;//package test;

import Pages.DysonHomePage;
import Pages.PageFromDropDownList;
import Pages.YandexResultPage;
import Pages.YandexSearchPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckFilter extends BaseTestClass {
    @Test
    @Description("Проверка официального сайта пылесосов Dyson")
    public void TestCheckFilter() throws InterruptedException {
        YandexSearchPage yaPage = new YandexSearchPage(driver);
        yaPage.openYaSearchPage();
        YandexResultPage resultPage = yaPage.sendingSearchQuery("пылесос Dyson");
        DysonHomePage dysonHomePage = resultPage.openDysonOfficialPage();
        dysonHomePage.checkElementPresence("SMALLBALL");
        PageFromDropDownList pageFromDropDownList=dysonHomePage.dropDownSelect("Ассортимент", "Насадки и аксессуары");
        pageFromDropDownList.checkPresenceOfElementOnAccesoriesPage("Фильтр для очистителя воздуха");

    }

}
