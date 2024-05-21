public class approach {
    //Q1 WAP to check even or odd using  bitwise AND operator 

    // if((n&1) ==1){
    //     System.out.println("num is odd");
    //     }
        
    //     else{
    //       System.out.println("num is even ");
    //     }

//Q2 WAP to check even or odd.

// if(n%2==0){
//     System.out.println("num is even");
//     }
    
//     else{
//       System.out.println("num is odd ");
//     }


// Q3 Q WAP to print sum of n natural num.
// int count = 0;
// for( int i=0;i<=n;i++){

// count = count+i;
// }
// System.out.println("sum of n natural num is "+ count);



//Q4 wap to print table of a number by user.
// int n = sc.nextInt();
// for( int i=1;i<=10;i++){
// int t = n*i;
// System.out.println(n +"*"+ i+ "=" + t);
// }

//Q5 WAP to print solied rectangle.
// *****
// *****
// *****
// *****
// c=5,r=4

// int n=4;
// int m=5;
// for(int i =0;i<=n;i++){
// for(int j =0;j<=m;j++){
//   System.out.print("*");
//   System.out.print(" ");
// }
// System.out.println();

// }

//Q2 print the patterns "Hollow Rectangle".
// * * * * * 
// *       *
// *       *
// * * * * *

// int n=4;
// int m=5;
// for(int i =1;i<=n;i++)
// {
//           for(int j =1;j<=m;j++)
//         {

//               if(i==1||j==1||i==n||j==m)
//               {
//                  System.out.print("* ");
//               }
//              else
//              {
//                   System.out.print("  ");
//              }
//         }
// System.out.println();
// }



// // write a program to print 
// // *
// // **       {j=i}approach
// // ***
// // ****
// // *****


// int n=5;
// for(int i = 0; i<=n;i++){
//     for(int j = 0; j<=i;j++){
// System.out.print("* ");
//     }System.out.println(" ");
// }





// invert half piramid rotated bye 180 deegri.

//       *
//     * *
//   * * *
// * * * * 


// int n=5;
// for(int i =1; i<=n;i++){
//   for(int j =1;j<=n-i;j++){
//     System.out.print(" ");   //j only isi block ke liye h 
//   }
//   for(int j=1; j<=i;j++ ){
//     System.out.print("*");
//   }System.out.println();
// }



}


// print a triangle.
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
    
    // int n=5;
    // for(int i =1; i<=n;i++){
    //   for(int j =1;j<=n-i;j++){
    //     System.out.print(" ");   //j only isi block ke liye h 
    //   }
    //   for(int j=1; j<=i;j++ ){
    //     System.out.print("* ");
    //   }System.out.println();
    // }


    
// 6 print half pyramid with number. 

// 1        row num = 1     no 1to 1
// 12       row num = 2     no 1to 2
// 123      row num = 3     no 1to 3
// 1234     row num = 4     no 1to 4
// 12345    row num = 5     no 1to 5

// int n= 5;
// for (int i =1; i<=n; i++){
//   for(int j = 1; j<=i; j++){
//     System.out.print(j);

//   }System.out.println();



// }