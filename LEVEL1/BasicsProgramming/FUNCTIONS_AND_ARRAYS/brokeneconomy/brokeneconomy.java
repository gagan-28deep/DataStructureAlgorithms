import java.util.*;
import java.io.*;
public class brokeneconomy 
{
    public static void main(String[] args) throws Exception
    {
    //Floor and Ceil Problem

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int ceil = 0;
        int floor = 0;

        // int ceil = Integer.MAX_VALUE;
        // int floor = Integer.MIN_VALUE;


        while(l<=h)
        {
            int mid = (l + h) /2;
            if(data > arr[mid])
            {
                l = mid+1;
                floor = arr[mid];
            }
            else if (data < arr[mid])
            {
                h = mid-1;
                ceil = arr[mid];
            }
            else
            {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }        
}