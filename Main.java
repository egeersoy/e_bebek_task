package org.e_bebek;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ege Ersoy", 3000.0, 50, 2015);

        System.out.println(employee);
        System.out.println("Tax:" + employee.tax());
        System.out.println("Bonus:" + employee.bonus());
        System.out.println("Net Salary:" + employee.netSalary());
        System.out.println("Salary With Raise:" + employee.raiseSalary());
        System.out.println("Gross Salary:"+ employee.grossSalary() );
    }
}