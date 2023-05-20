package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Html5Videos {


    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/html5video.html");
    }
    @Test
    public void videoPlayer() throws InterruptedException {
        WebElement videoPlay=driver.findElement(By.id("vplayer"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        String source= (String) js.executeScript("return arguments[0].currentSrc",videoPlay);
        System.out.println(source);
        long duration=(long) js.executeScript("return arguments[0].duration",videoPlay);
        System.out.println(duration);
Assert.assertEquals(25,duration);

    }

    @AfterTest
    public void closepage(){
        driver.quit();
    }
}

