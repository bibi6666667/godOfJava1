package com.godOfJava1.Middle;

public class Employee {
    private String name; // 이름
    private int type; // 업무역할
    private long salary; // 연봉

    public Employee(String name, int type, long salary) {
       setName(name);
       setType(type);
       setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public long getSalary() {
        return this.salary;
    }
}
