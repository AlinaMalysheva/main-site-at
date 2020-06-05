package ru.geekbrains.main.site.at.lesson3_HW;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BaseTestClass {
    public WebDriver driver;
    public WebDriverWait wait10second;

    @BeforeEach
    void openPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        //если раскоментить строку, вылезает ошибка NoClassDefFoundError: org/apache/http/ssl/TrustStrategy
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

        driver.get("https://geekbrains.ru/geek_university/data-science");
        System.out.println();

        //Вопрос - почему не работает этот поиск?
        // driver.findElement(By.className("button>[class=\"c9e3 _311d\"]")).click();

        driver.findElement(By.cssSelector("button>[class=\"svg-icon icon-popup-close-button \"]")).click();
        wait10second = new WebDriverWait(driver, 10);
    }

    @AfterEach
    void closePage() {
        driver.close();
    }
}
