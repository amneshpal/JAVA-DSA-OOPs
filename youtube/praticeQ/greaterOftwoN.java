package praticeQ;
import java.util.*;
// with void 
// public class greaterOftwoN {
// public static void fun(int n, int n1){

// if(n>n1){
//     System.out.println(n);
// }
// else{
//     System.out.println(n1);
// }

// }   public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//                     int n = sc.nextInt();
//                     int n1 = sc.nextInt();
//                         fun(n,n1);
//  }
//     }


// whout void 
public class greaterOftwoN {
    public static int  fun(int n, int n1){
    
    if(n>n1){
        // System.out.println(n);
        return n;
    }
    else{
        // System.out.println(n1);
        return n1;
    }


    
    }   public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
                        int n = sc.nextInt();
                        int n1 = sc.nextInt();
                           System.out.println(fun(n,n1)); 
     }
        }
