package com.kodilla.patterns2.adapter.company;
// która będzie dziedziczyła z klasy SalaryAdaptee
// i będzie tą klasę rozszerzała o obsługę wywołań ze starego systemu kadrowo-płacowego

import com.kodilla.patterns2.adapter.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator{
    @Override
    public double TotalSlalary(String[][] workers, double[] salaries) { // TotalSlalary ??
        List<Employee> employeeList = new ArrayList<>();
        for( int n = 0; n< salaries.length; n++) {
        employeeList.add(new Employee(workers[n][0], workers[n][1], workers[n][2], new BigDecimal(salaries [n]) ));
        }
        return calculateSalaries(employeeList).doubleValue();
    }
}
