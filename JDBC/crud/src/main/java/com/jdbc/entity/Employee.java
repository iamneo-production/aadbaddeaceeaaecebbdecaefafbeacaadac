package jdbc.entity;


public class Employee
{
    private int employeeId;
    private String employeeName;
    private float employeeRating;
    private boolean hikeStatus;
    
    public Employee(final int employeeId, final String employeeName, final float employeeRating, final boolean hikeStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRating = employeeRating;
        this.hikeStatus = hikeStatus;
    }
    
    public Employee() {
    }
    
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(final int employeeID) {
        this.employeeId = employeeID;
    }
    
    public String getEmployeeName() {
        return this.employeeName;
    }
    
    public void setEmployeeName(final String employeeName) {
        this.employeeName = employeeName;
    }
    
    public float getEmployeeRating() {
        return this.employeeRating;
    }
    
    public void setEmployeeRating(final float employeeRating) {
        this.employeeRating = employeeRating;
    }
    
    public boolean isHikeStatus() {
        return this.hikeStatus;
    }
    
    public void setHikeStatus(final boolean hikeStatus) {
        this.hikeStatus = hikeStatus;
    }
    
    @Override
    public String toString() {
        return "Employee ID:  " + this.employeeId + "  Employee Name:  " + this.employeeName + "  Employee Rating:  " + this.employeeRating + "  Hike Status:  " + this.hikeStatus;
    }
}