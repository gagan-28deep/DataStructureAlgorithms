// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.


// Sample Input

// 4
// 4
// 0
// 0
// 1
// 0
// 1
// 0
// 0
// 0
// 0
// 0
// 0
// 0
// 1
// 0
// 1
// 0

// Sample Output
// 1
// 3




// import java.util.*;
// public class exitpoint 
// {
//     public static void main(String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         int r = scn.nextInt();
//         int c = scn.nextInt();
//         int [][] arr = new int[r][c];

//         for (int i = 0 ; i<r ; i++)
//         {
//             for (int j = 0 ; j<c ; j++)
//             {
//                 arr[i][j] = scn.nextInt();    
//             }
//         }

//         int dir = 0;   // 0 - east  , 1 - south , 2 - west , 3 - north
//         int i = 0;
//         int j = 0;

//         while(true)
//         {   
//             dir = (dir + arr[i][j]) %4;
//             if(dir == 0) // east
//             {
//                 j++;
//             }
//             else if(dir == 1)     // south
//             {
//                 i++;
//             }
//             else if(dir == 2)      // west
//             {
//                 j--;
//             }
//             else if(dir == 3)   // north
//             {
//                 i--;
//             }
//             if(i<0)
//             {
//                 i++;
//                 break;
//             }
//             else if(j < 0)
//             {
//                 j++;
//                 break;
//             }
//             else if(i == arr.length)
//             {
//                 i--;
//                 break;
//             }
//             else if(j == arr[0].length)
//             {
//                 j--;
//                 break;
//             }
//         }

//         System.out.println(i);
//         System.out.println(j);
        


        
//     }    
// }



import java.util.*;
public class exitpoint{
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

    public static void exit_point(int [][] arr)
    {
        int dir = 0 ; // 0 - east  , 1 - south , 2 - west , 3 - north
        int row = 0 ; 
        int col = 0 ;
        while(true)
        {
            dir = (dir + arr[row][col]) % 4;
            if(dir == 0)   // east
            {
                col++;
            }
            else if(dir == 1) // south
            {
                row++;
            }
            else if(dir == 2)   // west
            {
                col -- ;
            }
            else if(dir == 3)   // north
            {
                row--;
            }

            if(row < 0)
            {
                row++;
                break;
            }
            else if(col<0)
            {
                col++;
                break;
            }
            else if(row == arr.length)
            {
                row--;
                break;
            }
            else if(col == arr[0].length)
            {
                col--;
                break;
            }
        }

        System.out.println(row);
        System.out.println(col);


    }
    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] arr = new int[r][c];

        input(arr);

        exit_point(arr);
    }
}