package com.godOfJava1.c13;

public enum HealthInsurance {
    LEVEL_ONE(1000, 0.01),
    LEVEL_TWO(2000, 0.02),
    LEVEL_THREE(3000, 0.032),
    LEVEL_FOUR(4000, 0.045),
    LEVEL_FIVE(5000, 0.056),
    LEVEL_SIX(6000, 0.071);
    private final int maxSalary;
    private final double ratio;

    HealthInsurance(int maxSalary, double ratio) {// 생성자
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    double getRatio(int maxSalary) { // 공제비율을 리턴하는 메소드
        double returnRatio = 0.0;
        HealthInsurance[] healthInsurancesList = HealthInsurance.values();
        for (HealthInsurance one : healthInsurancesList) {
            if (maxSalary == one.maxSalary) {
                returnRatio = one.ratio;
                break;
            }
        }
        return returnRatio;
    }

    public static HealthInsurance getHealthInsurance(int salary) {
        HealthInsurance[] healthInsurancesList = HealthInsurance.values();
        for (HealthInsurance one : healthInsurancesList) {
            if (salary == one.maxSalary) {
                returnRatio = one.ratio;
                break;
            }
        }
    }
}
