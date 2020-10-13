package com.company;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseLayer {


    public static void WaitUntilVisible(WebDriverWait wait, String element) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        }
      catch (Exception e)
            {
                System.out.print("Element is not Visible");
            }
        }

    public static void ClickToElement(WebDriver driver, String element) {

     driver.findElement(By.xpath(element)).click();

    }
    }