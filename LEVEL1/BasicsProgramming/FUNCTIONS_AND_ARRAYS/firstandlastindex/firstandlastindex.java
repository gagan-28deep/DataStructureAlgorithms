// Sample Input

// 15
// 1
// 5
// 10
// 15
// 22
// 33
// 33
// 33
// 33
// 33
// 40
// 42
// 55
// 66
// 77
// 33

// Sample Output
// 5
// 9




import java.util.*;
import java.io.*;
public class firstandlastindex 
{
    public static void main(String[] args) throws Exception
    {
    // First And Last Index

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int first_index = firstIndex(arr , data);
        System.out.println(first_index);

        int last_index = lastIndex(arr , data);
        System.out.println(last_index);
        
        // int l = 0;
        // int h = arr.length - 1;
        // int fi = -1;
        // while(l<=h)
        // {
        //     int mid = (l + h) /2;
        //     if(data > arr[mid])
        //     {
        //         l = mid+1;
        //     }
        //     else if (data < arr[mid])
        //     {
        //         h = mid-1;
        //     }
        //     else
        //     {
        //         fi = mid;
        //         h = mid -1;
        //     }

        // }
        // System.out.println(fi);
        // l = 0;
        // h = arr.length - 1;

        // int li = -1;
        // while(l<=h)
        // {
        //     int mid = (l + h) /2;
        //     if(data > arr[mid])
        //     {
        //         l = mid+1;
        //     }
        //     else if (data < arr[mid])
        //     {
        //         h = mid-1;
        //     }
        //     else
        //     {
        //         li = mid;
        //         l = mid +1;
        //     }

        // }
        // System.out.println(li);



    }

    public static int firstIndex(int [] arr , int x)
    {
        int fi = -1;
        int low = 0;
        int high = arr.length - 1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == x)
            {
                fi = mid;
                high = mid - 1;
            }
            else if(arr[mid] < x)
            {
                low = mid + 1;
            }
            else
            {
                // arr[mid] > x
                high = mid - 1;
            }
        } 
        return fi;
    }


    public static int lastIndex(int [] arr , int x)
    {
        int li = -1;
        int low = 0;
        int high = arr.length - 1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == x)
            {
                li = mid;
                low = mid + 1;
            }
            else if(arr[mid] < x)
            {
                low = mid + 1;
            }
            else
            {
                // arr[mid] > x
                high = mid - 1;
            }
        } 
        return li;
    }
}    
