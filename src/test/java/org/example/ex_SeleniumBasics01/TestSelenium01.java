package org.example.ex_SeleniumBasics01;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
@Description("Open the app.vwo.com and get the title")
    @Test
    public void TestCase1(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/");
        System.out.println(driver.getTitle());
    }

}
