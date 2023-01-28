package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeOutVariables.EXPLICIT_WAIT;

public class BasicPage {
    // creating sample of driver
    protected WebDriver driver;

    // creating a constructor
    public BasicPage(WebDriver driver){
        this.driver = driver;
    }

    public void openPages(String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
