import java.io.*;
import java.util.*;

public class last_index {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n]; 
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int li = lastIndex(arr, 0, d);
        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length)
        {
            return -1;
        }
        int liisa = lastIndex(arr, idx + 1, x);
        if(liisa == -1)
        {
            if(arr[idx] == x)
            {
                return idx;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return liisa;
        }
    }
    
}    
