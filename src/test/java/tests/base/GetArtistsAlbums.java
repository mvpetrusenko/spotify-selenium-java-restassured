package tests.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import tests.base.A.BaseSetup;


public class GetArtistsAlbums extends BaseSetup {
//public class GetArtistsAlbums {


    //static String link = "https://api.spotify.com/v1/artists/1RyvyyTE3xzB2ZywiAwp0i";
    //static String token = "BQAhDe7xiC5B_KP2jcai_OWT1BzYYJ3BFcfLbJJkXKP3AJJWJpi2TnrHJqI9hNZaXCKgN-kWQe48U_PQRd0L5ngmEdcv-zrprEXnbIJ0fkm2Jm9oOucrWwraj0JhNrafimET0QJWf9-GKx0C-I7-b_B1qPw_4b_8KdG3fmntd6MnkpLnfUgvjT8wBG_zrdHG2fiV";


    //Get artist`s Albums
    @Test
    //public static void main(String[] args) {
        public static void GetArtistsAlbumss(String token) {

        ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                .baseUri("https://api.spotify.com/").basePath("v1")
                .accept(ContentType.JSON).header("Authorization", "Bearer " + token)
                .when()
                //.get(link)
                .get("artists/1RyvyyTE3xzB2ZywiAwp0i/albums")
                .then()
                .log()
                .all()
                .assertThat().statusCode(200);

    }
}