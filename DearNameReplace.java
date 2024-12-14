import java.util.Scanner;
public class DearNameReplace {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input  = new Scanner(System.in);
        String letter = "Dear <|name|>, thanks a lot!";
        System.out.print("Enter you name here Dear: ");
        String letterName = input.nextLine();
        String letterReplace = letter.replace("<|name|>",letterName);
        System.out.println(letterReplace);
    }
}
