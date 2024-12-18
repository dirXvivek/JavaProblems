import java.util.Scanner;

class CylinderConstructor{
     int radius;
     int height;
    public CylinderConstructor(int h,int r){
        radius = r;
        height = h;
    }
}
public class ClassCylinderUsingConstructor {
    public static void main(String[] args){
        //scanner instance
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int setHeight = input.nextInt();
        System.out.print("Enter the radius: ");
        int setRadius = input.nextInt();
        //class instance
        CylinderConstructor cc = new CylinderConstructor(setHeight,setRadius);
        //display data
        System.out.println("The radius are: "+cc.radius);
        System.out.println("The height are: "+cc.height);

    }
}
