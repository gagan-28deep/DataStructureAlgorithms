import java.util.*;
import java.io.*;

public class classIntro{
    public static class phone{
        String companyName;
        String model;
        String color;
        int ram;
        int storage;
        int batteryPower;

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
        phone p1 = new phone();    // Default constructor
        p1.companyName = "One Plus";
        p1.model = "5g";
        p1.color = "red";
        p1.ram = 8;
        p1.storage = 512;
        p1.batteryPower = 4500;

        phone p2 = new phone();
        p2.companyName = "One Plus";
        p2.model = "7g";
        p2.color = "yellow";
        p2.ram = 12;
        p2.storage = 1024;
        p2.batteryPower = 4500;
        // System.out.println(p1.companyName);
        String str = p1.getInfo();
        System.out.println(str);
        System.out.println("----------------------------");
        System.out.println(p2.getInfo());
        
    } 

    public static void main(String[] args){
        test1();
    }
}