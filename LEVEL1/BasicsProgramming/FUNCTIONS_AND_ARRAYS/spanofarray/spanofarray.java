
// Span = Max of array - Min of array

// import java.util.*;
// public class spanofarray 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         int [] arr = new int[n];
        
//         for (int i = 0 ; i<arr.length ; i++)
//         {
//             arr[i] = scn.nextInt();
//         }
//         int max = arr[0];
//         int min = arr[0];
//         for (int i = 0;i<arr.length ; i++)
//         {
            
//             if (arr[i] >max)
//             {
//                 max = arr[i];
//             }
//             if (arr[i]<min)
//             {
//                 min = arr[i];
//             }
            
//         }
//         int span = max - min;
//         System.out.println(span);

//     }
// }


import java.util.*;
public class spanofarray
{
    public static int span(int [] arr)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++)
        {
            int curVal = arr[i];
            if(curVal > max)
            {
                max = curVal;
            }
            if(curVal<min)
            {
                min = curVal;
            }
        }
        return max - min;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int ans = span(arr);
        System.out.println(ans);
    }
}