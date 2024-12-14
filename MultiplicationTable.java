import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args)
    {
        //creating scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Whose table you want?: ");
        int n= input.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,(n*i));
        }
    }
}
