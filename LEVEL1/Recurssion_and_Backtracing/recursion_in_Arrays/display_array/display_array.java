import java.io.*;
import java.util.*;

public class display_array 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        displayArr(arr, 0);
        // write your code here
    }

    public static void displayArr(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }
}
