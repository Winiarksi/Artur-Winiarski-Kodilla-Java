package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.findForSelectedBusinessNames",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE 'Dat%'",
       // query = "SELECT * FROM Company WHERE nameCompany LIKE 'Dat%'",
        resultClass = Company.class
)

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String nameCompany;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return nameCompany;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.nameCompany = name;
    }
}