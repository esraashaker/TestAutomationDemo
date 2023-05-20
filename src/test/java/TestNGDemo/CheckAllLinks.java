package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class CheckAllLinks {
    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }
    @Test
    public void Links() throws IOException {
        java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("total links of "+links.size());
        for(int i=0 ; i<links.size();i++){
            WebElement element=links.get(i);
            String url=element.getAttribute("href");
           VerifyOfLink(url);
        }

    }
    public void VerifyOfLink(String UrlLinks) throws IOException {
        try {
            URL link=new URL(UrlLinks);
            HttpURLConnection connect=(HttpURLConnection) link.openConnection();
            connect.setConnectTimeout(2000);
            connect.connect();
            if(connect.getResponseCode()==200){
                System.out.println(UrlLinks+" "+connect.getResponseMessage());
            }
            if(connect.getResponseCode()==404)
            {
                System.out.println(UrlLinks+" "+connect.getResponseMessage());

            }}
            catch(MalformedURLException e){
            e.printStackTrace();
            }
        catch (IOException e){
            e.printStackTrace();
        }


    }
    @AfterTest
    public void closePage(){
        driver.quit();

    }
}


