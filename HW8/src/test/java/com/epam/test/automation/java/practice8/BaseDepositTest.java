package com.epam.test.automation.java.practice8;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.math.BigDecimal;

public class BaseDepositTest {
    BaseDeposit baseDeposit = new BaseDeposit(BigDecimal.valueOf(100), 35);

    @Test
    public void testIncome() {
        Assert.assertEquals(BigDecimal.valueOf(451.60), baseDeposit.income());
    }

    @Test
    public void testCanToProlong(){
        Assert.assertEquals(false, baseDeposit.canToProlong());
    }
}
