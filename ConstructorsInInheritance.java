
class Parent{
    Parent(){
        System.out.println("this is the parent class constructor with no argument");
    }
}
class ParentChild extends Parent{
    ParentChild(){
        System.out.println("this is the child class constructor with no argument");
    }
}

class GrandChild extends ParentChild{
    GrandChild(){
        System.out.println("this is the grand child class constructor with no argument");
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args){
    GrandChild gc = new GrandChild();
    }
}
