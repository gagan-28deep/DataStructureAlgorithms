// Sample Input

// 10

// Sample Output
// 55


// changing state (n)-- Capital -- done
// Memoization line remove -- done
//return --> continue   -- done
// calls -- use dp

import java.util.*;
import java.io.*;

public class fibonTab {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fb = fb_dp_Tab(n, new int[n + 1]);
        System.out.println(fb);
    }

    public static int fb_dp_Tab(int N, int[] dp) {
        // Dir
        for (int n = 0; n < dp.length; n++) {

            if (n == 0 || n == 1) {
                dp[n] = n;
                continue;
            }

            int fb1 = dp[n-1];
            int fb2 = dp[n-2];
            int fb_res = fb1 + fb2;
            dp[n] = fb_res;
        }

        return dp[N];

    }
}
