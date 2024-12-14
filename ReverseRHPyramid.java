import java.util.Scanner;
public class ReverseRHPyramid {
    static void RightHalf(byte n)
    {
        byte i,j;
        for(i=0;i<n;i++)
        {
            for(j=n;j>i;j--)
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
        System.out.print("Enter the number of row: ");
        byte num = input.nextByte();
        RightHalf(num);
    }
}
