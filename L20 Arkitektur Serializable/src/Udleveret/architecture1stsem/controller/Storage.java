package Udleveret.architecture1stsem.controller;

import Udleveret.architecture1stsem.model.Company;
import Udleveret.architecture1stsem.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface Storage {
    ArrayList<Employee> getEmployees();

    ArrayList<Company> getCompanies();

    void deleteEmployee(Employee employee);
    void storeEmployee(Employee employee);

    void storeCompany(Company company);
    void deleteCompany(Company company);
}
