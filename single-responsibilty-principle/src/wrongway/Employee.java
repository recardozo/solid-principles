package wrongway;

public class Employee {
    long id;
    String name;
    String department;
    boolean working;
    
    public void saveEmployeeToDatabase(){
        System.out.println ("Employee saved!");
    }
    
    public void printEmployeeDetailReportXML(){
        System.out.println ("Printing employee xml");
    }
    
    public void printEmployeeDetailReportCSV(){
        System.out.println ("Printing employee csv");
    }
    
    public void terminateEmployee(){
        System.out.println ("Terminate Employeee");
    }
}
