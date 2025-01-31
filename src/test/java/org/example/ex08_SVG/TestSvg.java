package org.example.ex08_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSvg {
    @Description("Testing of SVG in Flipkart Search box")
    @Test
    public  void test_svg_flipkart() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.flipkart.com/");

        WebElement search = driver.findElement(By.xpath("//input[@name='q']"));

        search.sendKeys("macmini");
        List<WebElement> svg=driver.findElements(By.xpath("//*[name()=\"svg\"]"));
        svg.get(0).click();














    }
}
