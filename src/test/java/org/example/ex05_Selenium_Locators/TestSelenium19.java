package org.example.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium19 {
    @Description("Verify that after adding existing email in singup page proper message is displayed")
    @Test
    public void test_(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://vwo.com/free-trial");

        WebElement business_email=driver.findElement(By.id("page-v1-step1-email"));
        business_email.sendKeys("admin@admin.com");

        WebElement check_box=driver.findElement(By.name("gdpr_consent_checkbox"));
        check_box.click();

        List<WebElement> button_list = driver.findElements(By.tagName("Button"));
        button_list.get(0).click();
    }
}
