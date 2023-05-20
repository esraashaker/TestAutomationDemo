package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFileUsingRobot {

        ChromeDriver driver;
        @BeforeTest
        public void openchrome(){
            driver=new ChromeDriver();
            driver.navigate().to("https://the-internet.herokuapp.com/upload");
        }
        @Test
        public void UploadfileWithRobot() throws AWTException, InterruptedException {

            String filename="Aws.pdf";
            //to copy file path
            String filepath=System.getProperty("user.dir")+"\\Uploads"+filename;
           WebElement open =driver.findElement(By.id("file-upload"));
           open.click();
            Robot robot=new Robot();
            StringSelection  selection=new StringSelection(filepath);
            Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
            clip.setContents(selection,null);
            //to click on ctrl v

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);
            //to click on upload
            WebElement fileSubmit=driver.findElement(By.id("file-submit"));
            fileSubmit.click();



        }
}
