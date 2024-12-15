import java.util.Scanner;
class Circle{
    float radius;
    public float area(float radius){
        return (3.14f*radius*radius);
    }
    public float perimeter(float radius){
        return (2*3.14f*radius);
    }
}
public class CircleUsingOops {
    public static void main(String[] args){
        //Scanner object
        Scanner input = new Scanner(System.in);
        //class circle object
        Circle cir = new Circle();
        //taking radius for area
        System.out.print("Area: Enter the radius! ");
//        cir.radius = input.nextFloat();
       float areaRadius = input.nextFloat();
        float areaCirResult = cir.area(areaRadius);
        //taking radius for perimeter
        System.out.print("Perimeter: Enter the radius! ");
//        cir.radius = input.nextFloat();
        float periRadius = input.nextFloat();
        float periCirResult = cir.perimeter(periRadius);
        System.out.println("The area of circle are: "+areaCirResult);
        System.out.println("The perimeter of circle are: "+periCirResult);

    }
}
