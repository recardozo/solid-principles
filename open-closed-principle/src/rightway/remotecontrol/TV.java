package rightway.remotecontrol;

public class TV implements Device {
    
    @Override
    public void turnOn () {
        switchToFavoriteChannel ();
        System.out.println ("A tv has been turned on!");
    }
    
    @Override
    public void turnOff () {
        turnOnTVAlarm ();
        System.out.println ("A tv has been turned off!");
    }
    
    private void switchToFavoriteChannel () {
        System.out.println ("Switched to favorite channel");
    }
    
    private void turnOnTVAlarm () {
        System.out.println ("A tv alarm was setted to wake up in the next morning");
    }
    
    @Override
    public String toString () {
        return "Television";
    }
}
