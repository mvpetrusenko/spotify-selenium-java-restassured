//package tests.base;
//
//import common.CommonActions;
//import org.junit.After;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import pages.base.BasicPage;
//import pages.bbc_com.BBCHomePage;
//
//import static common.Config.CLEAR_COOKIES;
//import static common.Config.HOLD_BROWSER_OPEN;
//
//public class BasicTest {
//    //protected WebDriver driver = CommonActions.createDriver();
//    protected BasicPage basicPage = new BasicPage(driver);
//    protected BBCHomePage bbcHomePage = new BBCHomePage(driver);
//
//    // clear cookies before test execution
//    @After
//    public void clearCookies(){
//        if (CLEAR_COOKIES) {
//
//            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//            driver.manage().deleteAllCookies();
//
//        }
//    }
//
//    @After()
//    public void closeBrowser(){
//        if (HOLD_BROWSER_OPEN){
//            driver.quit();
//        }
//    }
//}
