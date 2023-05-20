package TestNGDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class findelementforLoginpage {

    ChromeDriver driver;
   @BeforeTest
    public void openUrl(){
         driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @Test
    public void Login(){
       try {
           WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
           userName.sendKeys("tomsmith");
           System.out.println(userName.getSize());
           WebElement Password = driver.findElement(By.name("password"));
           Password.sendKeys("SuperSecretPassword!");

           System.out.println(Password.getTagName());
           WebElement loginbtn = driver.findElement(By.tagName("button"));
           loginbtn.click();
           WebElement successNot = driver.findElement(By.id("flash"));
           System.out.println(successNot.getText());
           Assert.assertTrue(successNot.getText().contains("You logged into a secure area!"));
       }
    catch (  NoSuchElementException n){
        System.out.println("The element not found please try another attribute");
    }

   }
    @AfterTest
   public void closePage(){
       driver.quit();

   }



}
