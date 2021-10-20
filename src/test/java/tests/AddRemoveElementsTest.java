package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElementsTest {

    @Test
    public void addTwoElementsAndDeleteOneTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        addElementButton.click();
        addElementButton.click();
        WebElement deleteButton = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        deleteButton.click();
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int numberOfDeleteButton = deleteButtons.size();
        Assert.assertEquals(numberOfDeleteButton, 1);
        driver.quit();
    }
}
