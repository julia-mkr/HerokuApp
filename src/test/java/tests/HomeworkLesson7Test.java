package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeworkLesson7Test {

    @Test
    public void findTableTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement table = driver.findElement(By.id("second_row"));
        boolean isTableDisplayed = table.isDisplayed();
        Assert.assertTrue(isTableDisplayed);
        driver.quit();
    }

    @Test
    public void findEmailFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement emailField = driver.findElement(By.name("email"));
        boolean isEmailFieldDisplayed = emailField.isDisplayed();
        Assert.assertTrue(isEmailFieldDisplayed);
        driver.quit();
    }

    @Test
    public void findPasswordFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement passwordField = driver.findElement(By.name("password"));
        boolean isPasswordFieldDisplayed = passwordField.isDisplayed();
        Assert.assertTrue(isPasswordFieldDisplayed);
        driver.quit();
    }

    @Test
    public void findFirstCheckBoxTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement firstCheckbox = driver.findElement(By.id("first"));
        firstCheckbox.click();
        boolean isFirstCheckboxDisplayed = firstCheckbox.isDisplayed();
        Assert.assertTrue(isFirstCheckboxDisplayed);
        driver.quit();
    }

    @Test
    public void findSecondCheckBoxTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement secondCheckbox = driver.findElement(By.id("second"));
        secondCheckbox.click();
        boolean isSecondCheckboxDisplayed = secondCheckbox.isDisplayed();
        Assert.assertTrue(isSecondCheckboxDisplayed);
        driver.quit();
    }

    @Test
    public void findThirdCheckBoxTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement thirdCheckbox = driver.findElement(By.id("second"));
        thirdCheckbox.click();
        boolean isThirdCheckboxDisplayed = thirdCheckbox.isDisplayed();
        Assert.assertTrue(isThirdCheckboxDisplayed);
        driver.quit();
    }

    @Test
    public void findDropdownMenuTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement dropdownMenu = driver.findElement(By.name("options"));
        boolean isDropdownMenuDisplayed = dropdownMenu.isDisplayed();
        Assert.assertTrue(isDropdownMenuDisplayed);
        driver.quit();
    }

    @Test
    public void chooseOptionFromDropDownMenuTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        Select select = new Select(driver.findElement(By.name("options")));
        select.selectByVisibleText("Option 3");
        String textOfOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(textOfOption, "Option 3");
        driver.quit();
    }

    @Test
    public void findGoogleButtonTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement googleButton = driver.findElement(By.xpath("//*[@id='button']/a[1]/button"));
        boolean isGoogleButtonDisplayed = googleButton.isDisplayed();
        Assert.assertTrue(isGoogleButtonDisplayed);
        driver.quit();
    }

    @Test
    public void findNetflixButtonTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement netflixButton = driver.findElement(By.xpath("//*[@id='button']/a[2]/button"));
        boolean isNetflixButtonDisplayed = netflixButton.isDisplayed();
        Assert.assertTrue(isNetflixButtonDisplayed);
        driver.quit();
    }

    @Test
    public void findSpotifyButtonTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement spotifyButton = driver.findElement(By.xpath("//*[@id='button']/a[3]/button"));
        boolean isSpotifyButtonDisplayed = spotifyButton.isDisplayed();
        Assert.assertTrue(isSpotifyButtonDisplayed);
        driver.quit();
    }

    @Test
    public void findFirstImageTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement firstImage = driver.findElement(By.xpath("//*[@title='Samoyed puppy']"));
        boolean isFirstImageDisplayed = firstImage.isDisplayed();
        Assert.assertTrue(isFirstImageDisplayed);
        driver.quit();
    }

    @Test
    public void findSecondImageTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement secondImage = driver.findElement(By.xpath("//*[@title='Husky']"));
        boolean isSecondImageDisplayed = secondImage.isDisplayed();
        Assert.assertTrue(isSecondImageDisplayed);
        driver.quit();
    }

    @Test
    public void findThirdImageTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement thirdImage = driver.findElement(By.xpath("//*[@title='Cat']"));
        boolean isThirdImageDisplayed = thirdImage.isDisplayed();
        Assert.assertTrue(isThirdImageDisplayed);
        driver.quit();
    }

    @Test
    public void findFirstParagraphTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement firstParagraph = driver.findElement(By.xpath("//*[@id='paragraph']/p[1]"));
        boolean isFirstParagraphDisplayed = firstParagraph.isDisplayed();
        Assert.assertTrue(isFirstParagraphDisplayed);
        driver.quit();
    }

    @Test
    public void findSecondParagraphTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement secondParagraph = driver.findElement(By.xpath("//*[@id='paragraph']/p[2]"));
        boolean isSecondParagraphDisplayed = secondParagraph.isDisplayed();
        Assert.assertTrue(isSecondParagraphDisplayed);
        driver.quit();
    }

    @Test
    public void findW3schoolsLinkTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement w3schoolsLink = driver.findElement(By.linkText("W3schools"));
        boolean isW3schoolsLinkDisplayed = w3schoolsLink.isDisplayed();
        Assert.assertTrue(isW3schoolsLinkDisplayed);
        driver.quit();
    }

    @Test
    public void findTwitterLinkTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement twitterLink = driver.findElement(By.linkText("Twitter"));
        boolean isTwitterLinkDisplayed = twitterLink.isDisplayed();
        Assert.assertTrue(isTwitterLinkDisplayed);
        driver.quit();
    }

    @Test
    public void findProductHuntLinkTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Julie\\Desktop\\HerokuApp\\src\\test\\java\\tests\\homeworkLesson7.html");
        WebElement productHuntLink = driver.findElement(By.linkText("Product Hunt"));
        boolean isProductHuntLinkDisplayed = productHuntLink.isDisplayed();
        Assert.assertTrue(isProductHuntLinkDisplayed);
        driver.quit();
    }
}
