// 1												1	
// 1	2										2	1	
// 1	2	3								3	2	1	
// 1	2	3	4						4	3	2	1	
// 1	2	3	4	5				5	4	3	2	1	
// 1	2	3	4	5	6		6	5	4	3	2	1	
// 1	2	3	4	5	6	7	6	5	4	3	2	1	

import java.util.*;
public class pat16 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int space = (2*n )- 3;
        int star = 1;
        for(int row = 1 ; row<=n ; row++)
        {
            int val = 1;
            for(int cst = 1 ; cst<=star ; cst++)
            {
                System.out.print(val + "\t");
                val++;
            }

            for(int csp = 1 ; csp<=space ; csp++)
            {
                System.out.print("\t");
            }
            if(row==n)
            {
                star--;
                val--;
            }
            for(int cst = 1 ; cst<=star ; cst++)
            {
                val--;
                System.out.print(val + "\t");
                
            }

            //update 

            star++;
            space -=2;
            
            System.out.println();
        }
    }
}
