package org.example.ex07_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Dynamic_WebTables1 {

    @Description("Finding Xpath in dynamic webtables")
    @Test
    public void test_dynamic_webtable() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement web_table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        List<WebElement> table_row = web_table.findElements(By.tagName("tr"));

        for (int i = 0; i < table_row.size(); i++) {

            List<WebElement> table_col = table_row.get(i).findElements(By.tagName("td"));
            for (WebElement c : table_col) {
                System.out.println(c.getText());
            }

//admin
            //Hacker@4321
        }
    }
}
