import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int empSalary = input.nextInt();
        int tax=0;
        if((empSalary>=250000)&&(empSalary<=500000))
        {
         tax = (empSalary*5)/100;
        }
        else if ((empSalary>=500000)&&(empSalary<1000000))
        {
            tax = (empSalary)*20/100;
        }
        else if(empSalary>=1000000)
        {
            tax = (empSalary*30)/100;
        }
        else
        {
            System.out.println("You don't need to pay the tax! enjoy");
        }

        System.out.print("You pay "+ tax + " tax");
    }
}
