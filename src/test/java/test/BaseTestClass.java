package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTestClass {
    public WebDriver driver;
    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        System.out.println("Окончание вызова setUp");
    }
    @AfterClass
    public void tearsDown() {
        driver.quit();
        System.out.println("Окончание вызова tearsDown");
    }
}
