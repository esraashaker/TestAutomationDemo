package TestNGDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavascriptCallDemo {

    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");
    }
    @Test
    public void getTitleByjs(){
        JavascriptExecutor js =(JavascriptExecutor) driver;
        String title= (String) js.executeScript("return document.title");
        System.out.println(title);
        Assert.assertEquals("Google",title);
        long links=(long) js.executeScript("var links=document.getElementsByTagName('a');return links.length");
        System.out.println(links);

    }
    @AfterTest
    public void closePage(){
        driver.quit();

    }
}
