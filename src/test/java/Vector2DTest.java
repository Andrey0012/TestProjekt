import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS =1e-9;
    private static Vector2D vector2D;

    @BeforeClass
    public static void createNewVector2D () {
        vector2D = new Vector2D();
    }

    @Test
    public void newVector2DShouldHaveZeroLength () {
        Assert.assertEquals(0, vector2D.length(), EPS);
    }

    @Test
    public void newVector2DShouldHaveZeroX () {
        Assert.assertEquals(0, vector2D.getX(), EPS);
    }

    @Test
    public void newVector2DShouldHaveZeroY () {
        Assert.assertEquals(0, vector2D.getY(), EPS);
    }
}
