package praticeQ;
import java.util.*;
public class findGreatrer4N {
public static void fun(int n, int n1, int n2){

if(n>n1&&n>n2){
    System.out.println(n);
}
else if(n1>n&&n1>n2){
    System.out.println(n1);
}
else {
    System.out.println(n2);
}

}   public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                        fun(n,n1,n2);
 }
    }

