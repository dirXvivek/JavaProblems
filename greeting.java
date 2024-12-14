import java.util.Scanner;
public class greeting {
    public static void main(String[] args)
    {
    //creating scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = sc.next();
        System.out.println("Hello "+ name +" ,have a good day");
    }
}
