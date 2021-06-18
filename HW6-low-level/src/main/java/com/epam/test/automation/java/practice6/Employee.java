package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

abstract class Employee {
    private String lastName;
    private BigDecimal salary;
    protected BigDecimal bonus;

    public Employee(String lastName, BigDecimal salary) {
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        if (salary.intValue() > 0) {
            this.salary = salary;
        } else throw new IllegalArgumentException();
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    abstract void setBonus(BigDecimal bonus);

    public BigDecimal toPay() {
        if (bonus != null &&
                bonus.intValue() > 0) {
            return salary.add(bonus);
        } else throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
