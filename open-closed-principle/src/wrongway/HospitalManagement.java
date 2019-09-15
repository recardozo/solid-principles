package wrongway;

public class HospitalManagement {
    
    //This class violates SRP and OCP because knows too much, do a lot of things and if we want to add another
    //functionality, we have to add an if statement. This may break our application in different parts.
    // This class is not closed for modification
    
    public void callUpon (Employee employee) {
        if (employee instanceof Nurse) {
            checkVitalSigns ();
            drawBlood ();
            cleanPatientArea ();
        } else if (employee instanceof Doctor) {
            prescribeMedicine ();
            diagnosePatients ();
        }
    }
    
    //Nurses
    private void checkVitalSigns () {
        System.out.println ("Checking vital Signs");
    }
    
    private void drawBlood () {
        System.out.println ("drawing blood!");
    }
    
    private void cleanPatientArea () {
        System.out.println ("Cleaning patient area!");
    }
    
    //Doctors
    private void prescribeMedicine () {
        System.out.println ("Pescribe Medicine !");
    }
    
    private void diagnosePatients () {
        System.out.println ("diagnose patient");
    }
}
