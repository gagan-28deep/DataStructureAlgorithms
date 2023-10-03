import java.util.*;

public class Myfirst{

public static void main(String[]  args) {
    //System.out.print("Hello world This is first program ");
    //System.out.print("*\n**\n***\n****\n*****");
    //System.out.print("*****\n   * \n  *  \n *    \n*****");


    // VARIABLES 
    int x =15;
    int y=10;

    int sum =x+y;

    int pr = x*y;

    int v1 = x/y;    // QUOTIENT

    int v2 = y/x;

    int v3 = x%y;    // REMAINDER


    //System.out.print(sum);
    //System.out.print( pr);

    //System.out.println(v1);

    //System.out.println(v2);

    //System.out.println(v3);    


    //EXPRESSION

    int exp = x*y /x+y;

    // System.out.println(exp);

    // int exp1 = (x*y) / (x+y);

    // System.out.println(exp1);
    


    // int expnew = (int)Math.pow(2, 3);
    // System.out.println(expnew);

    // System.out.println(Math.pow(2, 3));



//     int a = 10; 
//     int b = 20;
//     a = a + b;
//     b = a - b;
//     a = a - b;
   
//    System.out.println(a + " " + b);



      // TAKING INPUT

      Scanner scn = new Scanner(System.in);
    //   int n = scn.nextInt();

    //   for (int i =0 ; i < n; i++)
    //   {
    //       System.out.println(i);
    //   }   


    String name = scn.nextLine();

    System.out.print("Hello"  +"\n" + name);



                               
}
}