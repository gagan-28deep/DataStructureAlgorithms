// 1. You are given a number n, representing the count of items.
// 2. You are given n numbers, representing the values of n items.
// 3. You are given n numbers, representing the weights of n items.
// 3. You are given a number "cap", which is the capacity of a bag you've.
// 4. You are required to calculate and print the maximum value that can be created in the bag without 
//      overflowing it's capacity.

// Note -> Each item can be taken 0 or 1 number of times. You are not allowed to put the same item 
//                again and again.

// Sample Input

// 5
// 15 14 10 45 30
// 2 5 1 3 4
// 7

// Sample Output
// 75

import java.util.*;
import java.io.*;
public class zo{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] vls = new int[n];
        int [] wts = new int[n];

        for(int i = 0 ; i<vls.length ; i++){
            vls[i] = scn.nextInt();
        }
        for(int i = 0 ; i<wts.length ; i++){
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int [][] dp = new int[n+1][cap + 1];

        for(int i = 1 ; i<dp.length ; i++){
            for(int j = 1 ; j<dp[0].length ; j++){
                // in j balls ,how much i team can score maximum runs.
                if(j >= wts[i-1]){
                    int rCap = j - wts[i-1];
                    if(dp[i-1][rCap] + vls[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][rCap] + vls[i-1];
                    }
                    else{
                        dp[i][j] = dp[i-1][j]; // when i doesn't bat
                    }
                }
                else{
                    dp[i][j] = dp[i-1][j]; // when i doesn't bat
                }
            }
        }

        System.out.println(dp[n][cap]);
    }
}