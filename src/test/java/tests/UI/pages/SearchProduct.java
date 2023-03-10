package tests.UI.pages;

//import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.UI.base.BaseUITest;


import java.time.Duration;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;


public class SearchProduct extends BaseUITest {

//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//
//        //WebDriver driver = new ChromeDriver(); // launch chrome
//
//        driver.manage().window().maximize(); // maximize window
//        driver.manage().deleteAllCookies(); // delete all the cookies
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    // dynamic wait
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //public static String baseUrl = "https://open.spotify.com/";

    //driver.get();


    //driver.get("https://open.spotify.com/");


    @Test
    public void testSearchProduct() {
        WebDriver driver = new ChromeDriver();
//                WebElement acceptCookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement acceptCookies = driver.findElement(By.xpath("//button[.//text()='Accept Cookies']"));
        acceptCookies.click();


//        WebElement acceptCookies = By.xpath("//button[.//text()='Accept Cookies']");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(acceptCookies)).click();
//




//        WebElement acceptCookies = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("/button[.//text()='Accept Cookies']")));
//        acceptCookies.click();





//        WebElement acceptCookies = driver.findElement(By.cssSelector("input[type='button']"));
//        acceptCookies.click();






//        WebElement search = driver.findElement(By.xpath("//a[contains(@href,'/search')]"));
//        search.click();
//
//        String expected = "https://open.spotify.com/search";
//
//        String actualURL = "https://open.spotify.com/search";
//
//        Assert.assertEquals(expected, actualURL);
//
//        WebElement searchInput = driver.findElement(By.xpath(" //input[@data-testid=\"search-input\"] "));
//        searchInput.sendKeys("Justin Bieber");
//        searchInput.getText();






        //Assert.assertTrue(searchInput.contains("Justin Bieber"));
        //Assert.assertTrue(driver.getPageSource().contains("Justin Bieber");
        //assertEquals(searchInput.getText(), "Justin Bieber");
        //


    }
}


