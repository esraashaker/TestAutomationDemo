package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleclickWithAction {

    ChromeDriver driver;

    @BeforeTest

    public void openUrl() {
        driver = new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");
    }

    @Test
    public void doubleclick() {
        WebElement message= driver.findElement(By.id("message"));
        Actions bulider=new Actions(driver);
        bulider.doubleClick(message).perform();



        }

    }



