public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        String hms = getDurationString(65,45);
        System.out.println(hms);
        hms = getDurationString(3945);
        System.out.println(hms);
    }
    public static String getDurationString(int minutes, int seconds) {
        if(minutes<0 || seconds<0 || seconds>59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes/60;
        int mins = minutes%60;
        // edited the code to add 0 if h/m/s are in in single digit;
        String hoursString = hours+"h";
        if(hours<10) {
            hoursString = "0"+hoursString;
        }
        String minsString = mins+"h";
        if(mins<10) {
            minsString = "0"+minsString;
        }
        String secondsString = seconds+"h";
        if(seconds<10) {
            secondsString = "0"+secondsString;
        }
        return hoursString+" "+minsString+" "+secondsString;
        // return String.format("%dh %dm %ds",hours,mins,seconds); //we can also write this as  return hours+"h "+mins+"m "+seconds+"s";
    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        int mins = seconds/60;
        int secnds = seconds%60;
        return getDurationString(mins,secnds);
    }
}