package ru.rambler;

import com.blazedemo.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RamblerTest extends BaseTest {

    @Test
    public void test(){

        driver.get("http://rambler.ru");
        WebElement weather = driver.findElement(By.xpath("//*[@data-cerber-head='main::widgets::widget.weather']/a/div"));
        String value = weather.getCssValue("background-image");
        String weatherCode = value.substring(42,value.length()-6);
        //url("https://www.rambler.ru/i/weather/big/cloudy.svg")
        switch (weatherCode) {
            case "clear":
                System.out.println("Ясно");
                break;
            case "clear-night":
                System.out.println("Ясно (ночь)");
                break;
            case "cloudy":
                System.out.println("Облачно");
                break;
            case "fog":
                System.out.println("Туман");
                break;
            case "light-rain":
                System.out.println("Слабый дождь");
                break;
            case "light-rain-night":
                System.out.println("Слабый дождь (ночь)");
                break;
            case "light-snow-night":
                System.out.println("Слабый снег (ночь)");
                break;
            case "occ-rain":
                System.out.println("Временами дождь");
                break;
            case "occ-snow":
                System.out.println("Временами снег");
                break;
            case "partly-cloudy":
                System.out.println("Переменная облачность");
                break;
            case "partly-cloudy-night":
                System.out.println("Переменная облачность (ночь)");
                break;
            case "rain":
                System.out.println("Дождь");
                break;
            case "rain-night":
                System.out.println("Дождь(ночь)");
                break;
            case "sleet":
                System.out.println("Снег с дождем");
                break;
            case "snow":
                System.out.println("Снег");
                break;
            case "snow-night":
                System.out.println("Снег (ночь)");
                break;
            case "thunder":
                System.out.println("Гроза");
                break;
        }
    }
}
