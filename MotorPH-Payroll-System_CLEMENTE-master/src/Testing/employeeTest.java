// !!REMINDER!! - Make sure to change the jdbc setting in MyConnection.java first

package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import payroll.AdminPortal;
import payroll.Employee;
import payroll.EmployeeDataController;
import payroll.MyConnection;


public class employeeTest {
	
	@Ignore
    @Test
    public void testEmployeeConstructorAndGetterMethods() {
        int employeeID = 1;
        String lastName = "Garcia";
        String firstName = "Manuel III";
        Date birthday = new Date (1983-10-11);
        String address = "'Valero Carpark Building Valero Street 1227, Makati City'";
        String phoneNum = "966-860-270";
        String sssNum = "44-4506057-3";
        String philhealthNum = "820126853951";
        String pagibigNum = "691295330870";
        String tinNum = "442-605-657-000";

        Employee emp = new Employee(employeeID, lastName, firstName, birthday, address,
                phoneNum, sssNum, philhealthNum, pagibigNum, tinNum);

        
        assertEquals(employeeID, emp.getEmployeeID());
        assertEquals(lastName, emp.getLastName());
        assertEquals(firstName, emp.getFirstName());
        assertEquals(birthday, emp.getBirthday());
        assertEquals(address, emp.getAddress());
        assertEquals(phoneNum, emp.getPhoneNum());
        assertEquals(sssNum, emp.getSssNum());
        assertEquals(philhealthNum, emp.getPhilhealthNum());
        assertEquals(pagibigNum, emp.getPagibigNum());
        assertEquals(tinNum, emp.getTinNum());
        
        System.out.println("testEmployeeConstructorAndGetterMethods passed successfully.");
    }

	
	@Ignore
	@Test
	public void testValidEmployeeID() {
	    int employeeID = 1;
	    Employee emp = new Employee(employeeID, "Doe", "John", Date.valueOf("1990-01-01"), "Address", "123456789", "SSS", "Philhealth", "Pagibig", "TIN");
	    assertEquals(employeeID, emp.getEmployeeID());
	    System.out.println("testValidEmployeeID passed successfully.");
	}
	
	
	@Ignore
	@Test
	public void testUniqueEmployeeIDs() {
	    Employee emp1 = new Employee(1, "Doe", "John", Date.valueOf("1990-01-01"), "Address", "123456789", "SSS", "Philhealth", "Pagibig", "TIN");
	    Employee emp2 = new Employee(2, "Smith", "Jane", Date.valueOf("1990-01-01"), "Address", "987654321", "SSS", "Philhealth", "Pagibig", "TIN");

	    assertNotEquals(emp1.getEmployeeID(), emp2.getEmployeeID());
	}
	
	
    private AdminPortal adminPortal;
    private MyConnection realMyConnection;
    private EmployeeDataController employeeDataController;

    @Before
    public void setUp() throws SQLException {
        // Initialize real MyConnection
        realMyConnection = new MyConnection(); // Assuming MyConnection connects to a real database

        // Create AdminPortal instance using real MyConnection
        adminPortal = new AdminPortal(realMyConnection);
        
        employeeDataController = new EmployeeDataController(realMyConnection);
        
    }
    
    @Ignore
    @Test
    public void testListAllEmployeesFromDatabase() throws SQLException {
        // Retrieve all employees from the database using EmployeeDataController
        List<Employee> employees = employeeDataController.fetchEmployeeDataFromDatabase();

        // Ensure the list is not null and contains at least one employee
        assertNotNull(employees);
        assertFalse(employees.isEmpty());

        System.out.println("List of Employees:");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
    
    @Ignore
    @Test
    public void testSaveEmployeeToDatabase() throws SQLException {
        // Prepare test data
        Employee employee = new Employee("Chan", "Jose Mari", new Date(83, 9, 11),
                "North Pole, Malamig City", "966-860-999",
                "44-4599957-3", "820126859991", "691299930870", "442-605-999-000");

        // Execute method under test
        adminPortal.saveEmployeeToDatabase(employee);
        System.out.println("testSaveEmployeeToDatabase passed successfully.");
        
    }



}
