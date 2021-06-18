package com.epam.test.automation.java.practice8;

import java.math.BigDecimal;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        int actually = client.countPossibleToProlongDeposit();
        SpecialDeposit sDeposit1 = new SpecialDeposit(BigDecimal.valueOf(100),35);
        client.addDeposit(sDeposit1);
        System.out.println(sDeposit1.canToProlong());

        Iterator<Deposit> iterator = client.iterator();

        // testCanToProlongWhenAmountIs100AndPeriodIs35 true
        LongDeposit lDeposit1 = new LongDeposit(BigDecimal.valueOf(100),35);
        client.addDeposit(lDeposit1);

     //   testCanToProlongWhenAmountIs1001AndPeriodIs36 FAILED false
        LongDeposit lDeposit2 = new LongDeposit(BigDecimal.valueOf(0),0);
        client.addDeposit(lDeposit2);

    //    testCanToProlongWhenAmountIs100AndPeriodIs36 FAILED false
      //  LongDeposit lDeposit3 = null;
        client.addDeposit(null);

        BaseDeposit baseDeposit = new BaseDeposit(BigDecimal.valueOf(100),3);
        System.out.println(baseDeposit);

        LongDeposit lDeposit4 = new LongDeposit(BigDecimal.valueOf(0),0);
        client.addDeposit(lDeposit4);

        LongDeposit lDeposit5 = new LongDeposit(BigDecimal.valueOf(100),36);
        client.addDeposit(lDeposit5);

        client.sortDeposits();
        for (Deposit d: client) {
            System.out.println(d!=null?d.amount.add(d.income()):"null");
        }

    }
}
