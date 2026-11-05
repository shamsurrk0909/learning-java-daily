import java.util.Scanner;

public class FunctionWithReturnType {
    public static void main(String[] args) {

        greet();
        int number1 = readNumber() + 1;
        int number2 = readNumber() + 2;

        int sum = number1 + number2;
        System.out.print("Sum of the number is: " + sum);



        }
    public static void greet() {
        System.out.println("\n\nWelcome to the Calculator\n");

    }
    public static int readNumber (){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int number = input.nextInt();
        return number;


    }

}


//