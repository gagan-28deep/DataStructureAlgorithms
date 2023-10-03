import java.io.*;
import java.util.*;

public class get_mazepath {

    public static void main(String[] args) throws Exception {
        Scanner sc  = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<String> res = getMazePaths(1, 1, r, c);
        System.out.println(res);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc<dc)
        {
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr < dr)
        {
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();

        for(String hpath : hpaths)
        {
            paths.add("h" + hpath);
        }

        for(String vpath : vpaths)
        {
            paths.add("v" + vpath);
        }

        return paths;
    }

}