package com.epam.test.automation.java.practice8;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class LongDepositTest {
    LongDeposit longDeposit = new LongDeposit(BigDecimal.valueOf(1001), 39);

    @Test
    public void testСanToProlong() {
        Assert.assertEquals(false, longDeposit.canToProlong());
    }

    @Test
    public void testIncome() {
        Assert.assertEquals(BigDecimal.valueOf(99799.53), longDeposit.income());
    }
}
