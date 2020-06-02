package ru.geekbrains.main.site.at.lesson3_HW;
/*тут я сделал тест в виде цикла, чтобы уменьшить количество кода. Потом поняла, что это всё один тест.
* Вопрос: можно совместить, чтобы тесты шли в цикле для уменьшения кода, при этом при падении одной итерации цикл
*  дальше выполнялся?*/

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;

public class NavigationTestMiniVers extends BaseTestClass {

    String[][] buttonsList = new String[][]{
            {"[id='nav'] [href='/courses']", "Курсы"},
            {"[id='nav'] [href='/events']", "Вебинары"},
            {"[id='nav'] [href='/topics']", "Форум"},
           {"[id='nav'] [href='/tests']", "Тесты"},
            {"[id='nav'] [href='/career']", "Карьера"},
            {"[id='nav'] [href='/posts']", "Блог"}
    };

    @Test
/*
Сделала цикл, чтобы убрать "много кода", потом поняла, что это все один тест.
Вопрос - как написать цикл, чтобы каждый круг был отдельным тестом?
*/
    void clickTest() {
        int testNumber = 1;
        for (String[] testGoal : buttonsList) {
            WebElement testingButton = driver.findElement(By.cssSelector(testGoal[0]));
            testingButton.click();
            System.out.println();
            String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
            System.out.printf("Тест %d. Проверяем %s: в хедере %s", testNumber,testGoal[1],headerText);
            Assertions.assertEquals(testGoal[1], headerText);
            testNumber++;
        }
    }
}
