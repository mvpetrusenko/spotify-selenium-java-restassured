//package org.example;
//
//import org.junit.After;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//
//public class SignIn {
//    WebDriver driver = new ChromeDriver();
//    @Test
//    public void gmailLoginShouldBeOk(){
//        // Test step 1: go to gmail website
//        // driver is like a variable to save chrome or other driver object
//        //WebDriver driver = new ChromeDriver();
//        driver.get("https://www.bbc.com/");
//
//        // 2: Click Consent button
//        WebElement consentButton = driver.findElement(By.xpath("//*[@aria-label=\"Consent\"]"));
//        consentButton.click();
//
//        // 3: Click Sign In Link
//        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"idcta-link\"]"));
//        signInButton.click();
//
//        // 4: Verify Sign In page is opened
//        //WebElement signInPage = driver.findElement(By.xpath("//*[@id=\"signin-page\"]"));
//        //Assert.assertTrue(signInPage.getText());
//
//        // 5: Filling in a username
//        // WebElement is like a type of the variable
//        // usernameTextField is like a variable
//        // clear() to clear if other email address was in the text field before
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type=\"email\"]")));
//        WebElement usernameTextField = driver.findElement(By.xpath("//*[@type=\"email\"]"));
//        usernameTextField.clear();
//        usernameTextField.sendKeys("mariiape3330@gmail.com");
//
//        // 6: Filling in password
//        //WebElement passwordTextField = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
//       // passwordTextField.clear();
//        //passwordTextField.sendKeys("mariiape333$$$");
//
//
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//    }
//
//}









//From B v

//package tests.base;
//
//
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.ValidatableResponse;
//import org.junit.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//
//
//public class B {
//
//    static String token;

    //private static String token;

//    public static void main(String[] args) {
//
//        System.out.println("Great!");
//
//    }


//    public static void main(String[] args) {
//
//        @BeforeTest
//        public void setUp(){
//            token = "BQAiZtTafG4o14BXH5jQT18Zc7MzyFvpS4Yumvg4UQS5tDm0gCXDQPSJsxLPI2tqULXK";
//        }
        //static String token = "BQDw716QkiXsLu-Mbj-K8GvzibrX6k_vqwVTFodLwes_xJvR6kdkhvDDPkI23aCcKgrnykcxUUwlggBQbak1StfF1fAjmapk7DeuPBN1mdES-EtoXct91JfTr2DwfL49-n3RvfVfSNvNXOQFhtYXxK-38xBL9cxMUuu73tH26aX2V_tuGenMCWfr0xTc-OVMVuqo";




//    public static void main(String[] args) {
//
//        System.out.println("Great!");
//
//    }



        //Get artist
//        @Test
//        public void GetArtist;() {
//
//            ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
//                    .baseUri("https://api.spotify.com/").basePath("v1")
//                    .accept(ContentType.JSON).header("Authorization", "Bearer " + token)
//                    .when()
//                    .get("/artists/1RyvyyTE3xzB2ZywiAwp0i")
//                    .then()
//                    .log()
//                    .all()
//                    .assertThat().statusCode(200);
//
//        }


        //Get Artist`s Albums
//        @Test
//        public void GetArtistAlbums;() {
//            ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
//                    .baseUri("https://api.spotify.com/").basePath("v1")
//                    .accept(ContentType.JSON).header("Authorization", "Bearer " + token)
//                    .when()
//                    .get("/artists/1RyvyyTE3xzB2ZywiAwp0i/albums")
//                    .then()
//                    .log()
//                    .all()
//                    .assertThat().statusCode(200);
//        }
//
//    }



//    static String link = "https://api.spotify.com/v1/artists/1RyvyyTE3xzB2ZywiAwp0i";
//    static String token = "BQAwx74RzgMNXHKHGnnC9_LCn7jYmPVUUE4Xy-POh5VSzhtSPZH04TOwHknRyDVNRok3P6QYnOO9MXYI5FHFtwrZmy9Ybu4srWNBhopyM3vulYo-Sjsd7ytmohSytpCWqE2VLRWxdMuogvdzHu-28NwgwOhpXoF8ibK3DVtKtTHSK322DJWOXDiqiTRsluCMLUIc";
//
//
//
//    public static void main(String[] args) {
//        ValidatableResponse response = RestAssured.given()
//                .header("Authorization", "Bearer " + token)
//                .when()
//                .get(link)
//                .then()
//                .log()
//                .all()
//                .assertThat().statusCode(200);
//
//    }
//}



//@Test
//    public static void main(String[] args) {
//        ValidatableResponse response = RestAssured.given()
//                .header("Authorization", token)
//                .when()
//                .get(link)
//                .then()
//                .log()
//                .all()
//                .assertThat().statusCode(200);
//
//        //response.prettyPrint();
//    }
//}




//@Test
//    public static void main(String[] args) {
//    //public void GetUserId() {
//        RestAssured.given()
//                .baseUri("https://api.spotify.com/").basePath("v1")
//                .header("Authorization", "Bearer " + token)
//                .when().get("/artists")
//                .then()
//                .statusCode(200);
//               // .statusLine("HTTP/1.1 200 OK");
//    }
//}

//    static String link = "https://api.spotify.com/v1/artists";

//    static String token = "BQBeoELTxkE0LDA9IHB43JF0LymP_qjjquE2oDXHPINR1R6Xnqj1m_U_dmIBW7lifbabkfZVtSP_iCsEENkwOHmjsajECFmUcbuhLgEg5";
//
//    public static void main(String[] args) {
//        Response response = RestAssured.given().header("Authorization", "bearer " + token).when().get(link);
//        response.then().assertThat().statusCode(200);  //This fails
//        //response.then().assertThat().statusCode(401);  //This passes
//    }
//}




