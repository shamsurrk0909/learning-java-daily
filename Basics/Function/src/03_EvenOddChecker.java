public class EvenOddChecker {
    public static void main(String[] args) {
        check(10);
        check(7);
    }

    public static void check(int num) {
        if (isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
