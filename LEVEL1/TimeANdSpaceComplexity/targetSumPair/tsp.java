// Sample Input

// 12
// 9 
// -48 
// 100 
// 43 
// 84 
// 74 
// 86 
// 34 
// -37 
// 60 
// -29 
// 44
// 160

// Sample Output
// 60, 100
// 74, 86

import java.io.*;
import java.util.*;

public class tsp {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    Arrays.sort(arr);

    int li = 0;
    int ri = arr.length - 1;
    

    while(li < ri){
        if(arr[li] + arr[ri] < target){
            li++;
        }
        else if(arr[li] + arr[ri] > target){
            ri--;
        }
        else{
            System.out.println(arr[li] + "," + arr[ri]);
            li++;
            ri--;
        }
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}