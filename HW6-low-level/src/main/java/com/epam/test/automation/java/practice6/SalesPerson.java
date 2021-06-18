package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {

    private int percentOfSalesTargetsPlan;

    public SalesPerson(String lastName, BigDecimal salary, int percentOfSalesTargetsPlan) {
        super(lastName, salary);
        this.percentOfSalesTargetsPlan = percentOfSalesTargetsPlan;
    }

    public void setPercentOfSalesTargetsPlan(int percentOfSalesTargetsPlan) {
        this.percentOfSalesTargetsPlan = percentOfSalesTargetsPlan;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus != null &&
                bonus.intValue() > 0) {
            if (this.percentOfSalesTargetsPlan > 200) {
                this.bonus = bonus.multiply(BigDecimal.valueOf(3));
            } else if (this.percentOfSalesTargetsPlan > 100) {
                this.bonus = bonus.multiply(BigDecimal.valueOf(2));
            } else this.bonus = bonus;
        } else throw new IllegalArgumentException();
    }
}
