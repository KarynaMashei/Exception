public class MainThrowTest {
    public static void main(String[] args) {
        double res = 0;
        try {
            res = divide(6.3, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("res = " + res);
    }

    public static double divide(double a, double b) throws Exception {
        double res = 1;
        if (b == 0) {
            Exception e = new Exception("Attention : division by ZERO");
            throw e;
        }
        res = a / b;
        return res;
    }
}