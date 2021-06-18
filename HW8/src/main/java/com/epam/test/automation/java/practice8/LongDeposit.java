package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class LongDeposit extends Deposit{
    private BigDecimal percent = BigDecimal.valueOf(0.15);
    private int depositPeriod;

    public LongDeposit(BigDecimal depositAmount, int depositPeriod){
        super(depositAmount, depositPeriod);
        this.depositPeriod = depositPeriod;
    }

    @Override
    public BigDecimal income() {
        BigDecimal currentAmount = amount;
        BigDecimal income = BigDecimal.ZERO;
        if(depositPeriod >6){
            for (int i = 6; i < depositPeriod; i++) {
                currentAmount = currentAmount.add(currentAmount.multiply(percent));
                income = currentAmount.subtract(amount);
            }
            return income.setScale(2, RoundingMode.HALF_EVEN);
        } return income;
    }

    @Override
    public boolean canToProlong() {
        return (depositPeriod < (3*12));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LongDeposit that = (LongDeposit) o;
        return depositPeriod == that.depositPeriod && Objects.equals(percent, that.percent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), percent, depositPeriod);
    }
}