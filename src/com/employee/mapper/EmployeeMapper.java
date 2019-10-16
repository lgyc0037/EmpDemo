package com.employee.mapper;

import com.employee.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> getEployeeAll();
    public Integer deleteEployee(@Param("id") String id);
    public Integer updateEmployee(Employee employee);
    public Integer addEmployee(Employee employee);
    public  Employee getEployeeById(@Param("id") String id);
}
