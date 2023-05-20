package TestNGDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CookiesStore {
    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("http://magento-demo.lexiconn.com/");
    }
    @Test
    public void AlertText(){

        WebElement languageSelected=driver.findElement(By.id("select-language"));
        Select select =new Select(languageSelected);
        Cookie storeCookies=driver.manage().getCookieNamed("store");
        select.selectByVisibleText("German");
        storeCookies=driver.manage().getCookieNamed("store");
        Assert.assertEquals("german",storeCookies.getValue());
        System.out.println(storeCookies.getValue());
    }
}
