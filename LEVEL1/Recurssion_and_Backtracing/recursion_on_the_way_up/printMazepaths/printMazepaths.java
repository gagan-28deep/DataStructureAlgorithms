import java.io.*;
import java.util.*;

public class printMazepaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        printMazePaths(1, 1, r, c, "");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr > dr || sc > dc)
        {
            return;
        }
        if(sr == dr && sc == dc)
        {
            System.out.println(psf);
            return;
        }

        printMazePaths(sr, sc + 1, dr, dc, psf + "h");
        printMazePaths(sr + 1, sc , dr, dc, psf + "v ");
    }

}
