import java.util.*;
public class array {


    // Function

    public static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args)
    {
        // int [] arr = new int[5];
        // arr[0] = 31;
        // arr[1] = 3;
        // arr[2] = 41;
        // arr[3] = 65;
        // arr[4] = 87;

        // for (int i = 0; i<arr.length ; i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // Assignment

        // int [] one = arr;
        // one[2] = 78;

        // for (int i = 0 ; i<one.length ; i++)
        // {
        //     System.out.print(one[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i<arr.length ; i++)
        // {
        //     System.out.println(arr[i]);
        // }

        // swap(arr, 0, 4);
        // for (int i = 0 ; i<arr.length ; i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
            
        // Input of Array


        
        int [] arr;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        arr = new int [n];

        for (int i = 0; i<arr.length ; i++)
        {
            arr[i] =  scn.nextInt();
        }
        for (int i = 0; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        
        

    }    
}
