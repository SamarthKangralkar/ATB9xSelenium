package org.example.ex07_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium_WebTables {

    @Description("WebTables")
    @Test
    public void test_WebTables(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/webtable.html");

        WebElement table1=  driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]/preceding-sibling::td[1]"));

       WebElement table=  driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/following-sibling::td"));
       System.out.println(table1.getText()  +  table.getText());






    }

}
