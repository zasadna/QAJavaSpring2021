package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Company {
    private Employee[] staff;

    public Company(Employee[] employees) {
        this.staff = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        for (Employee item: staff){
            if (item!= null){
                item.setBonus(companyBonus);
            }
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal amount = BigDecimal.ZERO;
        for (Employee item: staff){
            if (item!= null){
                amount = amount.add(item.toPay());
            }
        }
        return amount;
    }

    public String nameMaxSalary() {
        String lastName = "";
        BigDecimal max = new BigDecimal(-1);
        for (Employee item: staff){
            if (item!= null && item.toPay().compareTo(max) > 0){
                lastName = item.getLastName();
                max = item.toPay();
            }
        }
        return lastName;
    }
}
