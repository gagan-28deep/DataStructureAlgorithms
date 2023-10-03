import java.util.*;
import java.io.*;

public class thisUse {
    public static class sum {
        sum() {

            this(0, 0);
        }

        sum(int a, int b) {

            this(a, b, 0);
        }

        sum(int a, int b, int c) {

            this(a, b, c, 0);
        }

        sum(int a, int b, int c, int d) {
            System.out.println("Your addition is : " + (a + b + c + d));
        }

        public void parameterRectangle(rectangle rec){
            int res = 2 * (rec.h + rec.w);
            System.out.println("Parameter of Rectangle : " + res);
        }

        public void areaRectangle(rectangle rec){
            int res = (rec.h * rec.w);
            System.out.println("Area of Rectangle : " + res);
        }

        public void getInfoRectangle(rectangle rec){
            areaRectangle(rec);
            parameterRectangle(rec);
            rec.printDimension();
        }
        // 5. THis Can be passed as an argument in the Constructor call
        public sum(rectangle rec){
            getInfoRectangle(rec);
        }

        // 6. Can be used to return the current class instance from the method 

        public sum returnYourself(){
            System.out.println(this);
            return this; 
        }
    }

    public static class rectangle {
        private int x = 0, y = 0, w = 0, h = 0;

        public rectangle() {
            this(1, 1);
        }

        public rectangle(int h, int w) {
            this(1, 1, h, w);
        }

        public rectangle(int x, int y, int w, int h) {
            this.h = h;
            this.w = w;
            this.y = y;
            this.x = x;

            // sum s = new sum();
            // System.out.println("Area of Rectangle" + s.areaRectangle(this));
            // System.out.println("parameter of Rectangle" + s.parameterRectangle(this));

            // s.getInfoRectangle(this);        // address as an argument
            // 4. THis Can be passed as an argument in the method call
            // printDimension();

            // 5. THis Can be passed as an argument in the Constructor call
            // sum s = new sum(this);
            
            // 6. Can be used to return the current class instance from the method 
            sum s = new sum(this);
            System.out.println(s);
            sum s2 = s.returnYourself();
            System.out.println(s2);

        }

        public void printDimension() {
            System.out.println("origin at : " + this.x + " , " + this.y);
            System.out.println("Dimension at : " + this.w + " , " + this.h);
        }
    }

    public static void main(String[] args) {
        rectangle rpt = new rectangle(2,3, 4, 5);
    }
}
