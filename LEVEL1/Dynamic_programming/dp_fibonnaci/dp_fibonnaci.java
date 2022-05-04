// Sample Input

// 10

// Sample Output
// 55

// import java.io.*;
// import java.util.*;

// public class dp_fibonnaci
// {

    //   Fibonnaci using recursion

//     public static void main(String[] args) throws Exception 
//     {
        // write your code here
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = fb_recu(n);
//         System.out.println(m);
//     }


//     public static int fb_recu(int n)
//     {
//         if(n == 0 || n == 1)
//         {
//             return n;
//         } 

//         int fb1 = fb_recu(n-1);
//         int fb2 = fb_recu(n-2);

//         int fb = fb1 + fb2;
//         return fb;

//     }
// }


import java.util.*;
import java.io.*;

class dp_fibonnaci
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fb = fb_dp_memoized(n, new int[n+1]);
        System.out.println(fb);
    }

    public static int fb_dp_memoized(int n , int []qb)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        if(qb[n]!=0)
        {
            return qb[n];
        }

        int fb1 = fb_dp_memoized(n - 1, qb);
        int fb2 = fb_dp_memoized(n - 2, qb);
        int fb_res = fb1 + fb2;


        // qb[n] = fb_res;

        // return fb_res;

        return qb[n] = fb_res;


    }
}
