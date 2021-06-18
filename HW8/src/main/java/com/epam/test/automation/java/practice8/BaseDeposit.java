package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class BaseDeposit extends Deposit{
    private BigDecimal percent = BigDecimal.valueOf(0.05);

    public BaseDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal currentAmount = amount.add(amount.multiply(percent));
        BigDecimal amount = currentAmount.subtract(this.amount);
        for (int i = 1; i < period; i++) {
            currentAmount = currentAmount.add(currentAmount.multiply(percent));
            amount = currentAmount.subtract(this.amount);
        }
        return amount.setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public boolean canToProlong() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BaseDeposit that = (BaseDeposit) o;
        return Objects.equals(percent, that.percent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), percent);
    }
}
