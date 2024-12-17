import java.util.Scanner;

class Cylinder{
    int radius;
    int height;
    //getter returning the radius
    public int cyGetterRadius(){
        return radius;
    }
    //setter setting the radius
    public void cySetterRadius(int n){
        radius = n;
    }

    //getter returning the height
    public int cyGetterHeight(){
        return height;
    }
    //setter setting the height
    public void cySetterHeight(int n){
        height = n;
    }
}
//main class
public class CylinderClassUsingOops {
    public static void main(String[] args){
        //scanner object
        Scanner input = new Scanner(System.in);
        //class instance
        Cylinder cy = new Cylinder();
        //for radius method
        System.out.print("Enter the radius: ");
        int setterRadius = input.nextInt();
        cy.cySetterRadius(setterRadius);
        int cyGetterRadiusResult = cy.cyGetterRadius();
        //for height method
        System.out.print("Enter the height: ");
        int setterHeight = input.nextInt();
        cy.cySetterHeight(setterHeight);
        int cyGetterHeightResult =cy.cyGetterHeight();
        //display the getter result of radius and height
        System.out.println("The radius are: "+cyGetterRadiusResult);
        System.out.println("The height are: "+cyGetterHeightResult);

    }
}
