// *	*	*	*	*	
// *	*	*	*	
// *	*	*	
// *	*	
// *


import java.util.*;
public class pattern_2 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = n;
        int space  = 0;
        for(int row = 1 ; row <=n ; row++)
        {
            // work
            for(int cst = 1 ; cst<=star ; cst++)
            {
                System.out.print("*\t");
            }

            for(int csp = 0 ; csp<=space ; csp++)
            {
                System.out.print("\t");
            }
            // update
            star--;
            space++;
            System.out.println();
        }


        // 2 PATTERN QUESTION

    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();

    // for (int i =n ; i>=1 ;i--)
    // {
    //     for (int j=1 ; j<=i ; j++)
    //     {

    //         System.out.print("*\t");
    //     }

    //     System.out.println();
    // }

    }    
}
