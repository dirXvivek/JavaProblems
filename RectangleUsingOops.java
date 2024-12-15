import java.util.Scanner;
class Rectangle{
//    int length;
//    int width;
    public int area(int length,int width){
        return (length*width);
    }
    public int perimeter(int length,int width){
        return 2*(length+width);
    }

}
public class RectangleUsingOops {
    public static void main(String[] args){
        //scanner object
        Scanner input = new Scanner(System.in);
       //class rectangle object
       Rectangle rec = new Rectangle();
       //taking input for area
        System.out.print("Area: Enter the length: ");
//        rec.length = input.nextInt();
        int length = input.nextInt();
        System.out.print("Area: Enter the width: ");
//        rec.width = input.nextInt();
        int width = input.nextInt();
        int areaRecResult = rec.area(length,width);
        //taking input for perimeter
        System.out.print("Perimeter: Enter the length: ");
//        rec.length = input.nextInt();
        int len = input.nextInt();
        System.out.print("Perimeter: Enter the width: ");
//        rec.width = input.nextInt();
        int wid = input.nextInt();
        int periRecResult =rec.perimeter(len,wid);
        System.out.println("The area of rectangle are "+areaRecResult);
        System.out.println("The perimeter of rectangle are "+periRecResult);


    }
}
