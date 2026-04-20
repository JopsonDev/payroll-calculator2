package com.pluarlsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    static void main() {
        try {
            FileReader payroll = new FileReader("list.csv");
            BufferedReader reader = new BufferedReader(payroll);
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                String[] parts = line.split("\\|");
                
            }
        } catch(Exception a){
            System.out.println("oops");
        }

    }
}
