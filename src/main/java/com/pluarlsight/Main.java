package com.pluarlsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
            try {
                FileReader payroll = new FileReader("list.csv");
                BufferedReader reader = new BufferedReader(payroll);

                String line;

                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\|");

                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double hoursWorked = Double.parseDouble(parts[2]);
                    double payRate = Double.parseDouble(parts[3]);

                    Employee first = new Employee(id, name, hoursWorked, payRate);

                    System.out.printf("ID: %d | Name: %s | Gross pay: %.2f%n", first.getEmployeeId(), first.getName(), first.getGrossPay());
                }
            } catch (Exception a) {
                System.out.println("Oh no something went wrong...");
            }
    }
}
