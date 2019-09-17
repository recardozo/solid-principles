package wrongway;

public class SubstituteTeacher extends Teacher {
    
    // this class violate liskov substitution principle because a substitute teacher is not a real teacher
    // and it has to implement teach method
    @Override
    public void teach () {
        //do nothing
    }
}
