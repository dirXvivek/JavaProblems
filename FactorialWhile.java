import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int n = input.nextInt();
        int fac = 1;
        int i=1;
        while(i<=n)
        {
            fac = fac*i;
            i++;
        }
        System.out.print("The factorial of given number is "+fac);
    }
}
