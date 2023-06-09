package HWClass28;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        checkAge();
    }

    static void checkAge() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter your age:");
            int age =scanner.nextInt();

            if (age < 25) {
                throw new RuntimeException("Exception: Age must be at least 25 years old.");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: "+e.getMessage());
        }
    }
}

/*
Create a method to check age eligibility that will throw a runtime exception. Method should throw
an exception age is less than 16.
 */