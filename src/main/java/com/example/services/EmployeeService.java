package com.example.services;

import com.example.constants.Constants;
import com.example.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    public Employee getEmployee(final int empId) throws Exception {
        List<Employee> staticEmployeeList = Constants.employeeList;
        List<Employee> employee = staticEmployeeList.stream().filter(emp -> emp.getEmpId()==empId).collect(Collectors.toList());
        if(employee==null || employee.size()==0){
            throw new Exception ("User not found");
        }
        return employee.get(0);
    }
}
