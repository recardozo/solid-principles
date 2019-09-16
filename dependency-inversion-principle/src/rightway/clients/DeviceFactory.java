package rightway.clients;

import rightway.processes.GeneralManufacturingProcess;
import rightway.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    
    public static void main (String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess ("Ipohne");
        manufacturer.launchProcess ();
    }
}
