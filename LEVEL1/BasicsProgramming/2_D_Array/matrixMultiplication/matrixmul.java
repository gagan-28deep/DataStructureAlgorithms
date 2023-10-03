// Sample Input

// 2
// 3
// 10
// 0
// 0
// 0
// 20
// 0
// 3
// 4
// 1
// 0
// 1
// 0
// 0
// 1
// 1
// 2
// 1
// 1
// 0
// 0

// Sample Output
// 10 0 10 0
// 0 20 20 40




// import java.util.*;
// public class matrixmul 
// {
//     public static void main(String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         int r1 = scn.nextInt();
//         int c1 = scn.nextInt();
//         int [][] a1 = new int[r1][c1];
//         for (int i = 0 ; i <r1 ; i++)
//         {
//             for (int j = 0 ; j<c1 ; j++)
//             {
//                 a1[i][j] = scn.nextInt();
//             }
//         }
//         int r2 = scn.nextInt();
//         int c2 = scn.nextInt();
//         int [][]a2 = new int[r2][c2];
//         for (int i = 0 ; i <r2 ; i++)
//         {
//             for (int j = 0 ; j<c2 ; j++)
//             {
//                 a2[i][j] = scn.nextInt();
//             }
//         }

//         if(c1 != r2)
//         {
//             System.out.println("Invalid input");
//             return;
//         }
//         int [][] prod = new int [r1][c2];

//         for (int i = 0 ; i<prod.length ; i++)
//         {
//             for (int j = 0 ; j<prod[0].length ; j++)
//             {
//                 for (int k = 0 ; k<c1 ; k++)
//                 {
//                     prod[i][j] +=a1[i][k] * a2[k][j];
//                 }
//             }
//         }
//         for (int i = 0 ; i<prod.length ; i++)
//         {
//             for (int j = 0 ; j<prod[0].length ; j++)
//             {
//                 System.out.print(prod[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }    

// }


// With functions
import java.io.*;
import java.util.*;

public class matrixmul
{

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {
    // write your code here

        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int [][] A = new int[r1][c1];
        Input(A);
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        if(c1 !=r2)
        {
            System.out.println("Invalid input");
        }
        else{
            int [][] B = new int[r2][c2];
            Input(B);
            multiply(A , B);
        }
    }

    public static void multiply(int [][] A, int [][] B){
    int r1 = A.length;          //row in A
    int c1 = A[0].length;       //cols in A
    int r2 = B.length;          // rows in B
    int c2 = B[0].length;       //cols in B
    
    
    //answer is C
    int [][] C = new int[r1][c2];
    
    for(int i = 0; i<r1; i++){
        for(int j = 0; j<c2; j++){
            int sum = 0;
            for(int k = 0 ; k<r2; k++){
                sum += A[i][k] * B[k][j];
            }
            C[i][j] = sum;
        }
    }
    
    
    Output(C);
}

    public static void Output(int [][] arr){
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

    public static void Input(int [][] arr)
    {
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
}