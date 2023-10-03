
	// 	        *	
    //     *		*	
    // *				*	
    //     *		*	
    //          *	

import java.util.*;
public class pat10 {
    public static void main(String[] args)
    {

        // PATTERN 10 LOGIC

    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int lsp = n/2;
    // int msps = -1;

    // for (int i =1 ; i <=n ; i++)
    // {
    //     //System.out.print(os + " , " + is);

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int lsp = n/2;
        int msp = -1;

        for(int row = 1 ; row<=n ; row++)
        {
            for(int csp = 1 ; csp<=lsp ; csp++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int csp = 1 ; csp<=msp ; csp++)
            {
                System.out.print("\t");
            }

            if(row !=1 && row !=n)
            {
                System.out.print("*\t");
            }

            // update

            if(row<=n/2)
            {
                msp +=2;
                lsp -=1;
            }
            else{
                msp -=2;
                lsp +=1;
            }

            System.out.println();
        }
    }
}
