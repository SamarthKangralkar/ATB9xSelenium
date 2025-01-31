package org.example.ex07_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Dynamic_WebTables {
    @Description("WebTables Dynamic")
    @Test
    public void test_Dynamic_Tables() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/webtable.html");

        WebElement table1 = driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]/preceding-sibling::td[1]"));


        String first_part=  "//table/tbody/tr[";
        String second_part= "]/td[";
        String third_part=  "]";

        int row=driver.findElements(By.xpath("//table/tbody/tr")).size();
        int col=driver.findElements(By.xpath("//table/tbody/tr[2]/td")).size();


        for(int i=2;i<=row;i++){
            for(int j=1;j<=col;j++){

                String dynamic_path=first_part+i+second_part+j+third_part;
               // System.out.println(dynamic_path);

                String data = driver.findElement(By.xpath(dynamic_path)).getText();
               // System.out.println(data);
                ////div[@class='oxd-table-card']/div

                if(data.contains("Helen Bennett")){
                    String country_path = dynamic_path+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("---------");
                    System.out.println("Helen Bennett is In -"+country_text);
                }


            }
        }







    }

}