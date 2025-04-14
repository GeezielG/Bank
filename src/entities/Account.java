package entities;

import exceptions.BusinessExceptions;

public class Account {
    Integer number;
    String holder;
    Double balance;
    Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit (Double amountDeposit){
        if (amountDeposit <= balance){
            System.out.println("Successful deposit");
            balance += amountDeposit;
        }
        else {
            System.out.println("You don't have enough balance");
        }
    }

    public void withdraw(Double amount){
        if (amount > balance){
            throw new BusinessExceptions("You don't have enough balance");
        }
        if (amount > withdrawLimit){
            throw new BusinessExceptions("You cannot withdraw above the allowed limit");
        }
        balance = balance - amount;
    }
}

