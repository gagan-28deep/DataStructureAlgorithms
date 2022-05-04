import java.util.*;
import java.io.*;
public class this_PassedAsA4 {
    public static class rectangle{
        private int x = 0 , y = 0 , w = 0 , h = 0;
        public rectangle(){
            this(1,1);
        }   
        public rectangle(int h , int w){
            this(1,1,h , w);
        }
        public rectangle(int x , int y, int w , int h){
            this.h = h;
            this.w = w;
            this.y = y;
            this.x = x;
            //4. THis Can be passed as an arguement in the method call
            printDimesion(this);
        }

        public void printDimesion(rectangle obj){
            System.out.println("origin at : " + obj.x + " , " + this.y);
            System.out.println("Dimension at : " + obj.w + " , " + this.h);
        }
    }
    public static void main(String[] args) {
        rectangle rpt = new rectangle();
    }
}
