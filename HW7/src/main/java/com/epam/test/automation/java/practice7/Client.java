package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.util.Arrays;

public class Client {

    private Deposit[] deposits;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public Deposit[] getDeposits() {
        return deposits;
    }

    public void setDeposits(Deposit[] deposits) {
        this.deposits = deposits;
    }

    public boolean addDeposit(Deposit deposit) {
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] == null) {
                deposits[i] = deposit;
                return true;
            }
        }
        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal totalIncome = BigDecimal.ZERO;
        for (Deposit item : deposits) {
            if (item != null) {
                totalIncome = totalIncome.add(item.income());
            }
        }
        return totalIncome;
    }

    public BigDecimal maxIncome() {
        BigDecimal maxIncome = BigDecimal.ZERO;
        for (Deposit item : deposits) {
            if (item != null && item.income().compareTo(maxIncome) > 0) {
                maxIncome = item.income();
            }
        }
        return maxIncome;
    }

    public BigDecimal getIncomeByNumber(int number) {
        BigDecimal income = BigDecimal.ZERO;
        if (number > 0 && deposits.length > number && deposits[number] != null) {
            return deposits[number].income();
        }
        return income;
    }

    @Override
    public String toString() {
        return "Client{" +
                "deposits=" + Arrays.toString(deposits) +
                '}';
    }
}
