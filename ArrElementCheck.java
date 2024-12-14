import java.util.Scanner;
public class ArrElementCheck {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        int [] arr = {5,3,4,2,1,2};
        System.out.print("Enter the element you want to search? ");
        int eleSearch = input.nextInt();
        int len = arr.length;

        for(int i=0;i<len;i++)
        {
            if(i==eleSearch)
            {
                System.out.println("element present");
            }
        }

    }
}
