package goodway.reporting;

import goodway.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    
    Employee anEmployee;
    FormatType formatType;
    
    public EmployeeReportFormatter (Employee employee, FormatType formatType) {
        super (employee, formatType);
    }
    
    public String getFormattedEmployee () {
        return getFormattedValue ();
    }
}
