import java.util.*;
public class Loops
{
public static void main (String[] args)
{
        // int i =1 ; 
        // while (i<=9)
        // {
        //     System.out.println(i);
        //     i++;  // i = i+1
        // }

        // System.out.println("Done.");


    // for (int i =1 ; i<=9; i++)
    // {
    //     System.out.println(i);
    // }

    // int i = 10;
    // for( ;i <= 10; )
    // {
    //     System.out.println(i);
    //     i++;
    // }

     
    // int i = 1;
    // while(i <= 10)
    // {
    //     System.out.println(i);
    //     i++;
    // }




    // POST INCREMENT
//     int n =1;
//     System.out.println(n);
//     int y = n++;
//     System.out.println(y);
//     int t = ++n;
//     System.out.println(t);
// }
        

        // POST AND PRE INCREMENT


        // int y = 1;
        // System.out.println(y);
        // y++;
        // System.out.println(y);
        // System.out.println(y);

        // int n = 5;
        // System.out.println(n);
        // int t = ++n;
        // System.out.println(t);



        int i = 10;
        if(i++ == i)
 	System.out.println(i + " is good");
        else
 	System.out.println(i + " is bad");
 
        int j = 20;
        if(++j == j)
 	System.out.println(j + " is good");
        else
 	System.out.println(j + " is bad");

}
}