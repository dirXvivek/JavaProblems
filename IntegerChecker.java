import java.util.Scanner;
public class IntegerChecker {
    public static void main(String[] args){
        //scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        boolean intCheck= sc.hasNextInt();
        System.out.println(intCheck);

    }

}
