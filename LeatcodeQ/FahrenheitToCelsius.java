import java.util.*;
public class FahrenheitToCelsius { // ex- 98f = 36c
    public static void main(String[] args) { //c =[(f-32)*5]/9
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit Num :  ");
        float f  = sc.nextFloat();
        System.out.println( f + "F in  celsius = "+   (((f-32)*5)/9) +"C" );
        sc.close();
    }
}



