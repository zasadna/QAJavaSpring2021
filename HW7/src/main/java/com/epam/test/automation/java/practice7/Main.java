package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*int actually = new SpecialDeposit(BigDecimal.ONE, 15).period;
        System.out.println(actually);*/
     //   System.out.println(new BaseDeposit(BigDecimal.valueOf(1000), 2).income().toString());
      //System.out.println(new SpecialDeposit(BigDecimal.valueOf(3000), 6).income());
     //   System.out.println(new LongDeposit(BigDecimal.valueOf(1000), 2).income().toString());
     //   System.out.println(new LongDeposit(BigDecimal.valueOf(3000), 8).income().toString());
        Client client = new Client();
       /* cl.addDeposit(new BaseDeposit(BigDecimal.valueOf(1000), 2));
        cl.addDeposit(new SpecialDeposit(BigDecimal.valueOf(3000), 6));
        cl.addDeposit(new LongDeposit(BigDecimal.valueOf(1000), 2));
        cl.addDeposit(new LongDeposit(BigDecimal.valueOf(3000), 8));
        cl.addDeposit(new LongDeposit(new BigDecimal(1000), 12));
        cl.addDeposit(new LongDeposit(new BigDecimal(140060), 7));
    //    System.out.println(cl.getIncomeByNumber(0));
        System.out.println(cl.getIncomeByNumber(1));
        System.out.println(cl.getIncomeByNumber(2));
        System.out.println(cl.getIncomeByNumber(3));
        System.out.println(cl.getIncomeByNumber(4));
        System.out.println(cl.getIncomeByNumber(5));
        System.out.println(cl.getIncomeByNumber(6));
        System.out.println(cl.getIncomeByNumber(7));
        System.out.println(cl.getIncomeByNumber(8));
        System.out.println(cl.getIncomeByNumber(9));
        System.out.println(cl.getIncomeByNumber(10));*/
     //   System.out.println();
      //  String actually = cl.getIncomeByNumber(2).toString();
      /*  BigDecimal actually2 = new SpecialDeposit(BigDecimal.valueOf(1000), 2).income();
        BigDecimal actually3 = new LongDeposit(BigDecimal.valueOf(1000), 12).income();*/
        //   boolean actually = SpecialDeposit.class.getSuperclass() == Deposit.class;


      /*

        BigDecimal actually = new SpecialDeposit(BigDecimal.valueOf(3000), 6).income();
        BigDecimal actually = new SpecialDeposit(expected, 15).amount;
        int actually = new SpecialDeposit(BigDecimal.ONE, 15).period;
        boolean actually = BaseDeposit.class.getSuperclass() == Deposit.class;
        String actually = new BaseDeposit(BigDecimal.valueOf(1000), 3).income().toString();*/
      //  BigDecimal actually = new BaseDeposit(expected, 15).amount;

    //    int actually = new BaseDeposit(BigDecimal.ONE, 15).period;
        BaseDeposit d1 = new BaseDeposit(BigDecimal.ONE, 1);
     //   boolean actually2 = client.addDeposit(d1);
 //       System.out.println("income1 (1,1) ="+ d1.income());

        Deposit d2 = new BaseDeposit(BigDecimal.ONE, 1);
        boolean actually3 = client.addDeposit(d2);
 //       System.out.println("income2 (1,1) ="+d2.income());

        Deposit d3specialDeposit = new SpecialDeposit(BigDecimal.valueOf(4000), 4);
        client.addDeposit(d3specialDeposit);
      //  System.out.println("income3 (4000,4) ="+d3specialDeposit.income());
     //   System.out.println();
        Deposit d4longDeposit = new LongDeposit(BigDecimal.valueOf(3040), 15);
        client.addDeposit(d4longDeposit);
  //      System.out.println("income4 (3040,15) ="+d4longDeposit.income());

        String actually4 = client.totalIncome().toString();
        Deposit d5baseDeposit = new BaseDeposit(BigDecimal.valueOf(1000), 10);
        client.addDeposit(d5baseDeposit);
  //      System.out.println("income5 (1000,10) ="+d5baseDeposit.income());

        Deposit d6specialDeposit1 = new SpecialDeposit(BigDecimal.valueOf(4000), 4);
        client.addDeposit(d6specialDeposit1);
    //    System.out.println("income6 (4000,4) ="+d6specialDeposit1.income());
     //   System.out.println();
        Deposit d7longDeposit1 = new LongDeposit(BigDecimal.valueOf(3040), 15);
        client.addDeposit(d7longDeposit1);
      //  System.out.println("income7 (3040,15) ="+d7longDeposit1.income());





        String actually5 = client.maxIncome().toString();
        Deposit baseDeposit2 = new BaseDeposit(BigDecimal.valueOf(1000), 10);
        Deposit specialDeposit2 = new SpecialDeposit(BigDecimal.valueOf(4000), 4);
        Deposit longDeposit2 = new LongDeposit(BigDecimal.valueOf(3040), 15);
        String actually6 = client.getIncomeByNumber(2).toString();
        Deposit baseDeposit3 = new BaseDeposit(BigDecimal.valueOf(1000), 10);
        Deposit specialDeposit4 = new SpecialDeposit(BigDecimal.valueOf(4000), 4);
        Deposit longDeposit4 = new LongDeposit(BigDecimal.valueOf(3040), 15);
        String actually7 = client.getIncomeByNumber(5).toString();
        boolean actually8 = LongDeposit.class.getSuperclass() == Deposit.class;
       // String actually9 = new LongDeposit();
        //BigDecimal actually10 = new LongDeposit(expected, 15).amount;
        int actually11 = new LongDeposit(BigDecimal.ONE, 15).period;
       System.out.println(client);
       System.out.println();
    //   System.out.println(client.maxIncome());
       System.out.println(client.getIncomeByNumber(1));
        System.out.println(client.getIncomeByNumber(2));
      System.out.println(client.getIncomeByNumber(3));
        System.out.println(client.getIncomeByNumber(4));
       System.out.println(client.getIncomeByNumber(5));
        System.out.println(client.getIncomeByNumber(6));
       System.out.println(client.getIncomeByNumber(7));

        System.out.println();
        System.out.println(client.getIncomeByNumber(2));
    }
}
