// Sample Input

// 3
// 10
// 20
// 30

// Sample Output
// 10	
// 10	20	
// 10	20	30	
// 20	
// 20	30	
// 30	



//  Subarray : Continuous segment of Array
import java.util.*;
import java.io.*;
public class subarray_problem {
    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];

        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        subarray(arr);

        // for (int i = 0 ; i < arr.length ; i++)
        // {
        //     for (int j = i; j <arr.length ; j++)
        //     {
        //         for (int k = i ; k<=j ; k++)
        //         {
        //             System.out.print(arr[k] + "\t");
        //         }
        //         System.out.println();
        //     }
        // }
    }

    public static void subarray(int [] arr)
    {
        int n = arr.length;
        for(int st = 0 ; st <n ; st++)
        {
            for(int end = st ; end < n ; end++)
            {
                for(int k = st ; k<=end ; k++)
                {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
