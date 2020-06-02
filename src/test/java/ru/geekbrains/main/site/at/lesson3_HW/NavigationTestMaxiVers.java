package ru.geekbrains.main.site.at.lesson3_HW;
/*Вынести проверку каждой страницы в отдельный тест
Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как минимум самого блока)
(Дополнительное задание, тема следующего занятия)
Cоздать классы Header и Footer в которых создать локаторы ко всем элементам в этих блоках*/

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class NavigationTestMaxiVers extends BaseTestClass  {

   public String[][] buttonsList = new String[][]{
            {"[id='nav'] [href='/courses']", "Курсы"},
            {"[id='nav'] [href='/events']", "Вебинары"},
            {"[id='nav'] [href='/topics']", "Форум"},
            {"[id='nav'] [href='/tests']", "Тесты"},
            {"[id='nav'] [href='/career']", "Карьера"},
            {"[id='nav'] [href='/posts']", "Блог"},
            {"[id='nav'] [href='/education']", "Обучение"},
    };//button>svg

   @Test
   void clickCourses() {
            WebElement testingButton = driver.findElement(By.cssSelector(buttonsList[0][0]));
            testingButton.click();
            System.out.println();
            String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
            System.out.printf("Хедер на странице есть. Проверяем %s: в хедере %s", buttonsList[0][0],headerText);
            Assertions.assertEquals(buttonsList[0][1], headerText);
   }
    @Test
    void clickEvents() {
        WebElement testingButton = driver.findElement(By.cssSelector(buttonsList[1][0]));
        testingButton.click();
        System.out.println();
        String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
        System.out.printf("Проверяем %s: в хедере %s", buttonsList[1][0],headerText);
        Assertions.assertEquals(buttonsList[1][1], headerText);
    }
    @Test
    void clickTopics() {
            WebElement testingButton = driver.findElement(By.cssSelector(buttonsList[2][0]));
            testingButton.click();
            System.out.println();
            String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
            System.out.printf("Проверяем %s: в хедере %s", buttonsList[2][0],headerText);
            Assertions.assertEquals(buttonsList[2][1], headerText);
    }
    @Test
    void clickEducation() {
        WebElement testingButton = driver.findElement(By.cssSelector(buttonsList[6][0]));
        testingButton.click();
        System.out.println();
        String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
        System.out.printf("Проверяем %s: в хедере %s", buttonsList[6][0],headerText);
        Assertions.assertEquals(buttonsList[6][1], headerText);
    }
    @Test
    void clickTests() {
        WebElement testingButton = driver.findElement(By.cssSelector(buttonsList[3][0]));
        testingButton.click();
        System.out.println();
        String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
        System.out.printf("Проверяем %s: в хедере %s", buttonsList[3][0],headerText);
        Assertions.assertEquals(buttonsList[3][1], headerText);
    }
    @Test
    void clickCareer() {
        WebElement testingButton = driver.findElement(By.cssSelector(buttonsList[4][0]));
        testingButton.click();
        System.out.println();
        String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
        System.out.printf("Проверяем %s: в хедере %s", buttonsList[4][0],headerText);
        Assertions.assertEquals(buttonsList[4][1], headerText);
    }
    @Test
    void clickPosts() {
        WebElement testingButton = driver.findElement(By.cssSelector(buttonsList[5][0]));
        testingButton.click();
        System.out.println();
        String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
        System.out.printf("Проверяем %s: в хедере %s", buttonsList[5][0],headerText);
        Assertions.assertEquals(buttonsList[5][1], headerText);
    }
}
