package com.bankapp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        BankingFunctions bank = new BankingFunctions();

        boolean using = true;
        String convertedNum = bank.getAccountNumber();

        while (using) {
            bank.showMenu(convertedNum);
            System.out.print("Enter option: ");
            String menuOption = input.nextLine();
            switch (menuOption.toUpperCase()) {
                case "A":
                    bank.makeDeposit();
                    continue;
                case "B":
                    bank.makeWithdrawal();
                    continue;
                case "C":
                    TimeUnit.SECONDS.sleep(1);
                    bank.checkBalance();
                    TimeUnit.SECONDS.sleep(1);
                    continue;
                case "D":
                    using = false;
                    System.out.println("------------------------------------");
                    System.out.println("THANK YOU");
                    TimeUnit.SECONDS.sleep(1);
                    break;
                default:
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("------------------------------------");
                    System.out.println("INVALID INPUT");
                    TimeUnit.SECONDS.sleep(1);
            }
        }





    }
}
