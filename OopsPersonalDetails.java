import java.util.Scanner;
class Employee
{
    int salary;
    String name;
    public void getSalary() {
        System.out.println("My salary are: "+salary);
        System.out.println("My name is: "+ name);
    }
}
public class OopsPersonalDetails {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        //creating employee object
        Employee obj = new Employee();
        System.out.println("Enter your name: ");
        obj.name = input.nextLine();
        System.out.println("Enter your Salary: ");
        obj.salary = input.nextInt();
        obj.getSalary();
    }
}
