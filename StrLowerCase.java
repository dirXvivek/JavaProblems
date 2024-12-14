import java.util.Scanner;
public class StrLowerCase {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);

        //taking  string input from user
        System.out.print("Enter the String here!: ");
        String userStr = input.nextLine();
        System.out.println(userStr.toLowerCase());

    }
}
