//                 *	
// 			    *		
// 		    *			
// 	    *				
//  *



import java.util.*;
public class pat8 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1;
        int space = n-1;

        for(int row = 1 ; row<=n ; row++)
        {
            for(int csp = 1 ; csp <=space ; csp++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");

            space--;
            System.out.println();
        }
    }


     // ANOTHER METHOD 

    // Scanner scn = new Scanner(System.in);

    // int n = scn.nextInt();

    // //sp = n-1;
    // //st = 1;

    // for (int i = 1 ; i<=n ; i++ )
    // {
    //     for (int j = 1 ; j<=n ; j++)
    //     {
    //         if (i+j == n+1) 
    //         {

    //             System.out.print("*\t");
    //         }
    //         else
    //         {
    //             System.out.print("\t");
    //         }
            
        
    //     }
    //     System.out.println();
    // }
}
