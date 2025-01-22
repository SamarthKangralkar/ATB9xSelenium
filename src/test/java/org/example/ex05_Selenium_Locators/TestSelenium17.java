package org.example.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17 {

    @Description("Verify that with invalid email, pass, error message is displayed")
    @Test
    public void test_negative_Vwo_login() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com");

       WebElement username=  driver.findElement(By.id("login-username"));
       username.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("samarth");

        WebElement Login_button = driver.findElement(By.id("js-login-btn"));
        Login_button.click();
Thread.sleep(3000);
        WebElement Error_message=driver.findElement(By.className("notification-box-description"));
        //Error_message.getText().equals("Your email, password, IP address or location did not match");
        Assert.assertEquals(Error_message.getText(),"Your email, password, IP address or location did not match");



    }
}
