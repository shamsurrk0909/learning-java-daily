import java.util.Scanner;

class SumAllOddNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Odd Number Sum Calculator\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        int sum = sumOfOddNumbers(num);
        System.out.println("Sum of odd numbers till " + num + " is " + sum);

        input.close();
    }

    public static int sumOfOddNumbers(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}