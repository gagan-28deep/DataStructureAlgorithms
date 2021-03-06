// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340

// Constraints

// 1 <= n < 10^9
// -10^9 < k < 10^9

// Format

// Input

// "n" where n is any integer.
// "K" where k is any integer.

// Output

// "r", the rotated number

// Example

// Sample Input

// 562984
// 2

// Sample Output

// 845629

import java.util.*;

public class rotate_n {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int nod = 0;
        int temp = n;
        while(temp !=0)
        {
            temp = temp/10;
            nod++;
        }
        k = k % nod;
        if(k<0)
        {
            k = k+nod;
        }
        int pow = (int)Math.pow(10, k);

        int left = n/pow;
        int right = n %pow;
        int mul = (int)Math.pow(10, nod-k);

        int ans = right* mul + left;
        System.out.println(ans);





        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int temp = n;
    int nod=0;
    while(temp > 0)     // TO CALCULATE NUMBER OF DIGITS
    {
        temp = temp/10;
        nod++;
    }

    k = k%nod;   // FOR LARGE NUMBERS eg : 353

    if (k<0)
    {
        k = k + nod;   // FOR NEGATIVE NUMBERS
    }

    // int div = 1;
    // int mul = 1;
    // for (int i =1 ; i <= nod ; i++)
    // {
    //     if (i <=k)
    //     {
    //         div = div *10;
    //     }
    //     else 
    //     {
    //         mul = mul *10;

    //     }
    // }

    // int q = n / div ; 
    // int r = n % div ; 
    
    // int rot  = r * mul + q ; 
    // System.out.println(rot);

    }
}
