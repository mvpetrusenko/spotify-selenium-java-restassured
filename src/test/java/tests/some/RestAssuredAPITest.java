package tests.some;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class RestAssuredAPITest {

    String token;

    //private static String token;

//    public static void main(String[] args) {
//
//        System.out.println("Great!");
//
//    }


    @BeforeTest
    public void setUp(){
       token = "BQAwx74RzgMNXHKHGnnC9_LCn7jYmPVUUE4Xy-POh5VSzhtSPZH04TOwHknRyDVNRok3P6QYnOO9MXYI5FHFtwrZmy9Ybu4srWNBhopyM3vulYo-Sjsd7ytmohSytpCWqE2VLRWxdMuogvdzHu-28NwgwOhpXoF8ibK3DVtKtTHSK322DJWOXDiqiTRsluCMLUIc";
    }
    //static String token = "BQDw716QkiXsLu-Mbj-K8GvzibrX6k_vqwVTFodLwes_xJvR6kdkhvDDPkI23aCcKgrnykcxUUwlggBQbak1StfF1fAjmapk7DeuPBN1mdES-EtoXct91JfTr2DwfL49-n3RvfVfSNvNXOQFhtYXxK-38xBL9cxMUuu73tH26aX2V_tuGenMCWfr0xTc-OVMVuqo";



    @Test
    public static void main(String[] args) {

        System.out.println("Great!");

    }



    //Get artist
    @Test
    public void GetArtist() {

        ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                .baseUri("https://api.spotify.com/").basePath("v1")
                .accept(ContentType.JSON).header("Authorization", "Bearer " + token)
                .when()
                .get("/artists/1RyvyyTE3xzB2ZywiAwp0i")
                .then()
                .log()
                .all()
                .assertThat().statusCode(200);

    }


    //Get Artist`s Albums
    @Test
    public void GetArtistAlbums() {
        ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                .baseUri("https://api.spotify.com/").basePath("v1")
                .accept(ContentType.JSON).header("Authorization", "Bearer " + token)
                .when()
                .get("/artists/1RyvyyTE3xzB2ZywiAwp0i/albums")
                .then()
                .log()
                .all()
                .assertThat().statusCode(200);
    }

}



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



