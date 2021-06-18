package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class SpecialDeposit extends Deposit{
    private BigDecimal depositAmount;

    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
        this.depositAmount = depositAmount;
    }

    @Override
    public BigDecimal income() {
        BigDecimal percent = BigDecimal.valueOf(0.01);
        BigDecimal currentAmount = depositAmount.add(depositAmount.multiply(percent));
        BigDecimal income = currentAmount.subtract(depositAmount);
        for (int i = 1; i < period; i++) {
            percent = percent.add(BigDecimal.valueOf(0.01));
            currentAmount = currentAmount.add(currentAmount.multiply(percent));
            income = currentAmount.subtract(depositAmount);
        }
        return income.setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public boolean canToProlong() {
        return depositAmount.intValue() > 1000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialDeposit that = (SpecialDeposit) o;
        return Objects.equals(depositAmount, that.depositAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), depositAmount);
    }
}