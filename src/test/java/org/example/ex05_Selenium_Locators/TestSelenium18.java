package org.example.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium18 {

    @Description("Verify that we are able to click on the start trial link and its navigating to next page.")
    @Test
    public void test_(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/");

        WebElement linktext = driver.findElement(By.linkText("Start a free trial"));
        linktext.click();

    }
}
