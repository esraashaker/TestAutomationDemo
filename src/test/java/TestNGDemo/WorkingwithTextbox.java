package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithTextbox
{

    ChromeDriver driver;
    @BeforeTest

    public void openUrl(){
        driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
    }
    @Test
    public void textBox(){

     Select option= new Select(driver.findElement(By.id("dropdown")));
     Assert.assertFalse(option.isMultiple());
        option.selectByIndex(1);
    }
//    @AfterTest
//    public void closePage(){
//        driver.quit();

 //   }




}
