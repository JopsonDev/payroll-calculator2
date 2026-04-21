package com.pluarlsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeid, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeid;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getPayRate() {
        return payRate;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public String toString() {
        return String.format(
                "ID: %d | Name: %s | Hours: %.2f | Payrate: %.2f",
                employeeId, name, hoursWorked, payRate);
    }
    public double getGrossPay(){
        return hoursWorked * payRate;
    }
}
