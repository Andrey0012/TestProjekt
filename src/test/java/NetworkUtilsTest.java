import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 2000)
    public void getConnectionShouldReturnOneSecond () {
        NetworkUtils.getConnection();
    }
}
