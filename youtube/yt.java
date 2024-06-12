

// // javac fileName.java ------>for compilation
// // java fileName.java ------->for run java code 

// // Example----->
// // javac FirstClass.java------>for compilation
// // java FirstClass.java-------> for run 


// // characteristics of java-------------->
// // #java is a type language.
// // #it is object oriented languase.
// // #WORA/WORE--  Weite once read anywhere./everywhere.

// // #Plateform indipendent.
// // #java is dynamic.


// // WAP to print hello world-------->
// // public class yt{
// //     public static void main(String [] args ){
// // System.out.println("hello");
// //     }
// // }


// // Cource start here------------>
// // import java.util.*;
// // public class yt{              //  --------------> hata do comment
//     // public static void main(String[] args){  //--------------> hata do comment
//         // System.out.println("hello");
//         // System.out.print("hello\n");
//         // System.out.println("hello");

// // println or  {\n } hota h

// //        WAP to print *
// // *
// // **
// // *** 
// // **** 
// // *****

// // System.out.println("*");
// // System.out.print("*");
// // System.out.print("*\n");
// // System.out.print("*");
// // System.out.print("*");
// // System.out.print("*\n");
// // System.out.print("*");
// // System.out.print("*");
// // System.out.print("*");
// // System.out.print("*");


// // System.out.print("*\n**");



// /* Data Type--


// // primitive                              Non-Primitive 
// 1 byte                                      1 string 
// 2 short                                     2 Array
// 3 char                                      3 Class
// 4 boolean                                   4 Object
// 5 int                                       5 interface 
// 6 long 
// 7 float 
// 8 double

// 1byte --->8bit.

// */
// // additio  and subtraction of two num

// // int a = 23;
// // int b = 42; 
// // // int sum = a+b;
// // // System.out.println(sum);
// // int diff = a-b;
// // System.out.println(diff);

// /*QUIZ 

// tocalculate :

// _a__*__b_   a= 10, b = 5;
//  a  -  b

// which one is right:
// A) int ans = a*b/a-b;
// B) int ans =  (a*b)/(a-b);


// 50/5= 10 ans hota math me 


// NOTE 1:java me calulation left to right hoti h.
// NOTE 2: *,/, %, >,-,+ 
// */
// // int a=  10;
// // int b= 5;
// // int ans =  a*b/a-b;  //50/10-5 =5-5=0

// // System.out.println(ans);

// // int ans1 =  (a*b)/(a-b); // (10*5)/(10-5)= 50/5= 10
// // System.out.println(ans1);


// //import java.util.*; yha isko import nahi kar sakte error show karega.
// //scanner isme define h 



// // Scanner sc = new Scanner(System.in);
// // //String name =  sc.next();
// // //NOTE:  next only single word print karega.
// // String name =  sc.nextLine();
// // //NOTE:  nextLine puri line ko print karega.
// // System.out.println(name );
// // sc.close();



// // nextint ---->integer print karane ke liye 
// // nexttfloat --->float value print karane ke liye 
// // nextLine ---> puri line print karane ke liye 



// // Q1 take two variable a and b and print their sum.

// // System.out.println("Enter the num A");
// // Scanner sc =  new Scanner(System.in);
// // int A  = sc.nextInt();

// // System.out.println("Enter the num B");
// // Scanner sc1 = new Scanner(System.in);
// // int B = sc.nextInt();

// // int c  =  A + B;  

// // System.out.println("the addition is"+ c);
// // sc.close();
// // sc1.close();








// /////////////////////////// Conditional Statement----------------->//////////
// // if, else 
// // else if 
// // switch 
// // break 


// // if else------>
// /*

// stt 1;
// stt 2;
// if(condition){
//                  stt 3;
//                  stt 4;
//              }
// else  {
//               stt 5;
//               stt 6;
//       }         
// stt 7;
// stt8;

// */



// // System.out.println("enter the age ");
// // Scanner sc =  new Scanner(System.in);
// // int n = sc.nextInt();
// // if(n>=18)
// // {
// // System. out.println("you can vote ");
// // }
// // else {
// //   System. out.println("you can't vote ");
// // }
// // sc.close(); 


// // WAP to check even or odd using  bitwise AND operator 

// // System.out.println("enter the num");
// // Scanner sc =  new Scanner(System.in);
// // int n = sc.nextInt();

// // if((n&1) ==1){
// // System.out.println("num is odd");
// // }

// // else{
// //   System.out.println("num is even ");
// // }
// // sc.close();





// // WAP to check even or odd
// // System.out.println("enter the num");
// // Scanner sc =  new Scanner(System.in);
// // int n = sc.nextInt();

// // if(n%2==0){
// // System.out.println("num is even");
// // }

// // else{
// //   System.out.println("num is odd ");
// // }
// // sc.close();



// // System.out.println("enter the first num");
// // Scanner sc = new Scanner(System.in);
// // int a =  sc.nextInt();

// // System.out.println("enter the second number ");
// // Scanner sc1 = new Scanner(System.in);
// // int b =  sc.nextInt();

// // if(a==b){
// //   System.out.println("equal");
// // }
// // else if (a>b){
// //   System.out.println("a is greater");
// // }
// // else if(a<b){
// //   System.out.println("a is lesset");
// // }

// // sc.close();
// // sc1.close();



// // Quiz ------>
// // if 3 is an even number, print "bazinga".

// //A
// // if(3%2 == 0){
// // System.out.println("bazinga ");// statement wrong hogi but statement wrong hone karan kuss print nahi karega.
// // }

// //B
// // if(3%2 == 0)// bina curly bresis ke bhi use kar sakte h 
// // System.out.println("bazinga ");// statement wrong hogi but statement wrong hone karan kuss print nahi karega.

// //C
// // if(3%2 == 0);// ye wrong h 
// // System.out.println("bazinga ");
   




// /////////////////SWITCH case and if else//////////////////

// // syntex of switch case 
// // switch(variable){
// //   case 1: {
// //   stt1:
// //   break;}


// //   case 2: {
// //     stt2:
// //     break;}

// //   case 3: {
// //       stt3:
// //       break;}

// //    case 5: {
// //         stt4:
// //         break;}
// //    default: {
// //         stt5:
// //        }
// // }




// // System.out.println("enter the number ");
// // Scanner sc = new Scanner(System.in);
// // int b =  sc.nextInt();

// // if(b==1){
// //   System.out.println("hello");
// // }
// // else if (b==2){
// //   System.out.println("Nameste");
// // }
// // else if(b==3){
// //   System.out.println("bonjur");
// // }

// // sc.close();






//   // using switch case------------>
// //   System.out.println("enter the number ");
// //   Scanner sc = new Scanner(System.in);
// //   int b =  sc.nextInt();
// //   // agar hme num lete h 2 agar break nahi use karengge to 2 ke bad vale sare statement print ho jayenge 
// // switch(b){
// // case 1:{
// //   System.out.println("hello");
// // }
// // case 2:{
// //   System.out.println("nameste ");
// // }
// // case 3:{
// //   System.out.println("bonjur");
// // }
// // default:{
// //   System.out.println("wrong value ");
// // }
// // }
// // sc.close();





// // thats why we use  break-------------> 
// //   System.out.println("enter the number ");
// //   Scanner sc = new Scanner(System.in);
// //   int b =  sc.nextInt();
// //   switch(b){
// //   case 1:{
// //     System.out.println("hello");
  
// //   }  break;
// //   case 2:{
// //     System.out.println("nameste ");
// //   }  break;
// //   case 3:{
// //     System.out.println("bonjur");
// //   }  break;
  
// // default:{
// //   System.out.println("wrong value ");
// // }
// // } sc.close();



// // FOR loop ---------------------->
// // for(intitialization, condition, updation ){
// // // do somthing

// // }
// `

// // Wap to print hello world up to 100 times using for loop

// // for(int i=0; i<100;i++)
// // {
// // System.out.println("hello");
// // }

// // agar condition hata de to infinite loop ban jayega 
// // for(int i=0; ;i++)
// // {
// // System.out.println("hello");
// // }



// // Wap to print hello world up to 100 times using while loop.
// // syntex-->
// // intitialization
// // while(condition){
// //   statement 
// // }

// // int i=0;
// // while(i<=10){
// // System.out.println(i+". hello");
// // i++;
// // }




// // Wap to print hello world up to 100 times using while loop. 
// // int i=0;
// // do
// // {
// //   System.out.println(i +". hello");
// //   i++;
// // }
// // while(i<10);


// // Q WAP to print sum of n natural num.
// // System.out.println("enter the nun");
// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// // int count = 0;
// // for( int i=0;i<=n;i++){
// // count = count+i;
// // }
// // System.out.println("sum of n natural num is "+ count);
// // sc.close();




// // Q wap to print table of a number by user.
// // System.out.println("enter the nun");
// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// // for( int i=1;i<=10;i++){
// // int t = n*i;
// // System.out.println(n +"*"+ i+ "=" + t);
// // }
// // sc.close();


// ////////////////////////////////patterns//////////////////////////////////
// // Q1 print the patterns 

// // rows ----> outer loops.
// // colmn------> inner loops. 

// // WAP to print solied rectangle.
// // *****
// // *****
// // *****
// // *****
// // c=5,r=4;




// // for(int i =1; i<=4; i++){
// //   for(int j =1; j<=5; j++){
// //     System.out.print("*");
// //   }
// //   System.out.println();
// // }



// // Q2 print the pattern "Hollow Rectangle".
// // * * * * *
// // *       * 
// // *       *
// // * * * * *


// // System.out.println( "row should be large as comparision to column");
// // System.out.println("enter the row");
// // System.out.println("enter the colmn");
// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// // Scanner sc1 = new Scanner(System.in);
// // int m = sc1.nextInt();

// // for(int i=1; i<=n;i++){

// // for(int j=1;j<=m;j++){
// // if (i==1||j==1||i==n||j==m){
// //   System.out.print("* ");
// // }
// // else{
// //   System.out.print("  ");
// // }
// // }System.out.println();
// // }

// // sc.close();
// // sc1.close();
// // int n=4;
// // int m=5;
// // for(int i =1; i<=n;i++){
// //   for(int j=1; j<=m;j++){
// //     if(i==1||j==1||i==n||j==m){
// // System.out.print("* ");
// //     }
// // else{
// //   System.out.print("  ");
// // }

// // }System.out.println();
// // }

// // int n=4;
// // int m=5;
// // for(int i =1;i<=n;i++)
// // {
// //           for(int j =1;j<=m;j++)
// //         {

// //               if(i==1||j==1||i==n||j==m)
// //               {
// //                  System.out.print("* ");
// //               }
// //              else
// //              {
// //                   System.out.print("  ");
// //              }
// //         }
// // System.out.println();
// // }





// // write a program to print 
// // *
// // **       {j<=i}approach
// // ***
// // ****
// // *****
// // int n=5;
// // for(int i = 1; i<=n;i++){
// //     for(int j = 1; j<=i;j++){
// // System.out.print("* ");
// //     }System.out.println(" ");
// // }



// // 4 print the Pattern
// // *****
// // *** 
// // ** 
// // *


// // int n=4;
// // for(int i=n; i>=1; i--){
// //   for(int j =1; j<=i; j++){
// //     System.out.print("* ");
// //   }System.out.println(" ");
// // }


// // invert half piramid rotated bye 180 deegri.

// //       *
// //     * *
// //   * * *
// // * * * * 


//                                                     // i=1
// // - - - *    3 space + 1 stat = 4     (n-1)spaces + 1star    -->   n-i  + i
// // - - * *    2 space + 2 stat = 4     (n-2)spaces + 2star    -->   n-i  + i
// // - * * *    1 space + 3 stat = 4     (n-3)spaces + 3star    -->   n-i  + i
// // * * * *    0 space + 4 stat = 4     (n-4)spaces + 4star    -->   n-i  + i

//     // num of rows (n) = 4 


//     // int n=5;
//     // for(int i =1; i<=n;i++){
//     //   for(int j =1;j<=n-i;j++){
//     //     System.out.print(" ");   //j only isi block ke liye h 
//     //   }
//     //   for(int j=1; j<=i;j++ ){
//     //     System.out.print("*");
//     //   }System.out.println();
//     // }

// // print a triangle.
// //     * 
// //    * *
// //   * * *
// //  * * * *
// // * * * * *
    
//     // int n=5;
//     // for(int i =1; i<=n;i++){
//     //   for(int j =1;j<=n-i;j++){
//     //     System.out.print(" ");   //j only isi block ke liye h 
//     //   }
//     //   for(int j=1; j<=i;j++ ){
//     //     System.out.print("* ");
//     //   }System.out.println();
//     // }



// // 6 print half pyramid with number. 

// // 1        row num = 1     no 1to 1
// // 12       row num = 2     no 1to 2
// // 123      row num = 3     no 1to 3
// // 1234     row num = 4     no 1to 4
// // 12345    row num = 5     no 1to 5

// // int n= 5;
// // for (int i =1; i<=n; i++){
// //   for(int j = 1; j<=i; j++){
// //     System.out.print(j);

// //   }System.out.println();
// // }



// // 7 inverted half pyramid with Number

// // 12345
// // 1234
// // 123
// // 12
// // 1

// // 
// // int n= 5;
// // for(int i=0; i<=n;i++){
// //   for(int j=1; j<=n-i;j++){

// //     System.out.print(j);
// //   }System.out.println();


// // }

// // or



// // int n= 5;
// // for(int i=1; i<=n;i++){
// //   for(int j=1; j<=n-i+1;j++){

// //     System.out.print(j);
// //   }System.out.println();


// // }

// // 8) print Floyd's Triangle
// // 1                                              
// // 23                                              
// // 456
// // 78910
// // 11 12 13 14 15


// // int n= 5;
// // for (int i =1; i<=n; i++){
// //   for(int j = 1; j<=i; j++){
// //     System.out.print(j);

// //   }System.out.println();
// // }






// // int n = 5;
// // for(int i = 1; i<=n; i++){
// //   for(int j = 1; j<=i; j++)
// // {
// // System.out.print(j);
// // }
// // System.out.println();

// // }



// // int n= 5;
// // int number =1;
// // for(int i = 1;i<=n;i++){
// //   for(int j=1; j<=i;j++){
// //     System.out.print(number+" ");
// //     number++;
// //   }System.out.println();
// // }


// // Q9} print the 0-1 Triangle.
// // 1
// // 01
// // 101
// // 0101
// // 10101


// /*
//    __1____2____3___4____5__ j---->
// 1  | 1  |   |    |   |    |  
// 2  | 0  | 1 |    |   |    |
// 3  | 1  | 0 |  1 |   |    |
// 4  | 0  | 1 |  0 | 1 |    |
// 5  | 1  | 0 |  0 | 0 |  1 |
// i  |____|___|____|___|____|
// ^
// |
// |
// */
  

// // if i+j = even then print =1
// // if i +j = odd thn print = 0


// // int n = 5;
// // for(int i =1; i<=n; i++){
// //   for(int j=1; j<=i; j++){
// //     int sum = i+j;
// //     if(sum%2==0){
// //       System.out.print("1 ");
// //     }
// //     else{
// //       System.out.print("0 ");
// //     }
// //   }System.out.println();
// // }



// // print Butterfly Patterns 

// // *             *     
// // * *         * *
// // * * *     * * *
// // * * * * * * * *
// // * * * * * * * *
// // * * *     * * *
// // * *         * *
// // *             *


//                    // n=4
// // * - - - - - - *     1      1 star      6space    1star
// // * * - - - - * *     2      2 star      4space    2star
// // * * * - - * * *     3      3 star      2space    3star
// // * * * * * * * *     4      4 star      0space    4star
// // * * * * * * * *     
// // * * * - - * * *
// // * * - - - - * *
// // * - - - - - - *        i = 1        2*3     (n-i)     (4-1) = 3 
// //                        i = 2        2*2     (n-i)     (4-2) = 2
// //                        i = 3        2*1     (n-i)     (4-3) = 1
// //                        i = 4        2*0     (n-i)     (4-4) = 0

  
// // spaces = 2*(n-i)


// // // uppar half 
// // int n=5;
// // for(int i =1;i<=n; i++ ){
// //   // 1st part
// //   for(int j = 1; j<=i; j++){
// // System.out.print("*" );

// //   }
// // // space
// // int space= 2*(n-i);
// // for(int j=1; j<=space; j++){
// //   System.out.print(" ");
// // } 
// // //  2nd part 
// // for(int j=1; j<=i; j++){
// // System.out.print("*");

// //   }System.out.println();
// // }



// // //lower half
// // for(int i =n;i>=1; i-- ){
// //   // 1st part
// //   for(int j = 1; j<=i; j++){
// // System.out.print("*");

// //   }
// // // space
// // int space= 2*(n-i);
// // for(int j=1; j<=space; j++){
// //   System.out.print(" ");
// // } 
// // //  2nd part 
// // for(int j=1; j<=i; j++){
// // System.out.print("*");

// //   }System.out.println();
// // }





// // Q11) print solid Rhombus.
     

//     //     *****
//     //    ***** 
//     //   ***** 
//     //  ***** 
//     // ***** 


//   //   ----*****  i = 1     4 space     5star
//     // ---*****   i = 2     3 space     5star
//     // --*****    i = 3     2 space     5star
//     // -*****     i = 4     1 space     5star
//     // *****      i = 5     0 space     5star


//         // i = 1     4       space = n-i     5-1 =4
//         // i = 2     3       space = n-i     5-2 =3
//         // i = 3     2       space = n-i     5-3 =2
//         // i = 4     1       space = n-i     5-4 =1
//         // i = 5     0       space = n-i     5-5 =0



// //   int n =5;
// //   for(int i =1; i<=n; i++){
// // for(int j= 1;j<=n-i;j++ ){
// //   System.out.print(" ");
// // }
// // for(int j = 1;j<=n;j++)

// // {
// //   System.out.print("*");
// // }System.out.println();
// // }

  



// // Q12 print holoye solid Rhombus.
// //   int n =5;
// //   for(int i =1; i<=n; i++){
// // for(int j= 1;j<=n-i;j++ ){
// //   System.out.print(" ");
// // }
// // for(int j = 1;j<=n;j++)
// // {
// //   if(i==1||j==1||i==n||j==n){
// //   System.out.print("* ");}
// //   else{q <=ei){






// remaining question 

























// recursion ----->
// Print all the subsequence of a string. 
// "abc".
// public  class yt{
//     public static boolean map[]= new boolean[26];
//     public static void fun(String str, int indx, String newString){
//         if(indx== str.length() ){
//             System.out.println(newString);
//             return;

//         }
//         char currchar = str.charAt(indx);
//         if(map[currchar-'a']){
//             fun(str, indx+1, newString);
//         }
//         else{
//             newString += currchar;
//             map[currchar-'a']=true;
//             fun(str, indx+1, newString);
//         }
//     }
//     public static void main(String[] args) {
//     String str ="abcadadca";
//     fun(str, 0, "");

//     }
// }




// "aaa" print all of a string "abc".






// Object oriented programing.

// class -->  is a blue print.
// object -->

// class A{
//         public void fun(){
//                 System.out.println("hello");
//         }
// }

// public class yt{
//         public static void main(String[] args) {
//              A obj = new A();
//              obj.fun();   
//         }
// }

// Note : funcation jo class ke ander difine hote h use mathod kahte h.


// class pen{
//         String color;
//         // String type;
//       // method 
// //         public void write(){
// //                 System.out.println("writing somthing");
// //       }
//      public void printColor(){
//         System.out.println(this.color);
//       }
// }
// public class yt{
//         public static void main(String[] args){
              
//                 // obj  define ------------->
//                 pen obj = new pen();
//                 // obj.write();
//                 obj.color= "blue";
//                 // obj.type = "gel";



//                 //  pen obj1 = new pen();
//                 // obj1.color= "blue";
//                 // obj1.type = "gel";
//                 // obj.write();

//                 pen obj2 = new pen();
//                 obj2.color= "black";
//                 // obj2.type = "gel";


//         //     obj call----------->    
//                 obj.printColor();
//                 obj2.printColor();
//       }
// }



// example 2 
// class B{
//         int age;
//         String name;
//         public void fun(){
//                 System.out.println(age); 
//                 System.out.println(this.age);      //this ka use 
//                 System.out.println(this.name);
//         }
// }
// public class yt{
//         public static void main(String[] args) {
//                  B obj =  new B();     // new ---- memory me space le leta h / B() ---> ak constructor h.  class ka nam or obje ka name same hota h, constructor kuch return nahi karte h nahi void chalta , ak obj ke liye constuctor ak hi bar call hota h.    
//                  obj.age= 32;                                                      // non paramiterised constuctor
//                  obj.name= "amnesh";
//                  obj.fun();                
//         }
// }




// constructor : ----> when funcation name and class name are same is called constructor. 
// Properties of constructor 
// 1. it dosent have any return type. 
// 2. obj ke liye constructor ak hi bar call hota h. 

// types of constructor 
// 1 defoult constructor. 
// 2 paramiterised constructor. 
// 3 copy constructor. 


// default constructor ------->

// class constructor {
//         constructor(){
//                 System.out.println("hello amnesh");
//         }
// }
// public class yt{
//         public static void main(String[] args) {
//                 constructor obj = new constructor();  // we not need to write .obj

//         }
// }


// paramiterised constuctor
// class constructor {
//             String Name;
//             int Age;
//         constructor(String  name, int age){
//               this.Name =  name;
//               this.Age = age;
//               System.out.println(name);
//               System.out.println(age);
//         }
// }
// public class yt{
//         public static void main(String[] args) {
//                 constructor obj = new constructor("amnesh", 25);  // we not need to write .obj
//         }
// }











// copy constructor  ----- > ak object ko copy karke dusre object me dalna.


// class student{
//         String name = "amnesh";
//         int age = 34;
//         student (student s2){
//                 int Name  = s2.name;
//                  }
//         student{

//             }
// }
// public class yt{
//         public static void main(String[] args) {
//             student obj =  new  student();
            
//         }
// }




// java ---> spring, jpa, meven,  spring



// follstack.  
// nodejs.
// react - >  frontend
//  ui , Mern stack.



//                    Dart.
//  mobile app - >  fluter. 



// Math =  AI.


// array ki time complexity linear time hoti h.  

// hasemap ki time complecxity O(1) hoti h 
// constant time ke vjha se. 
// testing  - automation. 
// sy








// array - -- >  tow pointer algorithum , hashing, Bits(xor), binary search. 















//***************************( Remember why you are started )********************************************************
//***********************************  DATA STRUCTURE (DSA) *********************************************************











// Sorting  -----> Sort element in accending and decending order.
// linear search
// binary search 
// Bubble sort 
// selection sort 
// insertion sort 
// merge sort 



// merge sort  ------------------------------------------------------>    
// Approach :-
// Divide and conquer.

// public class yt{
//     // nlogn 
//     public static void conquer(int arr[], int si, int mid , int ei){

//         int merged[]= new int [ei-si+1];
//         int idx1 =  si;
//         int idx2= mid +1;
//         int x =  0;
//        while(idx1<=mid && idx2<=ei){
//             if(arr[idx1]<=arr[idx2]){
//                 merged[x++] = arr[idx1++];
//             }
//             else{ 
//                 merged[x++] = arr[idx2++];
//             }}
// while(idx1<=mid){
//     merged[x++]=arr[idx1++];
// }
// while(idx2<=ei){
//     merged[x++]=arr[idx2++];
// }
// for(int i=0, j=si; i<merged.length; i++,j++){
//     arr[j]= merged[i];
// }
//     }



//  public static void divide(int arr[], int si, int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid =  si + (ei-si)/2;
//         divide(arr, si, mid);
//         divide(arr, mid+1, ei);
//         conquer(arr, si, mid, ei);
// }
//   public static void main(String[] args) {
//         int arr[]= {6,3,9,5,2,8};
//         // int n = arr.length;
//         divide(arr, 0, arr.length-1);
//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
// }








// Quick short--------------------->


// approach:-
//  pivot and partition. 

// public class yt{
//     public static int partition(int arr[], int low, int high){
//         int pivot = arr[high];
//         int i= low -1;
//         for(int j=low; j<high; j++){
//             if(arr[j]<pivot){
//                 i++;
//                 // swap 
//                 int temp = arr[i];
//                 arr[i] =arr[j];
//                 arr[j]= temp;
//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = arr[high];
//         arr[high] = temp;
//         return i; 
//     }

// public static void QuickSort(int arr[], int low, int high){
//     if(low <high){
//         int pidx = partition (arr, low, high);
//         QuickSort(arr, low, pidx-1);
//         QuickSort(arr, pidx+1, high);
//     }
// }
//     public static void main(String[] args) {
//         int [] arr = {6,3,9,5,2,8};
        
//         QuickSort(arr, 0, arr.length-1);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();

//     }
// }





// Arraylist--------------------------->


// is a part of java collection frame work. 
// it is a resizable Array.

// import java.util.ArrayList;
// import java.util.Collections;
// public class yt{
//     public static void main(String[] args){
//         ArrayList<Integer> list =  new ArrayList<>();
        // ArrayList<Boolean> list1 =  new ArrayList<>();
        // ArrayList<Float> list3 =  new ArrayList<>();

        // Method in array list 
        // add method    -----ye sare element piche ki taraf add hone chalu ho jayenge.
        // list.add(1);
        // list.add(4);
        // list.add(2);
        // System.out.println(list);

        // get method  ----> index ki value ko show karta h.  
        // int element = list.get(0);
        // System.out.println(0);



        // add element in between. 
        // list.add(1,4);
        // System.out.println(list);


        // delete element 

        // list.remove(3);
        // System.out.println(list);








        // set element  ---> element ke uper element copy kar deta h.
        // list.set(0,5);
        // System.out.println(list);   
        
        

        //   size 
        // int   size =  list.size();
        // System.out.println(size);


        // for(int i = 0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        
        
        // sorting in java  - in accending order.

        // Collections.sort(list);
        // System.out.println(list);b5
        
//     }
// }


// Linkdlist 

// public class yt{
//         class Node{

//         }
//         public static void main(String[] args) {
                
//         }
// }




































































