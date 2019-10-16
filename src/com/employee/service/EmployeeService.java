package com.employee.service;

import com.employee.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getEployeeAll();
    public Integer deleteEployee(String id);
    public Integer updateEmployee(Employee employee);
    public Integer addEmployee(Employee employee);
    public  Employee getEployeeById(String id);
}
