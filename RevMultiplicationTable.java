import java.util.Scanner;
public class RevMultiplicationTable {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Who reverse table you want?: ");
        int n = input.nextInt();
        for(int i=10;i>=1;i--)
        {
            System.out.printf("%d X %d = %d\n",n,i,i*n);
        }


    }
}
