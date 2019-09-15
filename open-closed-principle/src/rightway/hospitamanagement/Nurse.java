package rightway.hospitamanagement;

public class Nurse extends Employee {
    
    public Nurse (int id, String name, String department, boolean working) {
        super (id, name, department, working);
    }
   
    private void checkVitalSigns () {
        System.out.println ("Checking vital Signs");
    }
    
    private void drawBlood () {
        System.out.println ("drawing blood!");
    }
    
    private void cleanPatientArea () {
        System.out.println ("Cleaning patient area!");
    }
    
    @Override
    public void performDuties () {
        checkVitalSigns ();
        drawBlood ();
        cleanPatientArea ();
    }
}
