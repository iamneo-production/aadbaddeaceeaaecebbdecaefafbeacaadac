package jdbc.service;

import com.LTIMindtree.ApplicationName.utility.DBConnectionUtilityException;
import java.sql.SQLException;
import com.LTIMindtree.ApplicationName.entity.Employee;
import com.LTIMindtree.ApplicationName.dao.EmployeeDao;

public class EmployeeService
{
    EmployeeDao employeeDaoMethods;
    
    public EmployeeService() {
        this.employeeDaoMethods = new EmployeeDao();
    }
    
    public int insertEmployeeDetails(final Employee employeeObj) throws SQLException, ClassNotFoundException, DBConnectionUtilityException {
        return this.employeeDaoMethods.insertEmployeeDetails(employeeObj);
    }
    
    public Employee getEmployeeDetailsById(final int id) throws SQLException, ClassNotFoundException, DBConnectionUtilityException {
        return this.employeeDaoMethods.getEmployeeDetailsById(id);
    }
    
    public int updateEmployeeDetailsByName(final Employee employeeObj, final String name) throws SQLException, ClassNotFoundException, DBConnectionUtilityException {
        return this.employeeDaoMethods.updateEmployeeDetailsByName(employeeObj, name);
    }
    
    public int deleteEmployeeDetailsById(final int id) throws SQLException, ClassNotFoundException, DBConnectionUtilityException {
        return this.employeeDaoMethods.deleteEmployeeDetailsById(id);
    }
}