package rightway;

import wrongway.Doctor;
import wrongway.Employee;
import wrongway.HospitalManagement;
import wrongway.Nurse;

public class EmergencyRoomProcess {
    
    public static void main (String[] args) {
            wrongway.HospitalManagement hospitalManagement = new HospitalManagement ();
            wrongway.Employee renato = new Doctor (1, "Renato", "energency", true);
            hospitalManagement.callUpon (renato);
        
            Employee cindy = new Nurse (2, "Cindy", "emergency", true);
            hospitalManagement.callUpon (cindy);
    }
}
