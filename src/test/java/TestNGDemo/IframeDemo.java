package TestNGDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeDemo {
    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/Frames.html");
    }
    @Test
    public void Ifram(){
driver.switchTo().frame(1);
WebElement msg=driver.findElement(By.tagName("p"));
        System.out.println(msg.getText());
        Assert.assertEquals("This Frame doesn't have id or name",msg.getText());
       driver.switchTo().defaultContent();
        driver.switchTo().frame("right" );
        WebElement meg2=driver.findElement(By.tagName("p"));
        System.out.println(meg2.getText());


    }
@AfterTest
    public void closepage(){
        driver.quit();
}


}
