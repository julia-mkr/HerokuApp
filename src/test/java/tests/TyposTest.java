package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest {

    @Test
    public void findTyposInTextTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/typos");
        String textForSpellingCheck = driver.findElement(By.xpath("//*[@id='content']/div/p[2]")).getText();
        Assert.assertEquals(textForSpellingCheck, "Sometimes you'll see a typo, other times you won't.");
        driver.quit();
    }
}
