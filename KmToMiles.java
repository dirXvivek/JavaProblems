import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args){
        //create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the kilometer km): ");
        float kmStore = sc.nextFloat();
        float mileStore = 0.621371f*kmStore;
        System.out.println("The "+kmStore+" Kilometer in miles are "+mileStore);

    }
}
