package com.Pluralsight;


import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
//        Home Screen
//        o The home screen should give the user the following options. The
//        application should continue to run until the user chooses to exit.
        Scanner keyboard = new Scanner(System.in);


        while (true) {

            System.out.println("Home Screen\n");
            System.out.println("(D) Add Deposit");
            System.out.println("(P) Make Payment");
            System.out.println("(L) Display Ledger");
            System.out.println("(X) Exit Home Screen");
            System.out.println("Choose an option:");
            String option;
            option = keyboard.nextLine();




            switch (option) {
                case "D":
                    try {
                        FileWriter fileWriter = new FileWriter("src/main/resources/Transactions.csv", true);
                        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

                        System.out.print("Make A Deposit: ");
                        String deposit = keyboard.nextLine();

                        bufWriter.write(deposit);
                        bufWriter.newLine();
                        bufWriter.close();
                    } catch (IOException e) {
                        System.out.println("ERROR: An unexpected error occurred");
                        e.getStackTrace();
                    }
                    break;


                case "P":
                    try {
                        FileWriter fileWriter = new FileWriter("src/main/resources/Transactions.csv", true);

                        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

                        System.out.println("Make A Payment(Debit): ");
                        String payment = keyboard.nextLine();

                        bufWriter.write(payment);
                        bufWriter.newLine();
                        bufWriter.close();
                    } catch (IOException e) {
                        System.out.println("ERROR: An unexpected error occurred");
                        e.getStackTrace();
                    }
                    break;

                case "L":

                        case "A":  //Display All entries
                            try {
                                FileReader fileReader = new FileReader("src/main/resources/Transactions.csv");
                                BufferedReader bufReader = new BufferedReader(fileReader);

                                String fileEntries;

                                while ((fileEntries = bufReader.readLine()) != null) {
                                    System.out.println(fileEntries);
                                }
                                bufReader.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "B":
                            System.out.println("Deposits");


                        case "C":
                            System.out.println("Payments");


                        case "E":
                            System.out.println("Reports");


//                        EXIT THE APPLICATION
                        case "X":
                            System.out.println("EXIT the application");


            }
        }
    }
}

