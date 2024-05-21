package praticeQ;
// Enter 3 number from the user & make a fun to print their average. 



// With void 


// import java.util.*;
// public class averageOfthreenum {

// public static void fun(int n ,int n1 ,int n2){

// int avg = (n*n1*n2)/3;
// System.out.println(avg);
// // return;
// }

//     public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in );
//        int n = sc.nextInt();
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();


//      fun( n , n1, n2 );
//      sc.close();
//     }
// }





// without  void



import java.util.*;
public class averageOfthreenum{

public static int fun(int n ,int n1 ,int n2){
int avg = (n*n1*n2)/3;
// System.out.println(avg);
return avg;
}
  public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in );
       int n = sc.nextInt();
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();


 System.out.println(fun( n , n1, n2 ));    
     sc.close();
    }
}
