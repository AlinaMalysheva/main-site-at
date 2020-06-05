package ru.geekbrains.main.site.at.lesson4_HW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.stream.Stream;

@DisplayName("Навигация по сайту")
public class NavigationParamTest extends BaseTestClass {

    @ParameterizedTest
    @MethodSource("paramProvider")
    void testWithMethod(String expectedText, String selector) {
            WebElement testingButton = driver.findElement(By.cssSelector(selector));
            testingButton.click();
            System.out.println();
            String headerText = driver.findElement(By.cssSelector("h2[class='gb-header__title']")).getText();
            System.out.printf("Проверяем %s: в хедере %s", expectedText,headerText);
            Assertions.assertEquals(expectedText, headerText);
    }

    static Stream<Arguments> paramProvider() {

        return Stream.of(
                Arguments.of(new String("Курсы"), new String("[id='nav'] [href='/courses']")),
                Arguments.of(new String("Вебинары"), new String("[id='nav'] [href='/events']")),
                Arguments.of(new String("Форум"), new String("[id='nav'] [href='/topics']")),
                Arguments.of(new String("Тесты"), new String("[id='nav'] [href='/tests']")),
                Arguments.of(new String("Карьера"), new String("[id='nav'] [href='/events']")),
                Arguments.of(new String("Обучение"), new String("[id='nav'] [href='/education']")),
                Arguments.of(new String("Блог"), new String("[id='nav'] [href='/posts']"))
        );
    }
}


/*
       {"[id='nav'] [href='/courses']", "Курсы"};
       {"[id='nav'] [href='/events']", "Вебинары"}
       {"[id='nav'] [href='/topics']", "Форум"},
       {"[id='nav'] [href='/tests']", "Тесты"},
       {"[id='nav'] [href='/career']", "Карьера"},
       {"[id='nav'] [href='/posts']", "Блог"}
*/


/*
@ParameterizedTest
@MethodSource("generator")
void testCalculateMandateI(Mandator value, boolean expected)

// and then somewhere in this test class
private static Stream<Arguments> generator() {

 return Stream.of(
   Arguments.of(new Mandator(..), true),
   Arguments.of(new Mandator(..), false));
}
} */
