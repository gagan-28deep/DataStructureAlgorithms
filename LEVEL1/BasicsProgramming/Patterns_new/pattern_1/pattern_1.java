import java.util.Scanner;

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints

// 1 <= n <= 100

// Format

// Input

// A number n

// Output

// *
// *   *
// *   *   *
// *   *   *   *
// *   *   *   *   *


import java.util.*;
public class pattern_1{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1;
        int space  = n-1;
        for(int row = 1 ; row <=n ; row++)
        {
            // work
            for(int cst = 1 ; cst<=star ; cst++)
            {
                System.out.print("*\t");
            }

            for(int csp = 1 ; csp<=space ; csp++)
            {
                System.out.print("\t");
            }
            // update
            star++;
            space--;
            System.out.println();
        }


        // 1st PATTERN QUESTION

        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();

        // for (int i =0 ; i<=n ;i++)
        // {
        //     for (int j=1 ; j<=i ; j++)
        //     {

        //         System.out.print("*\t");
        //     }

        //     System.out.println();


        //   }

    }
}