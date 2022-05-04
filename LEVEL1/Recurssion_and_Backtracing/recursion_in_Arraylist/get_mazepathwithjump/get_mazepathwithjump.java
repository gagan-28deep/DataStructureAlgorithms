import java.io.*;
import java.util.*;

public class get_mazepathwithjump {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, r, c);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc == dc && sr == dr)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal paths
        ArrayList<String> hpaths = new ArrayList<>();
        for(int ms = 1 ; ms<= dc - sc ; ms++)
        {
            hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for(String hpath : hpaths)
            {
                paths.add("h" + ms + hpath);                
            }
        }

        // vertical paths
        ArrayList<String> vpaths = new ArrayList<>();
        for(int ms = 1 ; ms<= dr - sr ; ms++)
        {
            vpaths = getMazePaths(sr + ms, sc  , dr, dc);
            for(String vpath : vpaths)
            {
                paths.add("v" + ms + vpath);                
            }
        }

        // diagnal paths
        ArrayList<String> dpaths = new ArrayList<>();
        for(int ms = 1 ; ms<= dc - sc &&  ms <=dr - sr ; ms++)
        {
            dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
            for(String dpath : dpaths)
            {
                paths.add("d" + ms + dpath);                
            }
        }

        return paths;


    }

}
