// Write a funcation to print the sum of all odd num.  
package praticeQ;

import java.util.*;

// with the void fun


// public class SumOfAllOddNum {
//     public static void fun(int n) {
//         int  add =0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 add = i + add;
//             }
//         }
//         System.out.println(add);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fun(n);
//     }
// }


// whout void fun


public class SumOfAllOddNum {
    public static int  fun(int n) {
        int  add =0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                add = i + add;
            }
        }
        return add;
        // System.out.println(add);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(fun(n)); 
    //    System.out.println(add);    error
    }
}
