// Sample Input

// 4

// Sample Output
// 7

import java.io.*;
import java.util.*;

public class dp_climbstairs {
    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cp = cp_Tab(n , new int[n+1]);
        System.out.println(cp);

    }

    // public static int cls_rec(int n)
    // {
    //     if(n == 0)
    //     {
    //         return 1;
    //     }
    //     if(n<0)
    //     {
    //         return 0;
    //     }

    //     int nm1 = cls_rec(n - 1);
    //     int nm2 = cls_rec(n - 2);
    //     int nm3 = cls_rec(n - 3);
    //     int cp = nm1 + nm2 + nm3;

    //     return cp;

    // }


    // public static int count_path_memoisation(int n , int[] qb)
    // {
    //     if(n == 0)
    //     {
    //         return 1;

    //     }

    //     if(n<0)
    //     {
    //         return 0;
    //     }

    //     if(qb[n] > 0)
    //     {
    //         return qb[n];
    //     }

    //     int nm1 = count_path_memoisation(n - 1, qb);
    //     int nm2 = count_path_memoisation(n - 2, qb);
    //     int nm3 = count_path_memoisation(n - 3, qb);

    //     int cp = nm1 + nm2 + nm3;

    //     qb[n] = cp;

    //     return cp;
    // }


    // public static int cp_tab(int n)
    // {
    //     int [] dp = new int[n+1];
    //     dp[0] = 1;
    //     for(int i = 1 ; i<=n ; i++)
    //     {
    //         if(i==1)
    //         {
    //             dp[i] = dp[i-1];
    //         }
    //         else if(i==2)
    //         {
    //             dp[i] = dp[i-1] + dp[i-2];
    //         }
    //         else{
    //             dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
    //         }
    //     }

    //     return dp[n];
    // }



    public static int cp_Tab(int N , int [] dp){
        for(int n = 0 ; n<dp.length ; n++){
            if(n==0){
                dp[n] = 1;
                continue;
            }

            int count = 0 ;
            if(n-1 >=0){
                count += dp[n-1];
            }
            if(n-2 >=0){
                count += dp[n-2];
            }
            if(n-3 >=0){
                count += dp[n-3];
            }
            dp[n] = count;
        }

        return dp[N];
    }
}