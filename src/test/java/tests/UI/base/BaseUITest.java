package tests.UI.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseUITest {


    @BeforeMethod(alwaysRun = true)
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //WebDriver driver = new ChromeDriver(); // launch chrome

        driver.manage().window().maximize(); // maximize window
        driver.manage().deleteAllCookies(); // delete all the cookies

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        String baseUrl = "https://open.spotify.com/";
            //return driver.get();
        driver.get(baseUrl);

        //WebElement acceptCookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(acceptCookies));
//        WebDriverWait wait=new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
//        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        //acceptCookies.click();
        //driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();


        }

}
