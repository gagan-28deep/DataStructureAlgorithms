// 5
// 3
// 1
// 0
// 7
// 5
// 6
// 1
// 1
// 1
// 1
// 1
// 1

// Sample Output
// 1
// 4
// 2
// 1
// 8
// 6


// import java.util.*;
// public class sumoftwoarrays 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scn = new Scanner(System.in);

//         int n1 = scn.nextInt();

//         int [] arr = new int[n1];
//         for (int i = 0; i<arr.length ; i++)
//         {
//             arr[i] = scn.nextInt();
//         }
        
//         int n2 = scn.nextInt();
//         int [] arr2 = new int[n2];
//         for (int i = 0; i<arr2.length ; i++)
//         {
//             arr2[i] = scn.nextInt();
//         }
        
//         int [] sum = new int[n1>n2 ? n1:n2]; 
//         int c = 0;

//         int i = arr.length -1;
//         int j = arr2.length -1;
//         int k = sum.length -1;
//         while(k >=0)
//         {
//             int d = c;
//             if(i>=0)
//             {
//                 d+=arr[i];
//             }
//             if(j>=0)
//             {
//                 d+=arr2[j];
//             }
//             c = d/10;
//             d = d%10;

//             sum[k] = d;
            
//             i--;
//             j--;
//             k--;
            
//         }
//         if(c!=0)
//         {
//             System.out.println(c);
//         }
//         for(int val:sum)
//         {
//             System.out.println(val);
//         }


//     }
// }



import java.util.*;
public class sumoftwoarrays{

    public static void sumofarray(int [] a1  , int [] a2)
    {
        int s1 = a1.length;
        int s2 = a2.length;
        int size = s1 > s2 ? s1 : s2;

        int [] sumarray = new int[size];

        int i = s1-1;
        int j = s2 - 1;
        int k = size - 1;
        int carry = 0;
        while(k>=0)
        {
            int sum = carry;
            
            if(i>=0)
            {
                sum +=a1[i];
            }
            if(j>=0)
            {
                sum+=a2[j];
            }
            carry = sum / 10;
            sum = sum %10;
            sumarray[k] = sum;

            i--;
            j--;
            k--;

        }
            
            if(carry != 0)
            {
                System.out.println(carry);
            }

            for(int value : sumarray)
            {
                System.out.println(value);
            }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] a1 = new int[n1];

        for(int i = 0 ; i<a1.length ; i++)
        {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int [] a2 = new int[n2];

        for(int i = 0 ; i<a2.length ; i++)
        {
            a2[i] = scn.nextInt();
        }

        sumofarray(a1 , a2);
    }


}