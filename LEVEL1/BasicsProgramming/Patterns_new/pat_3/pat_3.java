//                  *
//              *	*
//          *	*	*
//      *	*	*	*
//  *	*	*	*	*


import java.util.*;
public class pat_3 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1;
        int space  = n-1;
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

            // update
            star++;
            space--;
            System.out.println();
        }


        // LOGIC BEHIND PATTERN 3   

    // Scanner scn = new Scanner(System.in);

    // int n = scn.nextInt();
    
    // int sp = n-1;
    // int st = 1;

    // for (int i = 1 ; i <=n ; i++)
    // {
    //     System.out.println(sp + "\t" + st);

    //     st ++ ; 
    //     sp -- ;
    // }
    
    }
    
}
