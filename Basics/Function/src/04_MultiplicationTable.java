public class MultiplicationTable {
    public static void main(String[] args) {
        printTable(5);
        System.out.println();
        printTable(8);
    }

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
