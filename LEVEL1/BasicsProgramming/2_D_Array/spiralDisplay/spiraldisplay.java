// Sample Input

// 3
// 5
// 11
// 12
// 13
// 14
// 15
// 21
// 22
// 23
// 24
// 25
// 31
// 32
// 33
// 34
// 35

// Sample Output
// 11
// 21
// 31
// 32
// 33
// 34
// 35
// 25
// 15
// 14
// 13
// 12
// 22
// 23
// 24


// import java.util.*;
// public class spiraldisplay 
// {
//     public static void main(String[] args ) 
//     {
//         Scanner scn = new Scanner(System.in);
        
//         int r = scn.nextInt();
//         int c = scn.nextInt();

//         int [][] arr = new int [r][c];

//         for (int i = 0; i <r ; i++)
//         {
//             for (int j = 0  ; j<c ; j++)
//             {
//                 arr[i][j] = scn.nextInt();
//             }
//         }

//         int min_row = 0;
//         int max_row = arr.length - 1;
//         int min_col = 0;
//         int max_col = arr[0].length - 1;
        
//         int tne = r *c;
//         int count = 0;

//         while(count < tne)
//         {
//             // left wall
//             for (int i = min_row  , j = min_col ; i <= max_row && count < tne; i++)
//             {
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             min_col++;
            
//             // bottom wall
//             for (int i = max_row  , j = min_col ; j<= max_col && count < tne; j++)
//             {
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             max_row--;

//             // right wall
//             for (int i = max_row , j = max_col ; i >= min_row && count < tne; i--)
//             {
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             max_col--;


//             // top wall
//             for (int i = min_row  , j = max_col ; j >= min_col && count < tne; j--)
//             {
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             min_row++;


//         }
//     }
    
// }


import java.util.*;
import java.io.*;
public class spiraldisplay{
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr)
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void spiral_disp(int [][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        int minr = 0 ; 
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;

        int count = 0 ;
        int total = n*m;

        while(count < total)
        {   
            // Left
            for(int i = minr ; i<=maxr && count < total ; i++)
            {
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            // botom
            for(int j = minc ; j<=maxc  && count < total; j++)
            {
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;

            // right
            for(int i = maxr ; i>=minr && count < total; i--)
            {
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            // top
            for(int j = maxc ; j>=minc && count < total; j--)
            {
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
        }
    }

    public static void main(String[] args)
    {
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] arr = new int[r][c];

        input(arr);
        spiral_disp(arr);
    }
}