package ru.mentee.power.conditions;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        int age;
        boolean hasLicense;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        age = scanner.nextInt();
        System.out.println("Do you have driver's license? yes/no");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            hasLicense = true;
        } else {
            hasLicense = false;
        }
        if (age >= 18 && hasLicense){
            System.out.println("You can rent a car!");
        }else{
            System.out.println("Sorry, you can't rent a car.");
        }
    }

}
