package rightway.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    
    public LaptopManufacturingProcess (String processName) {
        super (processName);
    }
    
    @Override
    protected void assembleDevice () {
        System.out.println ("laptop assembled");
    }
    
    @Override
    protected void testDevice () {
        System.out.println ("laptop tested");
    }
    
    @Override
    protected void packageDevice () {
        System.out.println ("laptop packaged");
    }
    
    @Override
    protected void storeDevice () {
        System.out.println ("laptop stored");
    }
}
