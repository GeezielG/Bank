package application;

import exceptions.BusinessExceptions;
import entities.Account;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

                Locale.setDefault(Locale.US);

                try {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter account data");
                System.out.print("Number: ");
                Integer number = sc.nextInt();
                System.out.print("Holder: ");
                sc.nextLine();
                String holder = sc.nextLine();
                System.out.print("Initial balance: ");
                double balance = sc.nextDouble();
                System.out.print("Withdraw limit: ");
                double withdrawLimit = sc.nextDouble();
                Account account = new Account(number, holder, balance, withdrawLimit);

                System.out.print("Enter amount for withdraw: ");
                Double amount = sc.nextDouble();
                System.out.print("Deposit a value: ");
                Double amountDeposit = sc.nextDouble();
                try {
                    account.deposit(amountDeposit);
                    account.withdraw(amount);
                    System.out.println(account.getBalance());
                }catch (BusinessExceptions e){
                    System.out.println(e.getMessage());
                    }
                }catch (InputMismatchException e) {
                    System.out.print("Error: type only numbers!");
                }
    }
}