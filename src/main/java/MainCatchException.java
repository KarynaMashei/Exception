import java.util.ArrayList;

public class MainCatchException {
    public static void main(String[] args) {
        int a = 6, b = 0, index = 5, index1 = 3, index2 = 4;
        String s = null, s1 = "hello", s2 = "23a";
        int[] ar = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);

        while (true) {
            try {
                int c = a / b;
                System.out.println("c = " + c);
                char sym = s.charAt(1);
                System.out.println(sym);
                sym = s.charAt(1);
                sym = s1.charAt(index);
                System.out.println(sym);
                int res = ar[index2];
                System.out.println("result = " + res);
                res = Integer.parseInt(s2);
                System.out.println("res = " + res);
                res = list.get(index1);
                System.out.println("res  = " + res);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                b = 1;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                s = "default";
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                index = 0;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                index2 = 0;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                s2 = "1";
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                index1 = 0;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The end");
    }
}
