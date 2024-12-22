import java.util.Scanner;
class Pattern{
int noOfRows; //number of rows
    //pyramid class
    public void RHPyramid(){
        for(int i=0;i<noOfRows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    //constructor
    public Pattern(int n){
        noOfRows =n;
    }
}
//main class
public class RightHalfPyramid {
    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int noOfRow = input.nextInt();
        //class instance
        Pattern pt = new Pattern(noOfRow);
        pt.RHPyramid();
    }
}
