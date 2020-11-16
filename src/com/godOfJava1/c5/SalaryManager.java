package com.godOfJava1.c5;

import com.sun.security.jgss.GSSUtil;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        int yearlySalary = 20000000;
        salaryManager.getMonthlySalary(yearlySalary);
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary / 12.0;
        double workTax = calculateTax(monthlySalary);
        double nationalPension = calculateNationalPension(monthlySalary);
        double healthInsurance = calculateHealthInsurance(monthlySalary);
        double toSubtract = workTax + nationalPension + healthInsurance;
        System.out.println("세금 총합 : " + toSubtract);
        monthlySalary -= toSubtract;
        System.out.println("한 달 급여 : " + monthlySalary);
        return monthlySalary ;
    }

    public double calculateTax(double monthSalary) {
        double workTax = monthSalary * 0.125; // 또는 (12.5/100)
        System.out.println("근로소득세 : " + workTax);
        return workTax;
    }

    public double calculateNationalPension(double monthSalary) {
        double howMuchYeonGeum = monthSalary * 0.081; // 또는 (8.1/100)
        System.out.println("국민연금 : " + howMuchYeonGeum);
        return howMuchYeonGeum;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double howMuchHealthInsure = monthSalary * 0.135; // 또는 (13.5/100)
        System.out.println("건강보험료 : " + howMuchHealthInsure);
        return howMuchHealthInsure;
    }
}
