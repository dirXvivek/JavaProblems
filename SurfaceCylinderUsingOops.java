import java.util.Scanner;

class SurfaceCylinder{
   private int radius;
   private int height;
    //getter radius
    public int getRadius(){
        return radius;
    }
    //setter radius
    public void setRadius(int n){
        radius = n;
    }
    //height getter
    public int getHeight(){
        return height;
    }
    //height setter
    public void setHeight(int n){
        height = n;
    }
    //surface area
    public float surfaceArea(){
        return 2*((3.14f*radius*height) + (2*3.14f*radius*radius));
    }
    //surface volume
    public float surfaceVolume(){
        return (3.14f*radius*radius*height);
    }

}
//main class
public class SurfaceCylinderUsingOops {
    public static void main(String[] args){
        //scanner instance
        Scanner input = new Scanner(System.in);
        //class instance
        SurfaceCylinder scy = new SurfaceCylinder();

        //radius
        System.out.print("Enter the radius: ");
        int radiusInput = input.nextInt();
        scy.setRadius(radiusInput);
        int radiusResult =scy.getRadius();
        //height
        System.out.print("Enter the height: ");
        int heightInput = input.nextInt();
        scy.setHeight(heightInput);
        int heightResult = scy.getHeight();
        //surface area and volume result
        float areaReturn = scy.surfaceArea();
        float volumeReturn = scy.surfaceVolume();
        //display data
        System.out.println("The area of surface cylinder are: "+areaReturn);
        System.out.println("The volume of surface cylinder are: "+volumeReturn);
    }
}
