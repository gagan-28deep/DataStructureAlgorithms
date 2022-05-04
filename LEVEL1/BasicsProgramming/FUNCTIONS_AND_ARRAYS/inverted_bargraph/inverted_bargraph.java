// Sample Input
// 5
// 3
// 1
// 0
// 7
// 5
// Sample Output

//    *   *      *   * 
//    *          *   *
//    *          *   *
//               *   *
//               *   *
//               *
//               *




import java .util.*;
public class inverted_bargraph{
    public static int maximum(int[] arr){
        int max = -1;
        for(int val : arr){
            max = Math.max(val, max);
        }
        return max;
  }
    public static void invetedbargraph(int [] arr){
        int max = maximum(arr);
        for(int floor = 0 ; floor< max ; floor ++)
        {
            for(int ele : arr){
                if(ele>floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(("\t"));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        invetedbargraph(arr);
    }
}