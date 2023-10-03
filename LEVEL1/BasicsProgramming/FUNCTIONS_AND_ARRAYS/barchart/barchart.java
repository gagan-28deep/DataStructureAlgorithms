// Sample Input

// 5
// 3
// 1
// 0
// 7
// 5

// Sample Output
// 			  *		
// 			  *		
// 			  *	  *	
// 			  *	  *	
// *		  *   *		
// *		  *	  *		
// *   *	  *	  *	


import java.util.*;
public class barchart 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        

        int [] arr = new int[n];
        
        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        // int max = arr[0];
        // for (int i = 1 ; i<arr.length ; i++)
        // {
        //     if (arr[i] > max)
        //     {
        //         max = arr[i];
        //     }
        // }
        // for (int floor = max ; floor>=1 ; floor--)
        // {
        //     for (int i = 0 ; i<arr.length ; i++)
        //     {
        //         if (arr[i] >= floor)
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

        barch(arr);
    }
    public static int maximum(int [] a)
    {
        int max = -1;
        // for(int i = 0 ; i<a.length ; i++)
        // {
        //     if(a[i] > max)
        //     {
        //         max = a[i];
        //     }
        // }

        for(int ele : a)
        {
           max =  Math.max(ele, max);
        }
        return max;
    }
    public static void barch(int [] a)
    {
        int max = maximum(a);
        for(int floor = max ; floor>0 ; floor--)
        {
            for(int ele : a)
            {
                if(ele >=floor)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
