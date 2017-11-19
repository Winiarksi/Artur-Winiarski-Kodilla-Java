package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompany(String name){
        return companyDao.findForSelectedBusinessNames(name);
    }

    @Override
    public String toString() {
        return "CompanyService{" +
                "companyDao=" + companyDao +
                ", employeeDao=" + employeeDao +
                '}';
    }

    public List<Employee> searchEmployee(String name){
        name="%" + name + "%";
        return employeeDao.findEmployeeName(name);
    }

}
