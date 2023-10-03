// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*	


import java.util.*;
public class pat_6 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = (n/2) + 1;
        int space = 1;
        for(int row = 1 ; row<=n ; row++)
        {
            for(int cst = 1 ; cst<=star ; cst++)
            {
                System.out.print("*\t");
            }

            for(int csp = 1 ; csp<=space ; csp++)
            {
                System.out.print("\t");
            }

            for(int cst = 1 ; cst<=star ; cst++)
            {
                System.out.print("*\t");
            }

            if(row <=n/2)
            {
                star--;
                space +=2;
            }
            else{
                star++;
                space -=2;
            }
            System.out.println();
        }


        // PATTERN 6 LOGIC
    
    // Scanner scn = new Scanner(System.in);

    // int n = scn.nextInt();

    // int st = (n/2)+1;
    // int  sp = 1;

    // for (int i = 1 ; i<=n ; i++)
    // {
    //     System.out.println(st + "\t" + sp + "\t" + st);

    //     if (i<=n/2) 
    //     {
    //         sp  = sp+2;
    //         st--;
    //     }
    //     else 
    //     {
    //         sp = sp-2;
    //         st++;
    //     }
    // }
    }
}
