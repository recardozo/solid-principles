package goodway.domain.dao;

import goodway.connection.DatabaseConnectionManager;
import goodway.domain.Employee;

public class EmployeeDAO {
    DatabaseConnectionManager connectionManager;
    
    public void saveEmployee (Employee employee) {
        System.out.println ("Saving employee" + employee);
    }
    
    public void deleteEmployee (Employee employee) {
        System.out.println ("Deleting employee" + employee);
    }
    
}
