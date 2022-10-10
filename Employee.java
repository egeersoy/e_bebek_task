package org.e_bebek;

public class Employee {

    private static final int year = 2021;

    private final String name;
    private final Double salary;
    private final Integer workHours;
    private final Integer hireYear;

    public Employee(String name, Double salary, Integer workHours, Integer hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Double tax() {
        if (this.salary < 1000) {
            return 0.0;
        }

        return this.salary * 0.03;
    }

    public Double bonus() {
        if (this.workHours <= 40) {
            return 0.0;
        }
        return (this.workHours - 40) * 30.0;
    }

    public Double raiseSalary() {
        double netSalary = salary - tax() + bonus();

        if (year - this.hireYear < 10) {
            return netSalary * 1.05;
        }

        if (year - this.hireYear < 20) {
            return netSalary * 1.1;
        }

        return netSalary * 1.15;
    }

    public Double netSalary() {
        return salary + bonus() - tax();
    }

    public Double grossSalary() {
        return salary + bonus();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
