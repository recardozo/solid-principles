package rightway.remotecontrol;

public class DeviceUser {
    
    public static void main (String[] args) {
        RemoteControl remoteControl= new RemoteControl ();
        Device tv= new TV ();
        
        remoteControl.turnOn (tv);
        
        Device projector= new Projector ();
        remoteControl.turnOn (projector);
        
    }
}
