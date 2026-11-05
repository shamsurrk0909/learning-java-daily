import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number for which you want the multiplication table: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication Table of " + number + ":\n");

        //  Call the method — pass `number`
        printMultiplicationTable(number);

        input.close();   //  close in main, where Scanner lives
    }

    //  Method is a SIBLING of main, not nested inside it
    public static void printMultiplicationTable(int number) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println(number + " x " + counter + " = " + (number * counter));
            counter++;
        }
    }
}