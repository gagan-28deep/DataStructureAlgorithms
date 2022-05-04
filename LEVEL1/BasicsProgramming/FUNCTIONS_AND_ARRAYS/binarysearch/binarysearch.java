// 6
// 15
// 30
// 40
// 4
// 11
// 9
// 40

// Sample Output
// 2
import java.util.*;
public class binarysearch 
{
    public static void main(String[] args)
    {
        // Binary Search

        // int[] arr = {10,20,30,40,50,60,70,80,90,100};
        // int data = 73;
        // int l = 0 ; 
        // int h = arr.length -1;
        // while(l<=h)
        // {
        //     int m = (l + h) / 2;
        //     if (data > arr[m])
        //     {
        //         l = m+1;
        //     }
        //     else if(data < arr[m])
        //     {
        //         h = m-1;
        //     }
        //     else
        //     {
        //         System.out.print(m + " " + arr[m]);
        //         return;
        //     }
        // }
        // System.out.print("Element not found");


        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int ans = binary_Search(arr , data);
        System.out.println(ans);
    }

    public static int binary_Search(int [] arr, int x)
    {
        int i = 0;
        int j = arr.length-1;           
        while(i <= j)
        {
            int mid = (i+j)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                j = mid-1;
            }
            else{
                i = mid + 1; 
            }
        }
        return -1;
    }
}