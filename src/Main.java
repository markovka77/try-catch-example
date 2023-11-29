public class Main {
    public static void main(String[] args) {
        try {
            divide(6, 0);
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя!");
        }
    }

    static void divide(int a, int b) {
        System.out.println(a/b);
    }

}

