import java.util.*;

public class Fibon
{
public static void main (String[] args){
// {
        // FIBONACCI SERIES


//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();

//     int a =0;
//     int  b = 1;

//     for (int i =0 ; i<n; i++)
//     {
//         System.out.println(a);
//         //System.out.println(b);
//         int c = a+b;
//         a = b;
//         b = c;
        
//     }



    // COUNT DIGITS IN A NUMBER


    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int count = 0;
    // while (n!=0)
    // {
    //     n /=10;
    //     count ++;
    // }
    // System.out.println(count);

    
    
    // DIGITS OF A NUMBER
 
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int temp = n;
    // int nod = 0;
    // while(temp != 0)
    // {
    //     temp = temp/10;
    //     nod++;
    // }
    // int div = (int)Math.pow(10 , nod-1);     //TYPE CASTING FROM FLOAT TO INTEGER
    // while(div!=0)
    // {
    //    int q = n/div;
    //    System.out.println(q);

    //    n = n% div;

    //    div /=10;
    // }


    // REVERSE OF A NUMBER

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    
    
    while(n!=0)
    {
        int rem = n%10;
        n/=10;
        System.out.println(rem);
    }
}
}       