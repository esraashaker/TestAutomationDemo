package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavascriptScroll {

    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.jumia.com.eg/");
    }
    @Test
    public void getTitleByjs(){
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");
        WebElement section=driver.findElement(By.id("jm"));
        Assert.assertTrue(section.isDisplayed());
    }
    @AfterTest
    public void closePage(){
        driver.quit();
    }



}
