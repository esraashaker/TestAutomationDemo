package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropaction {

    ChromeDriver driver;

    @BeforeTest

    public void openUrl() {
        driver = new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/DragDropDemo.html");
    }

    @Test
    public void drobAndDrag() {
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));

        Actions bulider=new Actions(driver);
        bulider.dragAndDrop(source,target).perform();
        Assert.assertEquals("Dropped!",target.getText());


    }




}
