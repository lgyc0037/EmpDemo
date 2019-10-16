package com.employee.service.impl;

import com.employee.entity.Employee;
import com.employee.mapper.EmployeeMapper;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEployeeAll() {
        return employeeMapper.getEployeeAll();
    }

    @Override
    public Integer deleteEployee(String id) {
        return employeeMapper.deleteEployee(id);
    }

    @Override
    public Integer updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public Integer addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public Employee getEployeeById(String id) { return employeeMapper.getEployeeById(id);
    }
}
