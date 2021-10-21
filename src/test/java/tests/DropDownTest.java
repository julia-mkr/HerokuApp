package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest {

    @Test
    public void checkAllOptionsOfDropdownListTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select dropdownElements = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> options = dropdownElements.getOptions();
        int numberOfOptions = options.size();
        Assert.assertEquals(numberOfOptions, 3);
        driver.quit();
    }

    @Test
    public void checkFirstOptionTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select dropdownElements = new Select(driver.findElement(By.id("dropdown")));
        dropdownElements.selectByValue("1");
        driver.quit();
    }

    @Test
    public void checkSecondOptionTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select dropdownElements = new Select(driver.findElement(By.id("dropdown")));
        dropdownElements.selectByValue("2");
        driver.quit();
    }
}
