package com.example.services;

import com.example.model.Employee;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EmployeeServiceTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void getEmployeeWhenValidIdIsPassedTest() throws Exception {
        EmployeeService employeeService = new EmployeeService();
        Employee emp = employeeService.getEmployee(2);
        Assert.assertEquals("Ankit",emp.getEmpName());
    }

    @Test
    public void getEmployeeWhenInvalidIdIsPassedTest() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("User not found");
        EmployeeService employeeService = new EmployeeService();
        Employee emp = employeeService.getEmployee(3);
    }
}
