import java.util.*;
import java.io.*;


//  This keyword uses : 

// 1. Can be used to refer current class instance variable.
// 2. Can be used to invoke current class method(implicitly)
// 3. this() can be used to invoke current class constructor
// 4. Can be passed as an argument in the method call
// 5. Can be passed as an argument in the constructor call
// 6. Can be used to return the current class instance from the method 



// 1. Can be used to refer current class instance variable.
public class this_referCC1 {
    public static class phone{
        String companyName = null;
        String model = null;
        int ram = 0;

        public phone(String compName , String model , int ram){
            this.companyName = compName;
            this.model = model;
            this.ram = ram;
            System.out.println("Whithin Class " + this);
        }

        public void display(){
            String str = "Brand : " + companyName + "\n" +  "Model : " +  model + "\n" + "Ram : " + ram; 
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        phone p1 = new phone("HTC", "Get", 12);    
        phone p2 = new phone("HTC", "push", 8);    
        p1.display();     // Address.display
        System.out.println(p1);
        p2.display();
    }
}
