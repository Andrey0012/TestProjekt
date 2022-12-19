import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldTrowsException () {
        MyMath.divide(1,0);
    }
}
