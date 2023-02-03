package tests.some;

public class Base extends RestAssuredAPITest {
    public static void main(String[] args) {

        RestAssuredAPITest rs = new RestAssuredAPITest();
        getArtist();
        getArtistAlbums();

    }
}
