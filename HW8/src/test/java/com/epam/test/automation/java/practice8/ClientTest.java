package com.epam.test.automation.java.practice8;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.math.BigDecimal;
public class ClientTest {
    Client client = new Client();

    @Test
    public void testCountPossibleToProlongDeposit() {
        Assert.assertEquals(0, client.countPossibleToProlongDeposit());
    }

    @Test
    public void testAddDeposit() {
        Assert.assertEquals(true, client.addDeposit(new BaseDeposit(BigDecimal.valueOf(23),4)));
    }

    @Test
    public void testMaxIncome() {
        Assert.assertEquals(BigDecimal.ZERO, client.maxIncome());
    }
}

