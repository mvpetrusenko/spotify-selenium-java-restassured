package tests.base;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CommonActions {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launch chrome

        driver.manage().window().maximize(); // maximize window
        driver.manage().deleteAllCookies(); // delete all the cookies

        // dynamic wait
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.google.com");

    }
}



//    private ChromeDriver driver;
//
//    public void setDriver(WebDriver driver) {
//        //this.driver = driver;
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        this.driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.get("https://www.youtube.com/");
//    }

