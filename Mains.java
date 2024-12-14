//package com.company;
import java.util.Scanner;
public class Mains {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the english marks ");
        float eng = sc.nextFloat();
        System.out.println("Enter the hindi marks ");
        float hindi = sc.nextFloat();
        System.out.println("Enter the chemistry marks ");
        float chem = sc.nextFloat();
        System.out.println("Enter the Mathematics marks ");
        float maths = sc.nextFloat();
        System.out.println("Enter the computer marks ");
        float comp = sc.nextFloat();

        float per = (eng+hindi+chem+maths+comp)*100/500;
        System.out.println("Total percentage is "+per);
    }
}
