package ru.geekbrains.main.site.at.lesson3_HW;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Header extends BaseTestClass {
    @Test
    void headerTest() {
        WebElement testingButton = driver.findElement(By.cssSelector("[id='nav'] [href='/courses']"));
        testingButton.click();
        System.out.println();
        //почему на этом шаге не падает, а на поиске по id на следующем шаге падает?
        WebElement header = driver.findElement(By.id("top-menu"));
        header.click();
        /*
        почему не получается найти по id? Пробовала с кавычками и без
        WebElement buttonSearch = driver.findElement(By.id("icon-search"));
        WebElement buttonSearch = driver.findElement(By.id("\"icon-search\""));
        WebElement buttonSearch = driver.findElement(By.cssSelector("[id='icon-search']"));
        WebElement buttonSearch = driver.findElement(By.cssSelector("id='icon-search'"));
        */
        WebElement buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
        buttonSearch.click();
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.click();
        WebElement resetSearch = driver.findElement(By.className("search-panel__search-reset"));
        resetSearch.click();
        WebElement buttonLogin = driver.findElement(By.cssSelector("[class='gb-top-menu__item'] [href='/login']"));
        buttonLogin.click();
        WebElement buttonReg = driver.findElement(By.cssSelector("[href='/register']"));
        buttonReg.click();
    }
}
