// Sample Input

// 5
// 7
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 21
// 22
// 23
// 24
// 25
// 26
// 27
// 31
// 32
// 33
// 34
// 35
// 36
// 37
// 41
// 42
// 43
// 44
// 45
// 46
// 47
// 51
// 52
// 53
// 54
// 55
// 56
// 57
// 2
// 3

// Sample Output
// 11 12 13 14 15 16 17
// 21 25 26 36 46 45 27
// 31 24 33 34 35 44 37
// 41 23 22 32 42 43 47
// 51 52 53 54 55 56 57



// import java.util.*;
// public class ringrotate 
// {
//     public static void main(String[] args) throws Exception {
//         // write your code here

//         Scanner scn = new Scanner(System.in);
//         int r = scn.nextInt();
//         int c = scn.nextInt();
        
//         int [][] arr = new int [r][c];

//         for (int i = 0 ; i<arr.length ; i++)
//         {
//             for (int j = 0 ; j<arr[0].length ; j++)
//             {
//                 arr[i][j] = scn.nextInt();
//             }
//         }

//         int s = scn.nextInt();
//         int k = scn.nextInt();

//         rotateshell(arr , s , k);
//         display(arr);
//     }
//     public static void rotateshell(int[][] arr , int s , int k)
//     {
//         int[] oned = fillonedfromshell(arr , s);
//         rotate(oned , k);
//         fillshellfromoned(arr , s, oned);
//     }

//     public static int[] fillonedfromshell(int[][] arr , int s)
//     {
//         int min_row = s-1;
//         int min_col = s-1;
//         int max_row = arr.length -s;
//         int max_col = arr[0].length -s;
        
//         // sz = lw + bw +rw + tw - 4
//         //      (max_row - min_row + 1) + bw + rw + tw - 4
//         //      2*(max_row - min_row + 1) + bw + tw - 4
//         //      2 * max_row - 2 * min_row + 2 + 2*max_col - 2*min_col + 2 -4

        
//         int sz = 2*(max_row - min_row + max_col - min_col);
//         int idx = 0;
//         int []oned = new int [sz];

//         // lw
//         for(int i = min_row ,  j = min_col ; i<=max_row ; i++)
//         {
//             oned[idx] = arr[i][j];
//             idx++;
//         }

//         // bw
//         for(int i = max_row ,  j = min_col + 1 ; j<=max_col ; j++)
//         {
//             oned[idx] = arr[i][j];
//             idx++;
//         }

//         // rw
//         for(int i = max_row  - 1,  j = max_col ; i>=min_row ; i--)
//         {
//             oned[idx] = arr[i][j];
//             idx++;
//         }

//         // tw
//         for(int i = min_row ,  j = max_col - 1 ; j>min_col ; j--)
//         {
//             oned[idx] = arr[i][j];
//             idx++;
//         }
//         return oned;
//     }
//     public static void fillshellfromoned(int[][] arr , int s , int []oned)
//     {
//         int min_row = s -1 ;
//         int min_col = s-1;
//         int max_row = arr.length -s;
//         int max_col = arr[0].length -s;
//         int idx = 0;
        

//         // lw
//         for(int i = min_row ,  j = min_col ; i<=max_row ; i++)
//         {
//             arr[i][j] = oned[idx];
//             idx++;
//         }

//         // bw
//         for(int i = max_row ,  j = min_col + 1 ; j<=max_col ; j++)
//         {
//             arr[i][j] = oned[idx];
//             idx++;
//         }

//         // rw
//         for(int i = max_row  - 1,  j = max_col ; i>=min_row ; i--)
//         {
//             arr[i][j] = oned[idx];
//             idx++;
//         }

//         // tw
//         for(int i = min_row ,  j = max_col - 1 ; j>min_col ; j--)
//         {
//             arr[i][j] = oned[idx];
//             idx++;
//         }
        
//     }
//     public static void rotate(int[] oned , int k) 
//     {
//         k = k % oned.length;
//         if(k<0)
//         {
//             k = k + oned.length;
//         }
//         reverse(oned , 0 , oned.length-k-1);
//         reverse(oned , oned.length-k , oned.length - 1);
//         reverse(oned , 0 , oned.length-1);

//     }
//     public static void reverse(int [] oned , int l1 , int r1) 
//     {
//         while(l1 < r1)
//         {
//             int temp = oned[l1];
//             oned[l1] = oned[r1];
//             oned[r1] = temp;
//             l1++;
//             r1--;  
//         }
//     }

//     public static void display(int[][] arr){
//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr[0].length; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }    
// }



import java.io.*;
import java.util.*;

public class ringrotate {

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
    public static int[] from2Dto1D(int[][] arr , int s)
    {
        int n = arr.length;
        int m = arr[0].length;

        int minr = s-1;
        int maxr = n-s;
        int minc = s-1;
        int maxc = m-s;

        int size = 2*(maxr - minr + maxc - minc);
        int [] oneD = new int[size];
        int idx = 0;
        for(int i = minr ; i<=maxr ; i++)
        {
            oneD[idx] = arr[i][minc];
            idx++;
        }
        minc++;

        for(int j = minc ; j<=maxc ; j++)
        {
            oneD[idx] = arr[maxr][j];
            idx++;
        }
        maxr--;

        for(int i = maxr ; i>=minr ; i--)
        {
            oneD[idx++] = arr[i][maxc];        // arr[idx] then idx++  == arr[idx++]
        }
        maxc--;

        for(int j = maxc ; j>=minc ; j--)
        {
            oneD[idx++] = arr[minr][j];
        }
        minr++;

        return oneD;
    }
    public static void reverse(int[] oneD , int i , int j)
    {
        int li = i;
        int ri = j;
        while (li<ri) 
        {
            int temp = oneD[li];
            oneD[li] = oneD[ri];
            oneD[ri] = temp;
            li++;
            ri--;

        }
    }
    public static void rotate(int [] oneD , int k)
    {
        int n = oneD.length;
        k = k%oneD.length;
        if(k<0)
        {
            k = k + oneD.length;
        }
        reverse(oneD , 0 , n-k-1);
        reverse(oneD, n-k, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);
    }

    public static void from1Dto2D(int [] oneD , int[][] arr , int s)
    {
        int n = arr.length;
        int m = arr[0].length;

        int minr = s-1;
        int maxr = n-s;
        int minc = s-1;
        int maxc = m-s;
        int idx = 0;
        for(int i = minr ; i<=maxr ; i++)
        {
            arr[i][minc] = oneD[idx];
            idx++;
        }
        minc++;

        for(int j = minc ; j<=maxc ; j++)
        {
            arr[maxr][j] = oneD[idx++];
        }
        maxr--;

        for(int i = maxr ; i>=minr ; i--)
        {
            arr[i][maxc] = oneD[idx++];
        }
        maxc--;

        for(int j = maxc ; j>=minc ; j--)
        {
            arr[minr][j] = oneD[idx++];
        }
        minr++;

    }
    public static void ring_rotate(int [][] arr , int s , int r)
    {
        // from2D to 1D   return 1D Array
        // rotate 1D
        // From 1D to 2D    Return 2D Array

        int [] oneD = from2Dto1D(arr, s);
        rotate(oneD, r);
        from1Dto2D(oneD, arr , s);

    }

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        input(arr);

        int s = scn.nextInt();
        int r = scn.nextInt();

        ring_rotate(arr ,s , r);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}