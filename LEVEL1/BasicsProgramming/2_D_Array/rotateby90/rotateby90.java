import java.io.*;
import java.util.*;

public class rotateby90 {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];

        for (int i = 0 ; i <arr.length ; i++)
        {
            for (int j = 0; j <arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        // transpose 
        for (int i = 0;i<arr.length ; i++)
        {
            for(int j = i ; j<arr[0].length ; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse
        // for (int i = 0;i<arr.length ; i++)
        // {
        //     int l1 = 0;
        //     int r1 = arr[i].length-1;
        //     while(l1 < r1)
        //     {
        //         int temp  = arr[i][l1];
        //         arr[i][l1] = arr[i][r1];
        //         arr[i][r1] = temp;
        //         l1++;
        //         r1--;
        //     }

        // }

        for(int []oneD : arr){
            int i = 0;
            int j = oneD.length - 1;
            while(i<j)
            {

                int temp = oneD[i];
                oneD[i] = oneD[j];
                oneD[j] = temp; 
                i++;
                j--;
            }
        }
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