package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
}
