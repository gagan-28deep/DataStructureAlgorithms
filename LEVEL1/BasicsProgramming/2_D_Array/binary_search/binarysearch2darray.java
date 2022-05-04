import java.util.*;
public class binarysearch2darray {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];

        for (int i = 0 ; i<arr.length ; i++)
        {
            for (int j= 0 ; j<arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        int data = scn.nextInt();

        int row = 0 ;
        int col = arr[0].length - 1;

        while(row < arr.length && col>=0)
        {
            if(data == arr[row][col])
            {
                System.out.println(row);
                System.out.println(col);
                return;
            }
            else if (data < arr[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }

        System.out.println("Not found");
    }
}
