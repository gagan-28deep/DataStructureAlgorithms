import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int [][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Please enter the target to search");
        int target = scn.nextInt();

        int [] ans = linearSearch2D(arr , target);
        // for (int i = 0; i < ans.length; i++) {
        //     System.out.println("The element is present at " +  ans[i] + "location");
        // }
        System.out.println(Arrays.toString(ans));
        
    }
    public static int [] linearSearch2D(int [][] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}