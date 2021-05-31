package com.company;

import java.util.Scanner;

public class Menu {

    public Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        boolean isRunning = true;
        while (isRunning) {

            display("|--------------------------------------------------|");
            display("|-----------THEATER RESERVATION SYSTEM-------------|");
            display("|-----------THEATER RESERVATION SYSTEM-------------|");
            display("|--------------------------------------------------|");
            display("|--- 1.Sign[U]p---|");
            display("|----2.Sign[I]n---|");
            display("|----3.E[X]it-----|");

            display("Please Enter your choice in the Menu: ");
            char choice;

            choice = scanner.next().charAt(0);
            switch (choice) {
                case 'U':
                    // SignUp

                    break;
                case 'I':
                    //SignIn



                    break;
                case 'E':
                    //EXit
                    isRunning = false;
                    display("Thank you for using our application");
                    break;
                default:
                    System.out.println("INVALID CHOICE PLEASE RE-ENTER AGAIN");
            }
        }

    }

    public void display(String message){
        System.out.println(message);
    }

}
