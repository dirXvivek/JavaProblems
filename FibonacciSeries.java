import java.util.Scanner;
public class FibonacciSeries {
    static int fib(int n)
    {
//        if(n==1)
//        {
//            return 0;
//        }
//        else if (n==2) {
//            return 1;
//        }
//        or
        if(n==1 || n==2)
        {
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args){
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for fibonacci: ");
        int num = input.nextInt();
        int result = fib(num);
        System.out.println(result);
    }
}
