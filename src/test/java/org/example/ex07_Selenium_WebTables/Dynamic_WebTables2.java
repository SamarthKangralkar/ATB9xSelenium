package org.example.ex07_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Dynamic_WebTables2 {

    @Description("Task : Dynamic WebTables : Printing of table data from OrangeHRM Site")
    @Test
    public  void test_dynamic_table() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        //admin
        //Hacker@4321
        Thread.sleep(3000);
        WebElement user_name=driver.findElement(By.xpath("//input[@name=\"username\"]"));
        WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        user_name.sendKeys("admin");
        pass.sendKeys("Hacker@4321");

        WebElement btn_click= driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"]/following-sibling::div[2]/button"));
        btn_click.click();

        //The Logic of Fecthing the Web Table Data and Displaying in Console

        ////div[@class="oxd-table-body"]/div/div/div
        Thread.sleep(4000);
WebElement tabl= driver.findElement(By.xpath("//div[@class=\"oxd-table-body\"]"));

        List<WebElement>tabl_row= tabl.findElements(By.xpath("//div[@class=\"oxd-table-card\"]/div"));


        for(int i=0;i<tabl_row.size();i++) {
            List<WebElement> tabl_col =tabl_row.get(i).findElements(By.xpath("div"));

            for (WebElement c : tabl_col) {
                System.out.println(c.getText());

            }

        }


    }
}
