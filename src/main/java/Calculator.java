public class Calculator {


    public static int div(int a, int b){
        if (b==0) {
            throw new ArithmeticException("division by zero");
        }
        return a / b;
    }

    public static double div(double a, double b){
        if (b==0) {
            throw new ArithmeticException("division by zero");
        }
        return a / b;
    }

}
