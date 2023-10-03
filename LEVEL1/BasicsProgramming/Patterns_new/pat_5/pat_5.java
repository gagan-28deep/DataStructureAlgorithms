//          *	
//      *	*	*	
//  *	*	*	*	*	
//      *	*	*	
//          *	

import java.util.*;
public class pat_5 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1;
        int space  = n/2;
        for(int row = 1 ; row <=n ; row++)
        {
            // work
            for(int csp = 1 ; csp<=space ; csp++)
            {
                System.out.print("\t");
            }
            for(int cst = 1 ; cst<=star ; cst++)
            {
                System.out.print("*\t");
            }
            // for(int csp = 1 ; csp<=space ; csp++)
            // {
            //     System.out.print("\t");
            // }
            // update
            if(row <= n/2)
            {
                star +=2;
                space--;
            }
            else
            {
                star -=2;
                space++;
            }
            System.out.println();
        }



        // LOGIC BEHIND PATTERN 5


    // for (int i = 1 ; i<=n ; i++)
    // {
    //     System.out.println(sp + "\t" + st);

    //     if (i<=n/2) 
    //     {
    //         sp --;
    //         st = st+2;
    //     }
    //     else 
    //     {
    //         sp++;
    //         st = st+2;
    //     }
    // }
    }
}
