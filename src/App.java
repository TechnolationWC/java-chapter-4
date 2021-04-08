import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Chapter2 {
    void milestone1(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } 
        else {
            System.out.println("The number is odd.");
        }
    }
    
    // Declare the Chapter 2 Milestone 2 method here
    void milestone2(double num2_2) {
        int numericInteger = (int) num2_2;
        int numericDecimal = (int) ((num2_2 - numericInteger) * 100);
        System.out.println(numericInteger);
        System.out.println(numericDecimal);
    }


    // Declare the Chapter 2 Milestone 3 method here
    void milestone3() {
        int i = 0;
        int num = 0;

        String  prime = ""; 

        for (i = 1; i <= 100; i++) { 		  	  
            int counter = 0; 	  
            for (num = i; num >= 1; num--) {
                if(i % num == 0) {
 		            counter += 1;
	            }
	        }
	        if (counter == 2) {
	            prime = prime + i + " "; 
            }	
        }	
        System.out.println("\nPrime numbers from 1 to 100 are:");
        System.out.println(prime);
    }


    // Declare the Chapter 2 Milestone 4 method here
    void milestone4(int seconds) {
        int days = seconds / 86400;
        seconds = seconds % (86400 * days);
        int hours = seconds / 3600;
        seconds = seconds % (3600 * hours);
        int minutes = seconds / 60;
        seconds = seconds % (60 * minutes); 

        if (days == 1) {
            System.out.print(days + " day, ");
        }
        else {
            System.out.print(days + " days, ");
        }
        if (hours == 1) {
            System.out.print(hours + " hour, ");
        }
        else {
            System.out.print(hours + " hours, ");
        }
        if (minutes == 1) {
            System.out.print(minutes + " minute, and ");
        }
        else {
            System.out.print(minutes + " minutes, and ");
        }
        if (seconds == 1) {
            System.out.print(seconds + " second.");
        }
        else {
            System.out.print(seconds + " seconds.");
        }
    }

}

public class App {
    static void chapter1milestone1(double num1, double num2) {
        System.out.print("Largest is: ");
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
    
    // Declare the Chapter 1 Milestone 2 method here

    static void chapter1milestone2(double num1_2a, double num1_2b) {
        double average = (num1_2a + num1_2b) / 2;
        System.out.println("The average is: " + String.format("%.2f", average));
    }

    // Declare the Chapter 1 Milestone 3 method here

    static void chapter1milestone3(double radius) {
        double circumference = 3 * 3.14 * radius;
        double area = 3.14 * radius * radius;
        System.out.println("Circumference: " + String.format("%.2f", circumference));
        System.out.println("Area: " + String.format("%.2f", area));
    }





    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** CHAPTER 1 MILESTONE 1 **");
        System.out.println("Please enter two numbers:");
        double num1_1a = scanner.nextDouble();
        double num1_1b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 1 method here
        chapter1milestone1(num1_1a, num1_1b);

        System.out.println("\n** CHAPTER 1 MILESTONE 2 **");
        System.out.println("Please enter two numbers:");
        double num1_2a = scanner.nextDouble();
        double num1_2b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 2 method here
        chapter1milestone2(num1_2a, num1_2b);

        System.out.println("\n** CHAPTER 1 MILESTONE 3 **");
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        // Call the Chapter 1 Milestone 3 method here
        chapter1milestone3(radius);




        System.out.println("\n** CHAPTER 2 MILESTONE 1 **");
        System.out.println("Enter a Number:");
        int num2_1 = scanner.nextInt();
        // Call the Chapter 2 Milestone 1 method here
        Chapter2 chapter2 = new Chapter2();
        chapter2.milestone1(num2_1);

        System.out.println("\n** CHAPTER 2 MILESTONE 2 **");
        System.out.println("Please input a decimal number:");
        double num2_2 = scanner.nextDouble();
        // Call the Chapter 2 Milestone 2 method here
        chapter2.milestone2(num2_2);

        System.out.println("\n** CHAPTER 2 MILESTONE 3 **");
        // Call the Chapter 2 Milestone 3 method here
        chapter2.milestone3();

        System.out.println("\n** CHAPTER 2 MILESTONE 4 **");
        System.out.println("Enter a number for seconds:");
        int seconds = scanner.nextInt();
        // Call the Chapter 2 Milestone 4 method here
        chapter2.milestone4(seconds);



        System.out.println("\n** CHAPTER 3 MILESTONE 1 **");
        System.out.println("Enter two numbers:");
        int num3_1a = scanner.nextInt();
        int num3_1b = scanner.nextInt();
        // Call the Chapter 3 Milestone 1 method here

        System.out.println("\n** CHAPTER 3 MILESTONE 2 **");
        System.out.println("Enter a number:");
        int num3_2 = scanner.nextInt();
        // Call the Chapter 3 Milestone 2 method here

        System.out.println("\n** CHAPTER 3 MILESTONE 3 **");
        int min = 1;
        int max = 12;
        int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randNum1);
        System.out.println(randNum2);
        System.out.println("What is the product of these two numbers?");
        int num3_3 = scanner.nextInt();


        // Call the Chapter 3 Milestone 2 method here
        Chapter3 chapter3 = new Chapter3();
        chapter3.milestone2(randNum1, randNum2, num3_3);

        System.out.println("\n** CHAPTER 3 MILESTONE 4 **");
        // Call the Chapter 3 Milestone 4 method here

        scanner.close();
    }
}
