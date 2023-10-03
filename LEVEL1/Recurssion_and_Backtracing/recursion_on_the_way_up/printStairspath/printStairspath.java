import java.io.*;
import java.util.*;

public class printStairspath {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n, "");
    }

    // public static void printStairPaths(int n, String path) {
    //     if(n<0)
    //     {
    //         return;
    //     }
    //     if(n==0)
    //     {
    //         System.out.println(path);
    //         return;
    //     }
    //     printStairPaths(n - 1, path + "1");
    //     printStairPaths(n - 2, path + "2");
    //     printStairPaths(n - 3, path + "3");
    // }

    public static void printStairPaths(int n , String path){
        if(n == 0){
            System.out.println(path);
            return;
        }
        for(int jump = 1 ; jump<=3 ; jump++){
            if(n-jump >= 0){
                printStairPaths(n - jump, path + jump);
            }
        }
    }

}
