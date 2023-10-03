// 5 Types Of constructors

//  Constructor dont have return type and it should match class name

// 1. Default Constructor   : It is present in all classes as default , it helps in initializing the object.
// 2. Parameterised Constructor
// 3. Static Constructor
// 4. Private Constructor
// 5. Copy Constructor



// public String getInfo() :  THis is default constructor , it will initialize all the data members with default values in that class.


import java.util.*;
import java.io.*;


public class default_param_constructor {
    public static class phone{
        String companyName;
        String model;
        String color;
        int ram;
        int storage;
        int batteryPower;

        public phone(String companyName , String model , String color , int ram , int storage , int batterPower){   // parameterized constructor
            // After calling this const , default const dont have any relevance , default is called when no other const is called. 
            this.companyName = companyName;           // This one is class variable and other one is from parameter
                                                      // Assign whatever value is coming from parameter to class variable.
            this.model = model;
            this.color = color;
            this.ram = ram;
            this.storage = storage;
            this.batteryPower = batterPower;
        }
                                                      
        public phone(){

        }

        public String getInfo(){
            StringBuilder sb = new StringBuilder();
            sb.append("Company Name = " + this.companyName + "\n");
            sb.append("Model Name = " + this.model + "\n");
            sb.append("color = " + this.color + "\n");
            sb.append("Ram = " + this.ram + "GB\n");
            sb.append("Storage = " + this.storage + "GB\n");
            sb.append("BatteryPower = " + this.batteryPower+ "MAH\n");
            // System.out.println(sb);

            return sb.toString();
        }

    }

    public static void test1(){
        phone p1 = new phone("One plus" , "9g" , "red" , 12,1000 , 4500); // Parameterized constructor
        phone p2 = new phone("One plus" , "7g" , "olive" , 8, 512 , 4500);

        // P1 on stack , reference from heap.
        
        phone p3 = new phone();    // Default constructor
        p3.companyName = "One Plus";
        p3.model = "5g";
        p3.color = "red";
        p3.ram = 8;
        p3.storage = 532;
        p3.batteryPower = 4500;


        String str = p1.getInfo();
        System.out.println(str);
        System.out.println("----------------------------");
        System.out.println(p2.getInfo());

        System.out.println("----------------------------");
        System.out.println(p3.getInfo());
    }

    public static void main(String[] args){
        test1();
    }

}
