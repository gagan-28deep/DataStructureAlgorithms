//         *	
//         *	*	
//   *  *  *	*	*	
//         *	*	
//         *	

import java.util.*;
public class pat17 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1; 
        int space = n/2;
        for(int row = 1 ; row<=n ; row++)
        {
            for(int csp = 1 ; csp<=space ; csp++)
            {
                if(row==n/2 +1)
                {

                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }

            for(int cst = 1 ; cst<=star ; cst++)
            {
                System.out.print("*\t");
            }
            if(row<=n/2)
            {
                star +=1;
                
            }
            else{
                star -=1;
                
            }
            System.out.println();
            
        }
    }
}
