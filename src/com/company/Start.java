package com.company;
import jdk.jfr.Timespan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Start {

public static WebDriver OpenChrome()

    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeOptions optionschrome = new ChromeOptions();
        optionschrome.addArguments("--disable-infobars");
        optionschrome.addArguments("no-sandbox");

        WebDriver _driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(_driver, 120);

        _driver.manage().window().maximize();
        return _driver;

    }


}
