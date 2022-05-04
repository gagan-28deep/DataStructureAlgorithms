import java.util.Scanner;

// 1. You are given a number n, representing the count of items.
// 2. You are given n numbers, representing the values of n items.
// 3. You are given n numbers, representing the weights of n items.
// 3. You are given a number "cap", which is the capacity of a bag you've.
// 4. You are required to calculate and print the maximum value that can be created in the bag without 
//     overflowing it's capacity.
// Note -> Each item can be taken any number of times. You are allowed to put the same item again 
//                   and again.

// Sample Input

// 5
// 15 14 10 45 30
// 2 5 1 3 4
// 7

// Sample Output
// 100

import java.util.*;
import java.io.*;
public class us {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] vls = new int[n];
        int [] wts = new int[n];
        for(int i = 0 ; i< vls.length ; i++){
            vls[i] = scn.nextInt();
        }
        for(int i = 0 ; i< wts.length ; i++){
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int [] dp = new int[cap + 1];
        dp[0] = 0;

        for(int bagc = 1 ; bagc < dp.length ; bagc++){
            int max = 0 ;
            for(int i = 0 ; i<n ; i++){
                if(wts[i] <=bagc){
                    int rbagc = bagc - wts[i];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + vls[i];

                    if(tbagv > max){
                        max = tbagv;
                    }
                }
            }
            dp[bagc] = max;
        }

        System.out.println(dp[cap]);
    }
}
