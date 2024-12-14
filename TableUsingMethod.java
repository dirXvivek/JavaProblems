import java.util.Scanner;
public class TableUsingMethod {
    static void multiTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for table: ");
        int n = input.nextInt();
        multiTable(n);
    }
}

