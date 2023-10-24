public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour<0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour*0.621371);
        return milesPerHour;
    }
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
    }
}