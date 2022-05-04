// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

// Constraints

// 1 <= n < 10^9

// Format

// Input

// "n" where n is any integer.

// Output

// d1
// d2
// d3
// ... digits of the number

// Example

// Sample Input

// 65784383

// Sample Output

// 6
// 5
// 7
// 8
// 4
// 3
// 8
// 3

import java.util.*;
  
  public class digits_of_n{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int temp = n;
    int nod = 0;
    while(temp !=0)
    {
        temp = temp/10;
        nod++;
    }  
    int div = (int)Math.pow(10 , nod-1);
    while(div !=0)
    {
      int q = n/div;
      System.out.println(q);

      n = n%div;
      div = div/10;
    }
   }
}
