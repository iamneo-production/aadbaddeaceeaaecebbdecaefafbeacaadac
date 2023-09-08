package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import jdbc.entity.Employee;
import jdbc.service.EmployeeService;

public class EmployeeApp {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		do {
			EmployeeService employeeService = new EmployeeService();
			System.out.println("### Employee Hike Application ###");
			System.out
					.println("**************************************************************************************");
			System.out.println("Select '1' to INSERT Employee details");
			System.out.println("Select '2' to GET/VIEW Employee details by Employee ID");
			System.out.println("Select '3' to UPDATE Employee details by Employee Name");
			System.out.println("Select '4' to DELETE Employee details by ID");
			System.out.println("Select '0' to EXIT the code");
			System.out.println(
					"**************************************************************************************\n\n");
			System.out.println("Enter your choice: ");

			n = sc.nextInt();
			System.out.println("Your choice is....." + n);

			switch (n) {
			case 0: {
				System.out.println("Exiting the application...");
				System.exit(0);
			}
			case 1: {
				int employeeId;
				String employeeName;
				float employeeRating;
				boolean hikeStatus;

				System.out.println("\n\n");
				System.out.println("... INSERT Employee details ...");
				System.out.println("Enter employee Details");

				System.out.println("Enter Employee ID: ");
				employeeId = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name: ");
				employeeName = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee Rating: ");
				employeeRating = sc.nextFloat();
				sc.nextLine();
				System.out.println("Enter Employee Hike Status: ");
				hikeStatus = sc.nextBoolean();
				sc.nextLine();
				Employee employeeDetails = new Employee(employeeId, employeeName, employeeRating, hikeStatus);
				int rowsAffectedByInsert = 0;
				try {
					rowsAffectedByInsert = employeeService.insertEmployeeDetails(employeeDetails);
				} catch (ClassNotFoundException | SQLException  e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Count of Rows Affected By INSERT operation: " + rowsAffectedByInsert);
				System.out.println("\n\n");

			}
				break;
			case 2: {
				try {
					int employeeId;

					System.out.println("\n\n");
					System.out.println("GET/VIEW Employee details by Employee ID");

					System.out.println("Enter employee ID to view:");
					employeeId = sc.nextInt();
					sc.nextLine();
					Employee employeeDetails = new Employee();

				
						employeeDetails = employeeService.getEmployeeDetailsById(employeeId);
				

					// TODO Auto-generated catch block

					System.out.println("Employee Details for the Employee ID '" + employeeId + "' are:");
					System.out.println((employeeDetails != null) ? employeeDetails.toString() : "Not Found");
					System.out.println("\n\n");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
//				catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					System.out.println(e.getMessage());
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					System.out.println(e.getMessage());
//				}
			}
				break;
			case 3: {
				int employeeId;
				String employeeName;
				float employeeRating;
				boolean hikeStatus;

				System.out.println("\n\n");
				System.out.println("UPDATE Employee details by Employee Name");

				System.out.println("Enter employee NAME to be updated: ");
				employeeName = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee ID: ");
				employeeId = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Rating: ");
				employeeRating = sc.nextFloat();
				sc.nextLine();
				System.out.println("Enter Employee Hike Status: ");
				hikeStatus = sc.nextBoolean();
				sc.nextLine();
				Employee employeeDetails = new Employee();

				employeeDetails.setEmployeeId(employeeId);
				employeeDetails.setEmployeeRating(employeeRating);
				employeeDetails.setHikeStatus(hikeStatus);

				int rowsAffectedByUpdate = 0;
				try {
					rowsAffectedByUpdate = employeeService.updateEmployeeDetailsByName(employeeDetails, employeeName);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Count of Rows Affected By UPDATE operation: " + rowsAffectedByUpdate);
				System.out.println("\n\n");
			}
				break;
			case 4: {

				int employeeId;

				System.out.println("\n\n");
				System.out.println("DELETE Employee details by ID");

				System.out.println("Enter employee ID to DELETE:");
				employeeId = sc.nextInt();
				sc.nextLine();

				int rowsAffectedByDelete = 0;
				try {
					rowsAffectedByDelete = employeeService.deleteEmployeeDetailsById(employeeId);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Rows Affected By INSERT operation: " + rowsAffectedByDelete);
				System.out.println("\n\n");
			}
				break;
			case 5: {

			}
				break;
			case 6: {

			}
				break;
			default: {

				System.out.println("Select number out of range 0-6");
			}
				break;

			}
		} while (n != 0);
		sc.close();

	}
}