import java.util.Scanner;
class sphereCylinder{
    int radius;
    int height;
    //constructor
    public sphereCylinder(int r,int h){
        radius = r;
        height = h;
    }
    //getter Area
    public double  getArea(){
        return 4*Math.PI*Math.pow(radius,2);
    }
    //getter volume
    public double getVolume(){
        return 1.33*Math.PI*Math.pow(radius,3);
    }
}
public class SurfaceCylinderSphere {
    public static void main(String[] args){
        //scanner instance
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int setRadius = input.nextInt();
        System.out.print("Enter the height: ");
        int setHeight = input.nextInt();
        //class instance
        sphereCylinder scy = new sphereCylinder(setRadius,setHeight);
        //getter return
        double getAreaReturn =scy.getArea();
        double getVolumeReturn = scy.getVolume();
        //display data
        System.out.println("The area of the sphere are: "+getAreaReturn);
        System.out.println("The volume of the sphere are: "+getVolumeReturn);
    }
}
