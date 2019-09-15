package goodway.clients;

import goodway.domain.Employee;
import goodway.domain.dao.EmployeeDAO;
import goodway.reporting.EmployeeReportFormatter;
import goodway.reporting.FormatType;

public class ClientModule {
    
    public static void main (String[] args) {
        Employee renato = new Employee (1, "Renato", "human resources", true);
        hireNewEmployee (renato);
        printEmployeeReport (renato,FormatType.XML);
        terminateNewEmployee (renato);
        
    }
    
    private static void printEmployeeReport (Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter= new EmployeeReportFormatter (employee,formatType);
        System.out.println (formatter.getFormattedEmployee ());
    }
    
    private static void terminateNewEmployee (Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO ();
        employeeDAO.deleteEmployee (employee);
    }
    
    private static void hireNewEmployee (Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO ();
        employeeDAO.saveEmployee (employee);
    }
}
