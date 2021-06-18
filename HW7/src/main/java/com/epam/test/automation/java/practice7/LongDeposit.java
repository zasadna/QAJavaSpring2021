package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit{
    private BigDecimal percent = BigDecimal.valueOf(0.15);

    public LongDeposit(BigDecimal depositAmount, int depositPeriod){
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal currentAmount = amount;
        BigDecimal income = BigDecimal.ZERO;
        if(period>6){
            for (int i = 6; i < period; i++) {
                currentAmount = currentAmount.add(currentAmount.multiply(percent));
                income = currentAmount.subtract(amount);
            }
            return income.setScale(2, RoundingMode.HALF_EVEN);
        } return income;
    }
}
