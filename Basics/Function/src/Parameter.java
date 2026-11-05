public class Parameter {
    public static void main (String[] args) {
        System.out.println(sumTwoNumbers(3,4));
        System.out.println(sumTwoNumbers(30,47));
        System.out.println(sumTwoNumbers(52,84));
    }

    public static int sumTwoNumbers(int firstNum, int secondNum) {
        System.out.println("First number received: " + firstNum);
        System.out.println("Second number received: " + secondNum);
        return firstNum + secondNum;

    }
}

/*
 * ==================== SUMMARY ====================
 * 1. Parameters (firstNum, secondNum) receive arguments (3, 4) at call time.
 * 2. A method returns ONLY ONE value — here, `return a + b` sends back one int.
 * 3. Method names are case-sensitive → caller and definition must match exactly.
 * =================================================
 */