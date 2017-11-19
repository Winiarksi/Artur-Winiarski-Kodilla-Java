package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyServiceTest {

    @Autowired
    private CompanyService companyService;

    @Test
    public void searchCompanyDao() throws Exception {
        // Given
        // When
        List<Company> resultList = companyService.searchCompany("Grey Matter");

        // Then
        assertEquals(12, resultList.size());
    }

    @Test
    public void searchEmployeeDao() throws Exception {
        //  Given
        //  When
        List<Employee> resultList = companyService.searchEmployee("Smith");

        // Then
        assertEquals(12, resultList.size());
        // assercja
    }
}