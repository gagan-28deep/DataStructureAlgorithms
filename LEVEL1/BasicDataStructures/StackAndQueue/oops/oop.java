import java.util.*;
import java.io.*;

public class oop{
    public static class Person{
        int age ; 
        String name;

        void sayHi(){
            System.out.println(name + "---" + age + "---");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 23;
        p1.name = "Gagu";
        // p1.sayHi();

    //     Person p2 = p1;
    //     p2.age = 45;
    //     p2.sayHi();
    //     p1.sayHi();
        
        Person p2 = new Person();
        p2.age = 45;
        p2.name = "Nkunku";
        p1.sayHi();
        p2.sayHi();

        // swap1(p1, p2);   // Not swapped

        // swap2(p1, p2);   // Swapped

        // swap3(p1, p2);
        // Gagu---23---
        // Nkunku---45---
        // Gagu---23---
        // Nkunku---0---
        
        
        p1.sayHi();
        p2.sayHi();

    }

    // This function wont swap : It only swaps inside Function , but no changes reflected in main function.
    // public static void swap1(Person psn1 , Person psn2){
    //     Person temp = psn1;
    //     psn1 = psn2;
    //     psn2 = temp;
    // }


    // public static void swap2(Person psn1 , Person psn2){
    //     int age = psn1.age;
    //     psn1.age = psn2.age;
    //     psn2.age = age;
        
        
    //     String name = psn1.name;
    //     psn1.name = psn2.name;
    //     psn2.name = name;


    // }

    public static void swap3(Person psn1 , Person psn2){
        psn1 = new Person();
        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;
        
        psn2 = new Person();

        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;


    }
}