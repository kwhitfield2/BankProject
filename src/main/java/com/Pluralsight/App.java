package com.Pluralsight;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean runs = true;

        while (true) {
            String option;
            option = keyboard.nextLine();
            String choice;
            choice = keyboard.nextLine();

            System.out.println("Home Screen\n");
            System.out.println("(D) Add Deposit");
            System.out.println("(P) Make Payment");
            System.out.println("(L) Display Ledger");
            System.out.println("(X) Exit Home Screen");
            System.out.println("Choose an option:");
            switch (option) {
                case "D":
                    addDeposit(keyboard);
                    break;
                case "P":
                    makePayment(keyboard);
                    break;
                case "L":
                    displayLedger();
                    break;
                case "X":
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR occurred try again..");
            }
        }
    }

//
    private static void addDeposit(Scanner keyboard) {
        System.out.println("Enter description: ");
        String description = keyboard.nextLine();
        System.out.println("Enter vendor: ");
        String vendor = keyboard.nextLine();
        System.out.println("Enter amount: ");
        double amount = Double.parseDouble(keyboard.nextLine());
    }

    private static void makePayment(Scanner keyboard) {
        System.out.println("Enter description: ");
        String description = keyboard.nextLine();
        System.out.println("Enter vendor: ");
        String vendor = keyboard.nextLine();
        System.out.println("Enter amount: ");
        double amount = Double.parseDouble(keyboard.nextLine());
    }

    private static void displayLedger() {

        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/Transactions.csv", true);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            bufWriter.newLine();


            fileWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();


        }

    private static void readTransactions()
//        LocalDateTime today = LocalDateTime.now();
//        DateTimeFormatter format =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//        String formattedDate = today.format(format);
//        bufWriter.write(formattedDate + " " + action);

    private static void saveTransactions()
    }
}



