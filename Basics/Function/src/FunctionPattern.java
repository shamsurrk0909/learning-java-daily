public class FunctionPattern {
    static void main(String[] args) {
       printFirstPattern();
       printSecondPattern();
       printThirdPattern();

    }


    public static void printThirdPattern(){
        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  * * *");
        System.out.println(" * * * * ");
        System.out.println("* * * * *");

    }
    public static void printSecondPattern(){

        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* * ");
        System.out.println("*");


    }

    public static void printFirstPattern() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;

        }

    }
}
// This is void Function which do not return any value.