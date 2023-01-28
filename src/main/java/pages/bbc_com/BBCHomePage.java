//package pages.bbc_com;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import pages.base.BasicPage;
//
//public class BBCHomePage extends BasicPage {
//    public BBCHomePage(WebDriver driver) {
//        super(driver);
//    }
//
//    private final By sportCategory = By.xpath("//nav[@class = \"orbit-header-links international\"]/ul//a[@href=\"https://www.bbc.com/sport\"]");
//    private final By categoryGolf = By.xpath("//span[contains(text(),\"Golf\")]");
//
//    public findCategory(){
//        this();
//
//        driver.findElement(sportCategory).click();
//
//        driver.findElement(categoryGolf);
//        waitElementIsVisible((WebElement) categoryGolf).click();
//
//
//
//        return this;
//    }
//}
