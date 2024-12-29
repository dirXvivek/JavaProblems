import java.util.Scanner;

class base{
    base(){
        System.out.println("this is the base class constructor without argument");
    }
    base(int x){
        System.out.println("this is the base class constructor with argument x: "+x);
    }

}
class derived extends base{
    derived(){
        System.out.println("this is the derived class constructor with no arguments");
    }
    derived(int x){
        super(x);
        System.out.println("this is the derived class constructor with argument y: "+x);
    }
}

class grandBase extends derived{
    grandBase(){
//        super(0);
        System.out.println("this is the grand base class constructor with no arguments");
    }
    grandBase(int x){
        super(x);
        System.out.println("this is the grand base class constructor with argument z: "+x);
    }
}
//main class
public class ConstructorInheritanceWithSuper {
    public static void main(String[] args){
        //scanner instance
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer");
        int integerValue = input.nextInt();
        grandBase gb = new grandBase(integerValue);
    }
}
