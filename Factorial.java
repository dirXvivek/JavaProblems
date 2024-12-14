import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for Factorial: ");
        int n = input.nextInt();
        int fac = 1;
        for(int i=n; i>=1;i--)
        {
            fac = fac*i;
        }
        System.out.print("The factorial of a given number is "+fac );
    }
}
