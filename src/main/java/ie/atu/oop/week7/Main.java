package ie.atu.oop.week7;

import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Workshop name?");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.println("Capacity?");
        Scanner sc = new Scanner(System.in);

        while (!registrationAttempts){
            System.out.println("Enter your student ID");
            String message = sc.nextLine();
            try{
                int studentID = Integer.parseInt(message);
                System.out.println("Student ID: " + studentID);
            }
            catch (NumberFormatException e){
                System.out.println("Invalid student ID");
            }
        }

    }
}