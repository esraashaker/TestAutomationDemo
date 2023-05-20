package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchWithgoogle {
    ChromeDriver driver;
    WebElement search;
    @BeforeTest

    public void openUrl(){
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");
    }
    @Test
    public void search(){
        try {
            search = driver.findElement(By.id("APjFqb"));
            search.sendKeys("facebook login");
            search.submit();
            WebElement search = driver.findElement(By.id("APjFqb"));
            search.clear();
            search.sendKeys("instgram");
            search.submit();
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
