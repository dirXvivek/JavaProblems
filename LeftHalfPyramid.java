import java.util.Scanner;

class PatternLHP{
    int noOfRows;
    public void PyramidPattern(){
        for(int i=0;i<noOfRows;i++){
            for(int j=0;j<=(4-i);j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public PatternLHP(int n{
        noOfRows=n;
    }
}

public class LeftHalfPyramid {
    public static void main(String[] args){
    //scanner instance
        Scanner input = new Scanner(System.in);
    }
}
