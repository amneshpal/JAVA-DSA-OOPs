import java.util.*;
import java.math.*;
public class AreaOfTriangle {
    public static void main(String[] args) {   //a= s*s*s

// when given 3 side = squt(s*(s-a)*(s-b)*(s-c)) 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the A :  ");
        // float a  = sc.nextFloat();
        // System.out.println("Enter the B :  ");
        // float b  = sc.nextFloat();
        // System.out.println("Enter the C :  ");
        // float c  = sc.nextFloat();
        // float s =  (a + b + c)/2; 
        // System.out.println("Area  of triangle is : " + Math.sqrt(s*(s-a))*(s-b)*(s-c));

// Or 

// when given H and B --------------->
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the H :  ");
        float h  = sc.nextFloat();
        System.out.println("Enter the B :  ");
        float b  = sc.nextFloat();
System.out.println("Area  of triangle is : " + (h*b)/2);
    }
}
