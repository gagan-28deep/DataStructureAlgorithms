// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1	
// 1    5  10   10  5  1 


import java.util.*;
public class pat13 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 0 ; row<n ; row++)
        {
            int icj = 1;
            for(int col = 0 ; col<=row ; col++)
            {
                System.out.print(icj+"\t");
                int icjp1 = icj * (row-col) / (col+1);
                icj = icjp1;
            }

            System.out.println();
        }
    }
}
