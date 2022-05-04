// Sample Input

// 5
// 7 
// -2 
// 4 
// 1 
// 3

// Sample Output
// -2
// 1
// 35
// 4
// 7


import java.io.*;
import java.util.*;

public class cs {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int range = max - min + 1;
   int [] farr = new int[range];
   for(int i = 0 ; i <arr.length ; i++){
       int idx = arr[i] - min;
        System.out.println("Index is " + idx);
       farr[idx]++; 
       System.out.println(farr[idx]);
   }

   for(int i = 1; i < farr.length ; i++){
       farr[i] = farr[i] + farr[i-1];
       System.out.println(farr);
   }

   int [] ans = new int[arr.length];
   for(int i = arr.length - 1 ; i>=0 ; i--){
       int val = arr[i];
       System.err.println("Value is " + val);
       int pos = farr[val - min];
       System.out.println("position is " + pos);
       int idx = pos - 1;
       System.out.print("index is " + idx); 
       ans[idx] = val;
       System.out.println(ans);
       farr[val - min]--;
    }

    for(int i = 0 ; i<arr.length ; i++){
        arr[i] = ans[i];
    }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
    
  }

}