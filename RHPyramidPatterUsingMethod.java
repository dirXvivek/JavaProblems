import java.util.Scanner;
public class RHPyramidPatterUsingMethod {
    static void patterMethod(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int n = input.nextInt();
        patterMethod(n);
    }
}
