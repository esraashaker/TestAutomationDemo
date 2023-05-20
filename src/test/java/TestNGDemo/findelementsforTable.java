package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class findelementsforTable {
    ChromeDriver driver;
    @BeforeTest

    public void openUrl(){
        driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
    }
    @Test
    public void table(){
        try {
            WebElement table = driver.findElement(By.id("table1"));
            List<WebElement> rows=table.findElements(By.tagName("tr"));
            System.out.println(rows.size());
            System.out.println(rows.get(1).getText());

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
