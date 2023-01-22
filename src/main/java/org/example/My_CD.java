package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class My_CD {

    static WebDriver driver;
    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/register");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;
    }

    public static  void closeDriver(){
        driver.quit();
    }
}
