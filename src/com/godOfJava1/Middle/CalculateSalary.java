package com.godOfJava1.Middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        int type = employee.getType();
        long salary = employee.getSalary();
        long returnSalary = 0;
        if (type == 1) returnSalary = salary - (salary * 95 / 100);
        if (type == 2) returnSalary = salary + (salary * 10 / 100);
        if (type == 3) returnSalary = salary + (salary * 20 / 100);
        if (type == 4) returnSalary = salary + (salary * 30 / 100);
        if (type == 5) returnSalary = salary + (salary * 100 / 100);
        return returnSalary;
    }

    public void calculateSalaries() {
        Employee[] employees = new Employee[5];
        employees[0]= new Employee("LeeDaeRi", 1, 1000000000);
        employees[1]= new Employee("KimManager", 2, 100000000);
        employees[2]= new Employee("WhangDesign", 3, 70000000);
        employees[3]= new Employee("ParkArchi", 4, 80000000);
        employees[4]= new Employee("LeeDevelop", 5, 60000000);
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            String name = employee.getName();
            long returnSalary = getSalaryIncrease(employee);
            System.out.println(name + " = " + returnSalary);
        }
    }
}
