public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if(hourOfDay>=0) {
                if(hourOfDay<8 || hourOfDay==23) {
                    return true;
                }
            }
        }
        return false;
    }
}
/*
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking && (hourOfDay>=0 && (hourOfDay<8 || hourOfDay==23))) {
            return true;
        }
        return false;
    }
}
//this is the submitteed code
 */