// 5
// 1
// 2
// 3
// 4
// 5

// Sample Output
// 5 4 3 2 1



import java.util.*;
import java.io.*;
public class reverseanarray
{
    public static void display(int[] a)
    {
        StringBuilder sb = new StringBuilder();
    
        for(int val: a)
        {
            sb.append(val + " ");
        }
        System.out.println(sb);
        }
    
        public static void reverse(int[] a){
        // write your code here

        // int i = 0;
        // int j = a.length-1;
        // while (i<j) {
        //     int temp = a[i];
        //     a[i] = a[j];
        //     a[j] = temp;
        //     i++;
        //     j--;

        // }
        // public static void reverse(int[] a) {

            for (int i = 0, j = a.length - 1; i < j; i++, j--)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
    
        reverse(a);
        display(a);
    }
}