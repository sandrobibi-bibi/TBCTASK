package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.company.BaseLayer.WaitUntilVisible;
import static com.company.BaseLayer.ClickToElement;

public class Main
{

    public static void main(String[] args) {

    WebDriver driver = Start.OpenChrome();
    try
    {
        Thread.sleep(2000);
         WebDriverWait wait = new WebDriverWait(driver, 120);
         driver.get("http://the-internet.herokuapp.com");

         Thread.sleep(2000);

         WaitUntilVisible(wait,"//*[contains(text(),'File Upload')]");
         BaseLayer.ClickToElement(driver, "//*[contains(text(),'File Upload')]");

        Thread.sleep(2000);

     }
     catch (InterruptedException e)
     {
         //NOTHING TO CATCH
     }


        driver.close();

    }
}
