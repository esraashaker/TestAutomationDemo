package TestNGDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindows {

    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/Config.html");
    }
    @Test
    public void switchWithwindows(){
       String window=driver.getWindowHandle();
        driver.findElement(By.id("visitbutton")).click();
        driver.switchTo().window("VisitUsWindow");
        Assert.assertEquals("Visit Us",driver.getTitle());
       driver.close();
        driver.switchTo().window(window);
    }
}
