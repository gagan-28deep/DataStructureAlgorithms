// 3
// 2
// 6
// 7
// 4
// 1
// 0
// 0
// 0

// Sample Output
// 7
// 3
// 3


import java.util.*;
public class differenceoftwoarrays 
{
    public static void main(String[] args) 
    {    
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();

        int [] a1 = new int[n1];
        for (int i = 0; i<a1.length ; i++)
        {
            a1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int [] a2 = new int[n2];
        for (int i = 0; i<a2.length ; i++)
        {
            a2[i] = scn.nextInt();
        }

        diff_2arrays(a1, a2);
        // int [] diff = new int[n2];
        // int c = 0;
        // int i = a1.length -1;
        // int j = a2.length -1;
        // int k = diff.length -1;

        // while(k>=0)
        // {
        //     int d = 0;
        //     int a1v = i>=0 ? a1[i] :0;
        //     if(a2[j] + c >= a1v)
        //     {
        //         d = a2[j] + c - a1v;
        //         c = 0;
        //     }
        //     else
        //     {  
        //         d = a2[j] + c +  10 -a1v;
        //         c = -1;
        //     }
        //     diff[k] = d;
        //     i--;
        //     j--;
        //     k--;
        // }
        // int idx = 0;
        // while(idx <diff.length)
        // {
        //     if(diff[idx] == 0)
        //     {
        //         idx++;
        //     }
        //     else
        //     {
        //         break;
        //     }
        // }
        // while(idx <diff.length)
        // {
        //     System.out.println(diff[idx]);
        //     idx++;
        // }
    }

    public static void diff_2arrays(int [] a1 , int [] a2)
    {
        int [] diff = new int[a2.length];
        int borrow = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while(k>=0)
        {
            int di = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if(a2[j] + borrow >= a1v)
            {
                di = a2[j] + borrow - a1v;
                borrow = 0; 
            }
            else
            {
                di = a2[j] + borrow + 10 - a1v;
                borrow = -1;
            }
            diff[k] = di;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while(idx <diff.length)
        {
            if(diff[idx] == 0)
            {
                idx++;
            }
            else{
                break;
            }
        }

        while(idx < diff.length)
        {
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
