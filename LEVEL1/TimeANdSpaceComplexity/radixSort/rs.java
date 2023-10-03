// Sample Input

// 5
// 7 
// 2 
// 4 
// 1 
// 3

// Sample Output
// After sorting on 1 place -> 1 2 3 4 7 
// 1 2 3 4 7

import java.io.*;
import java.util.*;

public class rs {

  public static void radixSort(int[] arr) {
    // write code here    
    int max = Integer.MIN_VALUE;
    for(int val : arr){
        if(val > max){
            max = val;
        }
    }

    int exp = 1;
    while(exp <=max){
        countSort(arr, exp);
        exp = exp * 10;

    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here    
    // Make frequency arr
    int [] farr = new int[10];
    for(int i = 0 ; i <arr.length ; i++){
        int idx = arr[i];
        farr[idx / exp %10]++; 
    }
    // Convert it into prefix sum array
    for(int i = 1; i < farr.length ; i++){
        farr[i] += farr[i-1];
    }
    // Stable sorting(filling ans array)
    int [] ans = new int[arr.length];
    for(int i = arr.length - 1 ; i>=0 ; i--){
        int val = arr[i];
        int pos = farr[val / exp %10];
        int idx = pos - 1; 
        ans[idx] = val;
        farr[val / exp %10]--;
    }
    // Filling original array with help of ans array
    for(int i = 0 ; i<arr.length ; i++){
        arr[i] = ans[i];
    }
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}