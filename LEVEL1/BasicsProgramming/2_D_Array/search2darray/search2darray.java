// 1. You are given a number n, representing the number of rows and columns of a square matrix.
// 2. You are given n * n numbers, representing elements of 2d array a. 
// Note - Each row and column is sorted in increasing order.
// 3. You are given a number x.
// 4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
// 5. In case element is not found, print "Not Found".

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
// 43

// Sample Output
// 3
// 2


// import java.util.*;
// public class search2darray 
// {
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

//         int data = scn.nextInt();

//         for (int row = 0 ; row<arr.length;row++)
//         {
//             for (int col = 0 ; col<arr[0].length ; col++)
//             {
//                 if(arr[row][col] == data)
//                 {
//                     System.out.println(row);
//                     System.out.println(col);
//                     return;
//                 }
//             }
//         }

//     }    
// }



// import java.util.*;
// public class search2darray{
//     public static void main(String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int [][] arr = new int[n][n];

//         for(int i = 0 ; i<arr.length ; i++)
//         {
//             for(int j = 0 ; j<arr[0].length ; j++)
//             {
//                 arr[i][j] = scn.nextInt();
//             }
//         }

//         int data = scn.nextInt();

//         int i = 0;
//         int j = n-1;

//         while(j>=0 && i<n)
//         {
//             int m = arr[i][j];
//             if(m == data)
//             {
//                 System.out.println(i);
//                 System.out.println(j);
//                 return;
//             }
//             else if(m>data)
//             {
//                 j--;
//             }
//             else{
//                 i++;
//             }
//         }

//         System.out.println("Not Found");
//     }
// }