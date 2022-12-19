public class MyMath {
    public static int divide (int number1, int number2) {
        if (number2==0) {
            throw new  ArithmeticException ("must not be equal to zero");
        }
        return number1/number2;
    }
}
