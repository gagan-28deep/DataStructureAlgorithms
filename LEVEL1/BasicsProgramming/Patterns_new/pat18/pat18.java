// *  *	 *	 *	 *	 *	 *	
// 	  *				 *	
// 		 *		*	    
// 			 *	         
// 		 * 	 *	 *	     
// 	  *	 *	 *	 *	 *	
// *  *	 *	 *	 *	 *	 *	



import java.util.*;
public class pat18 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = n ; 
        int space = 0;

        for(int row = 1 ; row<=n ; row++)
        {
            for(int csp = 1 ; csp<=space ; csp++)
            {
                System.out.print("\t");
            }
            for(int cst = 1 ; cst <=star ; cst++)
            {
                if(row>1 && row<=n/2 && cst>1 && cst<star)
                {

                    System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }


            if(row<=n/2)
            {
                star -=2;
                space +=1;
            }
            else
            {
                star +=2;
                space -=1;
            }

            System.out.println();


        }
    }
}
