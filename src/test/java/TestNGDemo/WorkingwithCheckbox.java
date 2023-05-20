package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithCheckbox {
    ChromeDriver driver;
    @BeforeTest

    public void openUrl(){
        driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
    }
    @Test(enabled = false)
    public void checkBox(){

            WebElement checkbox1=driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
              checkbox1.click();
            WebElement checkbox2=driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
            if(checkbox2.isSelected()) {

                checkbox2.click();
            }}
            @Test
            public void testpresentforCheckbox(){
        if(isElementPresent(By.xpath("//*[@id='checkboxes']/input[1]"))){
            WebElement checkbox1=   driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
            if(!checkbox1.isSelected()){
            checkbox1.click();
        }}
        else {
            Assert.fail("check box1 doesnt exist");
        }

        }



 private boolean isElementPresent(By by){
                try{
                   driver.findElement(by) ;
                   return true;
                }
                catch(NoSuchElementException e){
                    return false;
            }

        }





}
