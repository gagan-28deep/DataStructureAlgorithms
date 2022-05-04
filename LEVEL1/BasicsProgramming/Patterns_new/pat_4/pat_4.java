//  *	*	*	*	*	
// 	    *	*	*	*	
// 		    *	*	*	
// 			    *	*	
// 				    *




import java.util.*;
public class pat_4 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = n;
        int space  = 0;
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
            star--;
            space++;
            System.out.println();
        }

        // Scanner scn = new Scanner(System.in);

        // int n = scn.nextInt();
        
        // int sp = 0;
        // int st = n;

        // for (int i = 1 ; i <=n ; i++)
        // {
        //     System.out.println(sp + "\t" + st);

        //     st -- ; 
        //     sp ++ ;
        // }
    
    
    }
}
