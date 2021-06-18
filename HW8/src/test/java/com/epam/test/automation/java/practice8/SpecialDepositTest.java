package com.epam.test.automation.java.practice8;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class SpecialDepositTest {
    SpecialDeposit specialDeposit = new SpecialDeposit(BigDecimal.valueOf(50), 14);

    @Test
    public void testIncome() {
        Assert.assertEquals(BigDecimal.valueOf(86.27), specialDeposit.income());

    }
}
