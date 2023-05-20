package TestNGDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotsDemo {
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
        WebElement section=driver.findElement(By.id("jmm"));
        Assert.assertTrue(section.isDisplayed());
    }
    @AfterMethod
    public void takeScreenshot(ITestResult result) throws IOException {
        if(ITestResult.FAILURE ==result.getStatus()){
            TakesScreenshot img=(TakesScreenshot) driver;
            File source=img.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File(new File("/screenshots/") + result.getName() + ".png"));
        }

    }
    @AfterTest
    public void closePage(){
        driver.quit();
    }
}
