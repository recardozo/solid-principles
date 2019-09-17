package wrongway;

public abstract class Teacher {
    
    public abstract void teach ();
    
    private void makeAnnouncements () {
        System.out.println ("Making annoucements");
    }
    
    private void takeAttendence () {
        System.out.println ("took attendence");
    }
    
    private void collectPaperWork () {
        System.out.println ("collected paperwork");
    }
    
    private void conductHallwayDuties () {
        System.out.println ("conducted hallway duties ");
    }
    
    public void performOtherResponsibilities () {
        makeAnnouncements ();
        takeAttendence ();
        collectPaperWork ();
        conductHallwayDuties ();
    }
}
