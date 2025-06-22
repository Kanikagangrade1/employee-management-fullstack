package com.employee.em_project;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> readEmployees();
    Employee updateEmployee(Long id, Employee employee);
    boolean deleteEmployee(Long id);
    Employee getEmployeeById(Long id);
}
