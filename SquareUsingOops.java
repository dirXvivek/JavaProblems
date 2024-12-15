import java.util.Scanner;

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class SquareUsingOops {
    public static void main(String[] args){
        //scanner object
        Scanner input = new Scanner(System.in);
        //creating square object
        Square sqr = new Square();
        System.out.print("Enter side for area of square: ");
        sqr.side = input.nextInt();
        int areaResult = sqr.area();
        System.out.println("The area of given square are "+areaResult);
        System.out.print("Enter the side for perimeter of square: ");
        sqr.side = input.nextInt();
        int periResult = sqr.perimeter();
        System.out.println("The perimeter of given square are "+periResult);


    }
}
