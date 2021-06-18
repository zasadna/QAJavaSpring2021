package com.epam.test.automation.java.practice8;
import java.math.BigDecimal;
import java.util.*;

public class Client implements Iterator<Deposit>, Iterable<Deposit> {
    private Integer mPosition;
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
    public boolean hasNext() {
        return mPosition < deposits.length;
    }

    @Override
    public Deposit next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return  deposits[mPosition];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Client{" +
                "deposits=" + Arrays.toString(deposits) +
                '}';
    }

    public Iterator<Deposit> iterator() {
        return Arrays.asList(deposits).iterator();
    }

    public void sortDeposits() {
        if(deposits != null && deposits.length >0){
            Arrays.sort(deposits, (o1, o2) -> {
                    if (o1 == null && o2 == null) {
                        return 0;
                    }
                    if (o1 == null) {
                        return 1;
                    }
                    if (o2 == null) {
                        return -1;
                    }
                    return o1.compareTo(o2);
                });
        }
    }

    public int countPossibleToProlongDeposit() {
        int count = 0;
        for (Deposit item: deposits) {
            if (item != null && deposits.length > 0 && item.canToProlong()) {
                count++;
            }
        }
        return count;
    }
}
