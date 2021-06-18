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

        Employee employee2_2 = new Manager("Petrov", new BigDecimal(6000), 100);
        employee2_2.setBonus(new BigDecimal(20));
        BigDecimal result2_2 = employee2_2.toPay();

        Employee employee3_1 = new Manager("Sidorov", new BigDecimal(7000), 101);
        employee3_1.setBonus(new BigDecimal(25));
        BigDecimal result3_1 = employee3_1.getBonus();

        Employee employee3_2 = new Manager("Sidorov", new BigDecimal(7000), 101);
        employee3_2.setBonus(new BigDecimal(25));
        BigDecimal result3_2 = employee3_2.toPay();

        Employee employee4_1 = new Manager("Smirnov", new BigDecimal(8000), 149);
        employee4_1.setBonus(new BigDecimal(30));
        BigDecimal result4_1 = employee4_1.getBonus();

        Employee employee4_2 = new Manager("Smirnov", new BigDecimal(8000), 149);
        employee4_2.setBonus(new BigDecimal(30));
        BigDecimal result4_2 = employee4_2.toPay();

        Employee employee5_1 = new Manager("Popov", new BigDecimal(9000), 150);
        employee5_1.setBonus(new BigDecimal(35));
        BigDecimal result5_1 = employee5_1.getBonus();

        Employee employee5_2 = new Manager("Popov", new BigDecimal(9000), 150);
        employee5_2.setBonus(new BigDecimal(35));
        BigDecimal result5_2 = employee5_2.toPay();

        Employee employee6_1 = new Manager("Sokolov", new BigDecimal(10000), 151);
        employee6_1.setBonus(new BigDecimal(40));
        BigDecimal result6_1 = employee6_1.getBonus();

        Employee employee6_2 = new Manager("Sokolov", new BigDecimal(10000), 151);
        employee6_2.setBonus(new BigDecimal(40));
        BigDecimal result6_2 = employee6_2.toPay();

        Employee employee7_1 = new Manager("Kravchuk", new BigDecimal(9500), 151);
    //    employee7_1.setBonus(null);
        BigDecimal result7_1 = employee7_1.getBonus();

        Employee employee8_1 = new Manager("Boiko", new BigDecimal(8500), 160);
    //    employee8_1.setBonus(new BigDecimal(-20));
        BigDecimal result8_1 = employee8_1.getBonus();

        Employee employee9_1 = new Manager("Chaika", new BigDecimal(7500), 140);
     //   employee9_1.setBonus(null);
     //   BigDecimal result9_1 = employee9_1.toPay();

        Employee employee10_1 = new Manager("Nosach", new BigDecimal(5500), 130);
    //    employee10_1.setBonus(new BigDecimal(-15));
    //    BigDecimal result10_1 = employee10_1.toPay();

        Employee [] staff = new Employee[12];
        staff[0] = new SalesPerson("Kozlov", new BigDecimal(15000), 200);
        staff[1] = new Manager("Petrov", new BigDecimal(6000), 100);
        staff[2] = new Manager("Sidorov", new BigDecimal(7000), 101);
        staff[3] = new Manager("Smirnov", new BigDecimal(8000), 149);
        staff[4] = new Manager("Popov", new BigDecimal(9000), 150);
        staff[5] = new Manager("Sokolov", new BigDecimal(10000), 151);
        staff[6] = new SalesPerson("Novikov", new BigDecimal(11000), 99);
        staff[7] = new SalesPerson("Volkov", new BigDecimal(12000), 100);
        staff[8] = new SalesPerson("Pavlov", new BigDecimal(13000), 101);
        staff[9] = new SalesPerson("Stepanov", new BigDecimal(14000), 199);
        staff[10] = new SalesPerson("Makarov", new BigDecimal(16000), 201);
        staff[11] = new Manager("Ivanov", new BigDecimal(5000), 99);

        Company company = new Company(staff) ;
        company.giveEverybodyBonus(new BigDecimal(10));
        BigDecimal resultC1 = result.add(employee5_1.getBonus());

      //  company.giveEverybodyBonus(null);
     //   BigDecimal resultC2 = result.add(employee.getBonus());

    //    company.giveEverybodyBonus(new BigDecimal(-10));
     //   BigDecimal resultC3 = result.add(employee.getBonus());

     //   company.giveEverybodyBonus(new BigDecimal(5));
    //    BigDecimal result = company.totalToPay();
    //    company.giveEverybodyBonus(new BigDecimal(20));

        Employee employee1_3 = new SalesPerson("Ivanov", new BigDecimal(5000), 99);
        employee1_3.setBonus(new BigDecimal(25));
        BigDecimal result1_3 = employee1_3.getBonus();
        Employee employee1_4 = new SalesPerson("Ivanov", new BigDecimal(5000), 99);
        employee1_4.setBonus(new BigDecimal(25));
        BigDecimal result1_4 = employee1_4.toPay();
        Employee employee2_3 = new SalesPerson("Petrov", new BigDecimal(6000), 100);
        employee2_3.setBonus(new BigDecimal(30));
        BigDecimal result2_3 = employee2_3.getBonus();
        Employee employee2_4 = new SalesPerson("Petrov", new BigDecimal(6000), 100);
        employee2_4.setBonus(new BigDecimal(30));
        BigDecimal result2_4 = employee2_4.toPay();
        Employee employee3_3 = new SalesPerson("Sidorov", new BigDecimal(7000), 101);
        employee3_3.setBonus(new BigDecimal(35));
        BigDecimal result3_3 = employee3_3.getBonus();
        Employee employee3_4 = new SalesPerson("Sidorov", new BigDecimal(7000), 101);
        employee3_4.setBonus(new BigDecimal(35));
        BigDecimal result3_4 = employee3_4.toPay();
        Employee employee4_3 = new SalesPerson("Smirnov", new BigDecimal(8000), 199);
        employee4_3.setBonus(new BigDecimal(40));
        BigDecimal result4_3 = employee4_3.getBonus();
        Employee employee4_4 = new SalesPerson("Smirnov", new BigDecimal(8000), 199);
        employee4_4.setBonus(new BigDecimal(40));
        BigDecimal result4_4 = employee4_4.toPay();
        Employee employee5_3 = new SalesPerson("Popov", new BigDecimal(9000), 200);
        employee5_3.setBonus(new BigDecimal(45));
        BigDecimal result5_3 = employee5_3.getBonus();
        Employee employee5_4 = new SalesPerson("Popov", new BigDecimal(9000), 200);
        employee5_4.setBonus(new BigDecimal(45));
        BigDecimal result5_4 = employee5_4.toPay();
        Employee employee6_3 = new SalesPerson("Sokolov", new BigDecimal(10000), 201);
        employee6_3.setBonus(new BigDecimal(45));
        BigDecimal result6_3 = employee6_3.toPay();


    }
}
