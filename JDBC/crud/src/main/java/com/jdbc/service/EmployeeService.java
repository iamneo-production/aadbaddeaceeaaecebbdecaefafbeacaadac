package com.jdbc.service;


import java.sql.SQLException;
import com.jdbc.entity.Employee;
import com.jdbc.dao.EmployeeDao;

public class EmployeeService
{
    EmployeeDao employeeDaoMethods;
    
    public EmployeeService() {
        this.employeeDaoMethods = new EmployeeDao();
    }
    
    public int insertEmployeeDetails(final Employee employeeObj) throws SQLException, ClassNotFoundException, Exception {
        return this.employeeDaoMethods.insertEmployeeDetails(employeeObj);
    }
    
    public Employee getEmployeeDetailsById(final int id) throws SQLException, ClassNotFoundException, Exception {
        return this.employeeDaoMethods.getEmployeeDetailsById(id);
    }
    
    public int updateEmployeeDetailsByName(final Employee employeeObj, final String name) throws SQLException, ClassNotFoundException, Exception {
        return this.employeeDaoMethods.updateEmployeeDetailsByName(employeeObj, name);
    }
    
    public int deleteEmployeeDetailsById(final int id) throws SQLException, ClassNotFoundException, Exception {
        return this.employeeDaoMethods.deleteEmployeeDetailsById(id);
    }
}