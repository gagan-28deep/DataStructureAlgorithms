import java.util.*;
import java.io.*;

public class this_invokeCCcons3{


    // 3. this() can be used to invoke current class constructor
    // Constructor Chaining
    public static class sum{
        sum(){
            // System.out.println("Your addition is : " + 0);
            this(0,0);
        }
        sum(int a , int b){
            // System.out.println("Your addition is : " + (a + b));
            this(a,b,0);
        }
        sum(int a , int b , int c){
            // System.out.println("Your addition is : " + (a + b + c));
            this(a,b,c,0);
        }
        sum(int a , int b , int c , int d){
            System.out.println("Your addition is : " + (a + b + c + d));
        }
    }

    public static void main(String[] args) {
        sum s0 = new sum();
        sum s1 = new sum(10 , 20);
        // sum s2 = new sum(10,20,30);
        // sum s3 = new sum(10,20,30,40);
    }
}
