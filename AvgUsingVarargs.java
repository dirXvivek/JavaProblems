import java.util.Scanner;
public class AvgUsingVarargs {
    static int Average(int ...arr)
    {
        int sum = 0;
        for(int elements:arr)
        {
            sum = sum+elements;
        }
        int avg,len;
        len = arr.length;
        avg = sum/len;
        return avg;

    }

    public static void main(String[] args)
    {
     int result;
     result =Average(2,3,4);
     System.out.println(result);
    }
}
