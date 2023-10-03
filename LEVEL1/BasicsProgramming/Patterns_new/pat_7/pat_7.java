// *	
//   *	
// 	    *	
// 	       *	
// 		     *


import java.util.*;
public class pat_7 {
    public static void main(String[] args)
    {

        // PATTERN 7 LOGIC

    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int st = 1;
    // int sp = 0;
    // for (int i = 1 ; i<=n ; i++)
    // {
    //     System.out.println(sp + "\t" + st);

    //     sp ++ ;
    // }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1; 
        int space = 0;
        for(int row = 1 ; row<=n ; row++)
        {
            // work
            for(int csp = 1 ; csp<=space ; csp++)
            {
                System.out.print("\t");
            }

            System.out.print("*\t");
            // for(int cst = 1 ; cst<=star ; cst++)
            // {
            //     System.out.print("*\t");
            // }
            System.out.println();
            space++;

        }
    }


     // ANOTHER METHOD

//    Scanner scn = new Scanner(System.in);
//    int n = scn.nextInt();

//    for (int i =1 ; i<=n ; i++)
//    {
//        for (int j = 1 ; j<=n ; j++)
//        {
//            if (i == j)
//            {
//                System.out.print("*\t");
//            }
//            else 
//            {
//                System.out.print("\t");
//            }
//        }
}
