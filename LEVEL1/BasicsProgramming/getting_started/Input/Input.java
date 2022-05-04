import java.util.*;

public class Input
{
public static void main(String[] args)
{



      // TAKING INPUT

      //Scanner scn = new Scanner(System.in);
    //   int n = scn.nextInt();

    //   for (int i =0 ; i < n; i++)
    //   {
    //       System.out.println(i);
    //   }   


    // String name = scn.nextLine();

    // System.out.print("Hello"  +"\n" + name);



      // TAKING INPUT

      // IF CODE HAVE BOTH STRING AND INTEGER

      Scanner scn = new Scanner(System.in);
      int n = Integer.parseInt(scn.nextLine());
      String name = scn.nextLine();

      System.out.print("Hello "  + name + " Here is the counting");

      for (int i =0 ; i < n; i++)
      {
          System.out.println(i);
      }   



   


}
}