package rightway;

public class Doctor extends Employee {
    
    public Doctor (int id, String name, String department, boolean working) {
        super (id, name, department, working);
    }
    
    private void prescribeMedicine () {
        System.out.println ("Pescribe Medicine !");
    }
    
    private void diagnosePatients () {
        System.out.println ("diagnose patient");
    }
    
    @Override
    public void performDuties () {
        prescribeMedicine ();
        diagnosePatients ();
    }
}
