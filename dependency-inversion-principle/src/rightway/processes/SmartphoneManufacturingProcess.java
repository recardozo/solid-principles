package rightway.processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    
    
    public SmartphoneManufacturingProcess (String processName) {
        super (processName);
    }
    
    @Override
    protected void assembleDevice () {
        System.out.println ("smartphone assembled");
    }
    
    @Override
    protected void testDevice () {
        System.out.println ("smartphone tested");
    }
    
    @Override
    protected void packageDevice () {
        System.out.println ("Smartphone packaged!");
    }
    
    @Override
    protected void storeDevice () {
        System.out.println ("smartphone stored");
    }
}
