import java.util.Scanner;
public class SumNaturalUsingRecursion {
    static int sumNatural(int n) {
        if (n == 1) //base condition
        {
            return 1;
        }
        else {
            return n + sumNatural(n - 1);
        }
    }
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the natural number: ");
        int num = input.nextInt();
        int result=sumNatural(num);
        System.out.println("The sum of first natural number is "+result);
    }
}
