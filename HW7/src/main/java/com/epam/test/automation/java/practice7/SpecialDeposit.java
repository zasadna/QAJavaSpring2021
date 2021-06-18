package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit{

    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal percent = BigDecimal.valueOf(0.01);
        BigDecimal currentAmount = amount.add(amount.multiply(percent));
        BigDecimal income = currentAmount.subtract(amount);
        for (int i = 1; i < period; i++) {
            percent = percent.add(BigDecimal.valueOf(0.01));
            currentAmount = currentAmount.add(currentAmount.multiply(percent));
            income = currentAmount.subtract(amount);
        }
        return income.setScale(2, RoundingMode.HALF_EVEN);
    }
   }
