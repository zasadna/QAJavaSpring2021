package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Manager extends Employee {
    private int clientAmount;

    public Manager(String lastName, BigDecimal salary, int clientAmount) {
        super(lastName, salary);
        this.clientAmount = clientAmount;
    }

    public int getClientAmount() {
        return clientAmount;
    }

    public void setClientAmount(int clientAmount) {
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus != null &&
                bonus.intValue() > 0) {
            if (this.clientAmount > 150) {
                this.bonus = bonus.add(BigDecimal.valueOf(1000));
            } else if (this.clientAmount > 100) {
                this.bonus = bonus.add(BigDecimal.valueOf(500));
            } else this.bonus = bonus;
        } else throw new IllegalArgumentException();
    }
}
