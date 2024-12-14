import java.util.Scanner;
public class EvenSum {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            if(i%2==0)
            {
                sum = sum+i;
            }
        i++;
        }
        System.out.print("The sum of first n even natural number are "+sum);
    }
}
