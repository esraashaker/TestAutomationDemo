package TestNGDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertWithjavascript {

    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
    }
    @Test
    public void AlertText(){

        WebElement btnAlert=driver.findElement(By.id("simple"));
        btnAlert.click();
        Alert alerttext=driver.switchTo().alert();
        String textshow=alerttext.getText();
         Assert.assertEquals("Hello! I am an alert box!",textshow);
        alerttext.accept();

    }

}
