// package javapractice.impQ;
import  java.util.*;
public class simpleInterst {      // { amount*rate of interst* time}/100
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Princeple Amount :  ");
        float a  = sc.nextFloat();
        System.out.println("Enter the Rate of Interst :  ");
        float i  = sc.nextFloat();
        System.out.println("Enter the Time in year :  ");
        float t = sc.nextFloat();

System.out.println("Simple interst is : " + (a*i*t)/100);
        sc.close();
    }
}
