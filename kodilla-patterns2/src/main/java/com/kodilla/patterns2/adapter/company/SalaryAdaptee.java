package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.newhrsystem.Employee;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee {
    public BigDecimal calculateSalaries(List<Employee> employees){
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
