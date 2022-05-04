//  *	*	*       *	
//  		*	    *
//  *	*	*	*   *
//  *       *
//  *       *   *   *





import java.util.*;

public class pat19
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 1 ; row<=n ; row++)
        {
            for(int col = 1 ; col<=n ; col++)
            {
                if(row == 1)
                {
                    if(col <= n/2+1 || col == n)
                    {
                        System.out.print("*\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }

                else if(row<=n/2)
                {
                    if(col == n || col == n/2+1)
                    {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                else if(row == n/2+1)
                {
                    System.out.print("*\t");
                }
                else if(row<n)
                {
                    if(col == 1 ||  col ==n/2+1)
                    {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                else{
                    if(col == 1 ||  col >=n/2+1)
                    {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }   
                }
                    
                
            }

            System.out.println();
        }

    }
}