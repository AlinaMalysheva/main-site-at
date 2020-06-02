package ru.geekbrains.main.site.at.lesson3_HW;
/*  Перейти на сайт https://geekbrains.ru/courses    Нажать на кнопку Поиск  В поле Поиск ввести текст: java
Проверить что на странице: Профессий не менее чем 2  Курсов более 15 Вебинаров больше чем 180, но меньше 300
В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
Блогов более 300 Форумов не 350  Тестов не 0
В Проектах и компаниях отображается GeekBrains*/

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchJavaTest extends BaseTestClass{

    @Test
    void events() {
        WebElement testingButton = driver.findElement(By.cssSelector("[id='nav'] [href='/courses']"));
        testingButton.click();

        WebElement buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
        buttonSearch.click();
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");

        wait10second.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(".//header/h2[text()='Проекты и компании']")),"Проекты и компании"));

        WebElement professions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement courses = driver.findElement(By.xpath(".//header/h2[text()='Курсы']"));
        WebElement events = driver.findElement(By.xpath(".//header/h2[text()='Вебинары']"));
        WebElement blogs = driver.findElement(By.xpath(".//header/h2[text()='Блоги']"));
        WebElement forum = driver.findElement(By.xpath(".//header/h2[text()='Форум']"));
        WebElement tests = driver.findElement(By.xpath(".//header/h2[text()='Тесты']"));
        WebElement projectAndCompany = driver.findElement(By.xpath(".//header/h2[text()='Проекты и компании']"));

       /*wait10second.until(ExpectedConditions.textToBePresentInElement(professions,"Профессии"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(courses,"Курсы"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(events,"Вебинары"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(blogs,"Блоги"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(forum,"Форум"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(tests,"Тесты"));
        */



        WebElement profAmount = driver.findElement(By.cssSelector("[id='professions'] [data-tab='professions'] >span"));
        String profAmountStr = profAmount.getText();
        System.out.print(profAmountStr);
        int profAmountInt= Integer. parseInt(profAmountStr);
        System.out.print(profAmountInt);
        Assertions.assertTrue(2<=profAmountInt,"тру-асерт: профессий меньше 2");
        profAmount.click();

    }
}
