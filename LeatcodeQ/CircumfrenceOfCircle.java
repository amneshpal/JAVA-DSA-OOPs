// package javapractice.impQ;
import java.util.Scanner;

public class CircumfrenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radious: ");
        float r = sc.nextFloat();
        float pie = 3.14f;
        System.out.println();
        System.out.println("Area of circle: " + "'" + pie*r*r + "'");
        System.out.println("Circumfrence of circle: " + 2*pie*r);
        sc.close();
    }
}
