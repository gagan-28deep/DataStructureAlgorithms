//          1	
//      2	3	2	
//  3	4	5	4   3	
//      2	3	2	
//          1	


import java.util.*;
public class pat15 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n/2;

        int star = 1;

        int val = 1;

        for(int row = 1 ; row<=n ; row++)
        {

            for(int csp = 1 ; csp<=space ; csp++)
            {
                System.out.print("\t");
            }

            int cval = val;
            for(int cstar = 1 ; cstar<=star ; cstar++)
            {
                System.out.print(cval + "\t");
                if(cstar <=star/2)
                {
                    cval++;
                }
                else
                {
                    cval--;
                }
            }

            if(row <=n/2)
            {
                space--;
                star +=2;
                val++;
            }
            else{
                space ++;
                star -=2;
                val--;
            }
            System.out.println();
        }
    }
}
