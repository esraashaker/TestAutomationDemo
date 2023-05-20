package TestNGDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionsForfacebookPage {

    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
    }
    @Test
    public void getTitle(){
        String title= driver.getTitle();
        Assert.assertEquals(title,"Facebook – log in or sign up");
    }
    @AfterTest
    public void closePage(){
        driver.quit();

    }
}


