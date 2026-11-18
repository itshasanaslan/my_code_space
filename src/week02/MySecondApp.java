package week02;

public class MySecondApp {

    public static void main(String[] args) {

        // sayHello(); // method call

        int tenAClass = 14;
        int tenBClass = 20;
        int peStudents = tenAClass + tenBClass;

        peStudents = peStudents - 1;
        peStudents -= 1; // 33 - 1 = 32

        // add 5 students
        peStudents += 5;

        // compound assignment operators
        // += -= /= */ -> myNumber = myNumber + 5; are the same with myNumber += 5;
        // if you subtract or add by only 1 value,
        tenAClass++; // added 1. incremantation
        tenAClass--; // subtracted 1. decrementation

        int itClassForTenA = tenAClass;

        int x = 11;
        int y = 4;
        double d = (double) (x / y);
        int r = (int) (d + 0.5);
        
        
        System.out.println(d + " " + r);
        


        // an int takes 4 bytes. 1 byte = 8 bits. An int takes 32 bits
        // 31 
        // 2^^31 -1 max
        // -2^^31 min
        // if you add one to the max, it causes INTEGER OVERFLOW
        int maxValue = Integer.MAX_VALUE;
        int maxValueee = 2147483647 + 1;
        System.out.println(maxValueee);
        System.out.println("Program finished");







    }

    public static void sayHello() {
        System.out.println("Helloooooo!");
        System.out.println("Helloooooo!");
        System.out.println("Helloooooo!");
        System.out.println("Helloooooo!");
        System.out.println("Helloooooo!");
        System.out.println("Helloooooo!");
        System.out.println("Helloooooo!");
        System.out.println("Helloooooo!");
    }

    public static void myBackUpCode() {
        System.out.println("helloo from 2nd week");

        // Primitives
        // int double boolean
        // declaring a variable = assignment, initializing
        int numberOfStudents = 4;
        double totalScores = 387.9999;
        // values after the decimal are truncated. double truncation
        // casting
        int totalScoreInt = (int) totalScores;

        // casting
        double average = (totalScores / numberOfStudents);
        // rounding
        int closestAverage = (int) (average + 0.5);
        System.out.println("Average of this class is " + closestAverage);
        System.out.println("totalscoreInt is " + totalScoreInt);
        int fifteen = 15; // 15
        int two = 2;
        int eleven = 11;
        double result = (double) (fifteen / two + eleven);
        System.out.println((double) fifteen / two);
        System.out.println(result);

        double val = (int) 4.8 + (int) 5.7; // 9.0
        double val2 = (int) (4.8 + 5.7); // 10

        // (int)(2.8 + 0.5) 3

        // rounding

    }

}
