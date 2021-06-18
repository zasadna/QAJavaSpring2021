package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Employee employee1_1 = new Manager("Ivanov", new BigDecimal(5000), 99);
        employee1_1.setBonus(new BigDecimal(15));
        BigDecimal result1_1 = employee1_1.getBonus();

        Employee employee1_2 = new Manager("Ivanov", new BigDecimal(5000), 99);
        employee1_2.setBonus(new BigDecimal(15));
        BigDecimal result1_2 = employee1_2.toPay();

        Employee employee2_1 = new Manager("Petrov", new BigDecimal(6000), 100);
        employee2_1.setBonus(new BigDecimal(20));
        BigDecimal result2_1 = employee2_1.getBonus();
     //   System.out.println("result2_1 = "+result2_1);

        Employee employee2_2 = new Manager("Petrov", new BigDecimal(6000), 100);
        employee2_2.setBonus(new BigDecimal(20));
        BigDecimal result2_2 = employee2_2.toPay();
      //  System.out.println("result2_2 = "+result2_2);

        Employee employeeThird = new Manager("Sidorov", new BigDecimal(7000), 101);
        employeeThird.setBonus(new BigDecimal(25));
        BigDecimal result3 = employeeThird.getBonus();
      //  System.out.println("expected [525] but found [125] result3 = "+result3);

        Employee employee3_1 = new Manager("Sidorov", new BigDecimal(7000), 101);
        employee3_1.setBonus(new BigDecimal(25));
        BigDecimal result3_1 = employee3_1.toPay();
     //   System.out.println("expected [7525] but found [7125] result3_1 = "+result3_1);

        Employee employee4 = new Manager("Smirnov", new BigDecimal(8000), 149);
        employee4.setBonus(new BigDecimal(30));
        BigDecimal result4 = employee4.getBonus();
     //   System.out.println("result4 = "+result4);

        Employee employee5 = new Manager("Smirnov", new BigDecimal(8000), 149);
        employee5.setBonus(new BigDecimal(30));
        BigDecimal result5 = employee5.toPay();
      //  System.out.println("result5 = "+result5);

        Employee employee5_2 = new Manager("Popov", new BigDecimal(9000), 150);
        employee5_2.setBonus(new BigDecimal(35));
        BigDecimal result5_2 = employee5_2.getBonus();
       // System.out.println("expected [535] but found [1035] result5_2 = "+result5_2);

        Employee employee5_3 = new Manager("Popov", new BigDecimal(9000), 150);
        employee5_3.setBonus(new BigDecimal(35));
        BigDecimal result5_3 = employee5_3.toPay();
       // System.out.println("expected [9535] but found [10035] result5_3 = "+result5_3);

        Employee employee6_1 = new Manager("Sokolov", new BigDecimal(10000), 151);
        employee6_1.setBonus(new BigDecimal(40));
        BigDecimal result6_1 = employee6_1.getBonus();

        Employee employee6_2 = new Manager("Sokolov", new BigDecimal(10000), 151);
        employee6_2.setBonus(new BigDecimal(40));
        BigDecimal result6_2 = employee6_2.toPay();

        Employee employee7 = new Manager("Kravchuk", new BigDecimal(9500), 151);
     //   employee7.setBonus(null);
        BigDecimal result7 = employee7.getBonus();

        Employee employee8 = new Manager("Boiko", new BigDecimal(8500), 160);
      //  employee8.setBonus(new BigDecimal(-20));
        BigDecimal result8 = employee8.getBonus();

        Employee employee9 = new Manager("Chaika", new BigDecimal(7500), 140);
      //  employee9.setBonus(null);
      //  BigDecimal result9 = employee9.toPay();

        Employee employee10 = new Manager("Nosach", new BigDecimal(5500), 130);
     //   employee10.setBonus(new BigDecimal(-15));
     //   BigDecimal result10 = employee10.toPay();

        Employee employee11 = new SalesPerson("Ivanov", new BigDecimal(5000), 99);
        employee11.setBonus(new BigDecimal(25));
        BigDecimal result11 = employee11.getBonus();

        Employee employee11_1 = new SalesPerson("Ivanov", new BigDecimal(5000), 99);
        employee11_1.setBonus(new BigDecimal(25));
        BigDecimal result11_1 = employee11_1.toPay();

        Employee employee12_1 = new SalesPerson("Petrov", new BigDecimal(6000), 100);
        employee12_1.setBonus(new BigDecimal(30));
        BigDecimal result12_1 = employee12_1.getBonus();
      //  System.out.println("expected [30] but found [60] result12_1 = "+result12_1);

        Employee employee12_2 = new SalesPerson("Petrov", new BigDecimal(6000), 100);
        employee12_2.setBonus(new BigDecimal(30));
        BigDecimal result12_2 = employee12_2.toPay();
    //    System.out.println("[6030] but found [6060] result12_2 = "+result12_2);

        Employee employee13_1 = new SalesPerson("Sidorov", new BigDecimal(7000), 101);
        employee13_1.setBonus(new BigDecimal(35));
        BigDecimal resul13_1 = employee13_1.getBonus();

        Employee employee13_2 = new SalesPerson("Sidorov", new BigDecimal(7000), 101);
        employee13_2.setBonus(new BigDecimal(35));
        BigDecimal result13_2 = employee13_2.toPay();

        Employee employee14_1 = new SalesPerson("Smirnov", new BigDecimal(8000), 199);
        employee14_1.setBonus(new BigDecimal(40));
        BigDecimal result14_1 = employee14_1.getBonus();
       // System.out.println("result14_1 = "+result14_1);

        Employee employee14_2 = new SalesPerson("Smirnov", new BigDecimal(8000), 199);
        employee14_2.setBonus(new BigDecimal(40));
        BigDecimal result14_2 = employee14_2.toPay();
       // System.out.println("result14_2 = "+result14_2);

        Employee employee15_1 = new SalesPerson("Popov", new BigDecimal(9000), 200);
        employee15_1.setBonus(new BigDecimal(45));
        BigDecimal result15_1 = employee15_1.getBonus();
       // System.out.println("result15_1 = "+result15_1);

        Employee employee15_2 = new SalesPerson("Popov", new BigDecimal(9000), 200);
        employee15_2.setBonus(new BigDecimal(45));
        BigDecimal result15_2 = employee15_2.toPay();
       // System.out.println("result15_2 = "+result15_2);

        Employee employee16_1 = new SalesPerson("Sokolov", new BigDecimal(10000), 201);
        employee16_1.setBonus(new BigDecimal(50));
        BigDecimal result16_1 = employee16_1.getBonus();
      //  System.out.println("expected [150] but found [125000] result16_1 = "+result16_1);

        Employee employee16_2 = new SalesPerson("Sokolov", new BigDecimal(10000), 201);
        employee16_2.setBonus(new BigDecimal(50));
        BigDecimal result16_2 = employee16_2.toPay();
     //   System.out.println("expected [10150] but found [135000] result16_2 = "+result16_2);

        Employee employee17_1 = new SalesPerson("Kravchuk", new BigDecimal(9500), 151);
   //     employee17_1.setBonus(null);
    //    BigDecimal result17_1 = employee17_1.getBonus();

        Employee employee18_1 = new SalesPerson("Boiko", new BigDecimal(8500), 160);
      //  employee18_1.setBonus(new BigDecimal(-20));
      //  BigDecimal result18_1 = employee18_1.getBonus();

        Employee employee19_1 = new SalesPerson("Chaika", new BigDecimal(7500), 140);
     //   employee19_1.setBonus(null);
     //   BigDecimal result19 = employee19_1.toPay();

        Employee employee20 = new SalesPerson("Nosach", new BigDecimal(5500), 130);
      //  employee20.setBonus(new BigDecimal(-15));
       // BigDecimal result20 = employee20.toPay();
    }
}
