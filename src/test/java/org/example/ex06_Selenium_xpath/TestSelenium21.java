package org.example.ex06_Selenium_xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21 {
@Description("Testing Login Page of Appvwo using Xpath")
@Test
    public void test_appvow_login_xpath() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com/");

        WebElement email = driver.findElement(By.xpath("//label[text()='Email address']"));
    System.out.println(email.getText());

     // WebElement pass = driver.findElement(By.xpath("//label[text()='Password']"));

 WebElement pass = driver.findElement(By.xpath("//label[contains(text(),'Password')]"));
//label[contains(text(),'Password')]

    System.out.println(pass.getText());

}
}
