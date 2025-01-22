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

public class TestSelenium20 {

    @Description()
    @Test()
    public void test_katalon_login() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment.click();
        Thread.sleep(3000);
        WebElement Username= driver.findElement(By.xpath("//input[@id='txt-username']"));
        Username.sendKeys("John Doe");

        List<WebElement> password = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password.get(1).sendKeys("ThisIsNotAPassword");


        WebElement login_button= driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_button.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        WebElement email = driver.findElement(By.xpath("//label[text()='Email address']"));


        WebElement pass=driver.findElement(By.xpath("//label[contains(text(),'Password')"));

    }
}
