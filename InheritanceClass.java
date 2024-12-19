import java.util.Scanner;

class Animal{
    public String ani;
    public String aniWork;

    //getter and setter for animal name
    public String getAni() {
        return ani;
    }
    public void setAni(String name){
        ani = name;
    }
    //getter and setter for animal working
    public String getAniWork(){
        return aniWork;
    }
    public void setAniWork(String name){
        aniWork = name;
    }
}
//another class for dog;
class Kangaroo extends Animal{
    public String country;
    //getter and setter for country
    public String getCountry(){
        return country;
    }
    public void setCountry(String name){
        country = name;
    }
}
public class InheritanceClass {
    public static void main(String[] args){
        //scanner instance
        Scanner input = new Scanner(System.in);
        //animal instance
        Animal an = new Animal();
        //kangaroo instance
        Kangaroo kg = new Kangaroo();
        //accessing animal class properties using another class (inheritance)
        System.out.println("Enter the animal name: ");
        String aniName = input.nextLine();
        kg.setAni(aniName);
        String getAniReturn = kg.getAni();
        System.out.println("Enter animal voice");
        String aniVoice = input.nextLine();
        kg.setAniWork(aniVoice);
        String getVoiceReturn = kg.getAniWork();
        //kangaroo class
        System.out.print("Enter the country name of the animal: ");
        String countryName = input.nextLine();
        kg.setCountry(countryName);
        String countryReturn = kg.getCountry();
        //display data's
        System.out.println("The animal name are: "+getAniReturn);
        System.out.println("The animal voice are "+getVoiceReturn);
        System.out.println("The animal are from "+ countryReturn);
    }
}
