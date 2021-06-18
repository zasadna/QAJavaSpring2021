package com.epam.test.automation.java.practice8;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class DepositTest {
    Deposit deposit = new Deposit(BigDecimal.valueOf(1300), 35) {
        @Override
        public boolean canToProlong() {
            return false;
        }

        @Override
        public BigDecimal income() {
            return null;
        }
    };

    @Test
    public void testIncome() {
        Assert.assertEquals(null, deposit.income());

    }
}
