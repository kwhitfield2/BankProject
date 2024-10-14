package com.Pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Home Screen
//        o The home screen should give the user the following options. The
//        application should continue to run until the user chooses to exit.
//. D) Add Deposit - prompt user for the deposit information and
//        save it to the csv file
//. P) Make Payment (Debit) - prompt user for the debit
//        information and save it to the csv file
//· L) Ledger - display the ledger screen
//· X) Exit - exit the application

        Scanner keyboard = new Scanner(System.in);
        public void actionsLogger() {
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/Transactions.csv", true );
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
//        LocalDateTime today = LocalDateTime.now();
//        DateTimeFormatter format =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//        String formattedDate = today.format(format);
//        bufWriter.write(formattedDate + " " + action);
            bufWriter.newLine();




            fileWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();



        while(true) {
            System.out.println("Home Screen(press x to exit)");
            String input = keyboard.nextLine().trim();

            if (input.equalsIgnoreCase("x")) {
            actionsLogger("exit");
            System.exit(0);

        } else {
                System.out.println("Make a deposit: ");
                String deposit = keyboard.nextLine();
            actionsLogger("Deposit - " + deposit );
            }


            }


//            System.out.println("Make a payment: ");

        }




    }
}
}










