package wrongway;

public class EmergencyRoomProcess {
    
    public static void main (String[] args) {
        HospitalManagement hospitalManagement = new HospitalManagement ();
        Employee renato = new Doctor (1, "Renato", "energency", true);
        hospitalManagement.callUpon (renato);
        
        Employee cindy = new Nurse (2, "Cindy", "emergency", true);
        hospitalManagement.callUpon (cindy);
    }
}
