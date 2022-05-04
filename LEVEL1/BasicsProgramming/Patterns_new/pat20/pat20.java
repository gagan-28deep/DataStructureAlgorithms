//  *				 * 	
//  *				 *	
//  *		 *		 *	
//  *	 *		 *	 *	
//  *				 *



import java.util.*;

public class pat20 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int row = 1 ; row<=n ; row++)
        {
            for(int col = 1 ; col<=n ; col++)
            {

                if(row <= n/2)
                {
                    if(col == 1 || col == n)
                    {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                else if(row == n/2 + 1)
                {
                    if(col == 1 || col == n || col == n/2+1)
                    {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                else if(row < n)
                {
                    if(col != n/2 + 1)
                    {
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                else
                {
                    if(col == 1 || col == n)
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



 // PATTERN 20 ANOTHER METHOD


//  Scanner scn = new Scanner(System.in);
//  int n = scn.nextInt();

//  for (int i = 1 ; i<=n ; i++)
//  {
//      for (int j = 1 ; j<=n;j++)
//      {
//          if(j==1 || j==n)
//          {
//              System.out.print("*\t");
//          }
//          else if(i>n/2 && (i==j || i+j == n+1))
//          {
//              System.out.print("*\t");
//          }
//          else
//          {
//              System.out.print("\t");
//          }
//      }
//      System.out.println();
//  }
