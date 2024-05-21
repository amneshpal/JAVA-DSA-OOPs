import java.util.*;
public class CelsiusToFahrenheit {   //36c = 98f
    public static void main(String[] args) { //c =[(f-32)*5]/9 ,     f = ((c + 32)*9)/5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius Num :  ");
        float c  = sc.nextFloat();
        System.out.println( c + " in  Fahrenheit = "+   ((c*9/5)+32) +"F" );
        sc.close();
    }
}
