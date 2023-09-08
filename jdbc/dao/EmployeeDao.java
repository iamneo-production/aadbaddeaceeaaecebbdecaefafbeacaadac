package jdbc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import jdbc.utility.DBConnectionUtility;
import jdbc.entity.Employee;

public class EmployeeDao
{
    public int insertEmployeeDetails(final Employee employeeObj) throws Exception {
        final Connection conn = DBConnectionUtility.getConnection();
        final String SQLQuery = "INSERT IGNORE INTO employee VALUES(?,?,?,?)";
        final PreparedStatement pStmt = conn.prepareStatement(SQLQuery);
        pStmt.setInt(1, employeeObj.getEmployeeId());
        pStmt.setString(2, employeeObj.getEmployeeName());
        pStmt.setFloat(3, employeeObj.getEmployeeRating());
        pStmt.setBoolean(4, employeeObj.isHikeStatus());
        final int rowAffectedStatus = pStmt.executeUpdate();
        pStmt.close();
        conn.close();
        return rowAffectedStatus;
    }
    
    public Employee getEmployeeDetailsById(final int id) throws Exception {
        final Employee employeeObj = new Employee();
        final Connection conn = DBConnectionUtility.getConnection();
        final String SQLQuery = "SELECT * FROM employee WHERE employeeId = ?";
        try {
            final PreparedStatement pStmt = conn.prepareStatement(SQLQuery);
            pStmt.setInt(1, id);
            final ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                employeeObj.setEmployeeId(id);
                employeeObj.setEmployeeName(rs.getString("employeeName"));
                employeeObj.setEmployeeRating(rs.getFloat("employeeRating"));
                employeeObj.setHikeStatus(rs.getBoolean("hikeStatus"));
                return employeeObj;
            }
        }
        catch (SQLException e) {
            throw new Exception("DAO error");
        }
        return null;
    }
    
    public int updateEmployeeDetailsByName(final Employee employee, final String s) throws Exception {
        throw new Exception("abc");
    }
    
    public int deleteEmployeeDetailsById(final int id) throws SQLException, ClassNotFoundException,Exception {
        final Connection conn = DBConnectionUtility.getConnection();
        final String SQLQuery = "DELETE FROM employee WHERE employeeId = ?";
        final PreparedStatement pStmt = conn.prepareStatement(SQLQuery);
        pStmt.setInt(1, id);
        final int rowAffectedStatus = pStmt.executeUpdate();
        pStmt.close();
        conn.close();
        return rowAffectedStatus;
    }
}