// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377

import java.util.*;
public class pat12 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        for(int row = 1 ; row<=n ; row++)
        {
            for(int col = 1 ; col<=row ; col++)
            {
                System.out.print(a + "\t");
                int c = a + b;
                a = b ; 
                b = c; 
            }
            System.out.println();
        }
    }
}
