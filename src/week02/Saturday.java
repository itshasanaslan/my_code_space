package week02;

import java.util.Scanner;

public class Saturday {

    // main is a method
    public static void main(String[] args) {

        // ClassName variable = new ClassName();
        // instance of a class
        Scanner reader = new Scanner(System.in); // create an instance of the Scanner class
        System.out.print("Number: ");
        int n  = reader.nextInt();
        // if you read a primitive using scanner \n is leftover in the buffer
        // consume the buffer by calling nextLine 
        reader.nextLine();

        System.out.print("Name: ");
        String name = reader.nextLine();


        System.out.println("name is " + name + " and the age is " + n);



    }

    // public static type methodName() {}

    // method header, method signature
    public static void welcomeUser(String name) {

        System.out.println("Hello " + name + ". Welcome to our course!");
        System.out.println("Are you happy with our course?");
        System.out.println("Do you have any questions?");
    }

    // primitives are passed by VALUE. A copy of the value.
    public static void multiplyByFive(int x) {
        x *= 5;
        System.out.println(x);
    }

    public static int getMultipliedByFive(int x) {
        x *= 5;
        return x;
    }

}
