package TestNGDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFileDemo {
    ChromeDriver driver;
    @BeforeTest
    public void openchrome(){
        driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
    }
    @Test
    public void Uploadfile(){

       String filename="Aws.pdf";
       String filepath=System.getProperty("user.dir")+"/Uploads/"+filename;
       WebElement fileUpload=driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys(filepath);
       WebElement filesubmit=driver.findElement(By.id("file-submit"));
       filesubmit.click();



    }
}
