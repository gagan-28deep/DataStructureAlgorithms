// Sample Input

// 4
// 11
// 12
// 13
// 14
// 21
// 22
// 23
// 24
// 31
// 32
// 33
// 34
// 41
// 42
// 43
// 44

// Sample Output
// 11
// 22
// 33
// 44
// 12
// 23
// 34
// 13
// 24
// 14


// For Example:
// The monuments are named as:
// 1    2    3    4
// 5    6    7    8
// 9   10  11  12
// 13 14  15  16
// The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
// You are required to print the path followed by the traveller to visit all the monuments.
// Refer to the photo for a better clarification.
// 1. You are given a number n, representing the number of rows and columns of a square matrix.
// 2. You are given n * n numbers, representing elements of 2d array a.
// 3. You are required to diagonally traverse the upper half of the matrix and print the contents.
// For details check image.



// import java.util.*;
// public class thestory2 
// {
//     //  The state of waanda - 2
//     public static void main(String[] args)
//     {

//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int [][] arr = new int[n][n];
//         for (int i = 0 ; i<arr.length ; i++)
//         {
//             for (int j = 0 ; j<arr[0].length ; j++)
//             {
//                 arr[i][j] = scn.nextInt();
//             }
//         }
    
//         for(int g = 0 ; g<arr.length ; g++)
//         {
//             for(int i = 0 , j = g ; j<arr.length ; i++ , j++)
//             {
//                 System.out.println(arr[i][j]);
//             }
//         }
//     }
// }


import java.util.*;
public class thestory2
{
    public static Scanner scn = new Scanner(System.in);
    public static void input(int [][] arr)
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }    
        }
    }

    public static void sow2(int [][] arr)
    {
        int n = arr.length;
        for(int gap = 0 ; gap<arr.length ; gap++)
        {
            for(int i = 0 , j= gap ; j<n ; i++ , j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) throws Exception
    {
        int n = scn.nextInt();
        int [][] arr= new int[n][n];
        input(arr);
        
        sow2(arr);
    }
}