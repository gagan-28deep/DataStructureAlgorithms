// 6
// 15
// 30
// 40
// 4
// 11
// 9
// 40

// Sample Output
// 2


import java.util.*;

public class linear_search {

    public static int lin_search(int [] arr , int data)
    {
        int idx = -1;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i] == data)
            {
                idx = i;
            }
        }

        return idx;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for(int i = 0 ; i <arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int ans = lin_search(arr , data);
        System.out.println(ans);
        System.out.println(arr[ans]);

    }
}
