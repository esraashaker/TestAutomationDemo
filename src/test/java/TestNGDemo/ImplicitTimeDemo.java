package TestNGDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitTimeDemo {

    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/AjaxDemo.html");
        driver.manage().window().maximize();


    }
    @Test
    public void ImplicitTime(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Page 3")).click();
        WebElement message=driver.findElement(By.id("page3"));
       Assert.assertTrue(message.getText().contains("Donec in massa vel lectus a"));



    }
    @AfterTest
    public void closePage(){
        driver.quit();
    }
}
