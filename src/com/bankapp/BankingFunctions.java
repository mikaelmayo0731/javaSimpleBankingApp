package com.bankapp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankingFunctions {
    Scanner input = new Scanner(System.in);
    private double total = 0.00;

    public String getAccountNumber() {
        String convertedNum;
        while (true) {
            try {
                System.out.print("Enter your 16 digit account number: ");
                long accountNumber = input.nextLong();
                convertedNum = Long.toString(accountNumber);
                if (convertedNum.length() == 16) {
                    break;
                } else {
                    System.out.println("------------------------------------");
                    System.out.println("INVALID ACCOUNT NUMBER");
                    System.out.println("------------------------------------");
                }
            } catch (Exception e) {
                System.out.println("------------------------------------");
                System.out.println("INVALID ACCOUNT NUMBER");
                System.out.println("------------------------------------");
                input.nextLine();
            }
        }
        return convertedNum;
    }

    public void showMenu(String convertedNum) {
        System.out.println("------------------------------------");
        System.out.println("ACCOUNT NUMBER: ****-****-****-" + convertedNum.substring(12));
        System.out.println("------------------------------------");
        System.out.println("A) Make Deposit");
        System.out.println("B) Make Withdrawal");
        System.out.println("C) Check Balance  ");
        System.out.println("D) Exit");
    }

    public void makeDeposit() throws InterruptedException {
        while (true) {
            try {
                System.out.print("Enter amount you would like to deposit: ");
                double depositAmount = input.nextDouble();
                total += depositAmount;
                break;
            } catch (Exception e) {
                System.out.println("------------------------------------");
                System.out.println("INVALID AMOUNT");
                System.out.println("------------------------------------");
                input.nextLine();
            }
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("------------------------------------");
        System.out.println("DEPOSIT SUCCESSFUL");
        TimeUnit.SECONDS.sleep(1);
    }

    public void makeWithdrawal() throws InterruptedException {
        while (true) {
            try {
                System.out.print("Enter amount you would like to withdraw: ");
                double depositAmount = input.nextDouble();
                total -= depositAmount;
                break;
            } catch (Exception e) {
                System.out.println("------------------------------------");
                System.out.println("INVALID AMOUNT");
                System.out.println("------------------------------------");
                input.nextLine();
            }
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("------------------------------------");
        System.out.println("WITHDRAWAL SUCCESSFUL");
        TimeUnit.SECONDS.sleep(1);
    }

    public void checkBalance() {
        System.out.println("------------------------------------");
        System.out.print("CURRENT BALANCE: $");
        System.out.printf("%.2f", total);
        System.out.println();

    }


}
