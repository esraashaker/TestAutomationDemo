package TestNGDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javascriptPrompt {
    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
    }
    @Test
    public void PromptText(){

        WebElement btnPrompt=driver.findElement(By.id("prompt"));
        btnPrompt.click();
        Alert alertText=driver.switchTo().alert();
        alertText.sendKeys("Esraa");
        alertText.accept();
        WebElement message=driver.findElement(By.id("prompt_demo"));
      Assert.assertEquals("Hello Esraa! How are you today?", message.getText());


    }
}
