// Sample Input

// 9
// 15
// 16
// 19
// 21
// 23
// 24
// 1
// 2
// 12

// Sample Output
// 1

import java.io.*;
import java.util.*;

public class pivot {

  public static int findPivot(int[] arr) {
    // write your code here
    int low = 0;
    int high = arr.length - 1;
    
    while(low < high){
        int mid = (low + high) /2 ;
        if(arr[mid] < arr[high])   // pivot will belong on left side
        {
            high = mid;
        }
        else{
            low = mid + 1;    // pivot will belong on right side
        }
    }

    return arr[low];
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
  }

}