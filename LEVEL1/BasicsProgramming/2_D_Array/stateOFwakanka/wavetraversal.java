// 1  2  3
// 4  5  6
// 7  8  9

// Path followed by traveler: 1->4->7->8->5->2->3->6->9


// Sample Input

// 3
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

// Sample Output
// 11
// 21
// 31
// 32
// 22
// 12
// 13
// 23
// 33
// 34
// 24
// 14


// import java.util.*;
// public class wavetraversal 
// {
//     public static void main(String[] args)
//     {
//         // The state of wakanda - Part -1

//         Scanner scn = new Scanner(System.in);
//         int r = scn.nextInt();
//         int c = scn.nextInt();
//         int [][]arr = new int[r][c];
//         for (int i = 0 ; i<r ; i++)
//         {
//             for (int j = 0 ; j<c ; j++)
//             {
//                 arr[i][j] = scn.nextInt();
//             }
//         }

//         for (int col = 0 ; col<arr[0].length ; col++)
//         {
//             if(col %2 ==0)
//             {
//                 for(int row = 0 ; row<arr.length ; row++)
//                 {
//                     System.out.println(arr[row][col]);
//                 }
//             }
//             else
//             {
//                 for(int row = arr.length - 1 ; row>0 ; row--)
//                 {
//                     System.out.println(arr[row][col]);
//                 }   
//             }
//         }
//     }
// }



import java.util.*;
public class wavetraversal{

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

    public static void sow(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;

        for(int col = 0 ; col<m ; col++)
        {
            if(col%2 == 0)
            {
                for(int row = 0 ; row<n ; row++)
                {
                    System.out.println(arr[row][col]);
                }
            }
            else{
                for(int row = n-1 ; row>=0 ; row--)
                {
                    System.out.println(arr[row][col]);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int [][] arr = new int[r][c];
        input(arr);

        sow(arr);

    }
}