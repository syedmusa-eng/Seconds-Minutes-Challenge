public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    //Creating the 1st method
    public static int getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        } else {
            //minutes = (seconds / 60) + minutes;
            int hours = minutes / 60;
            minutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = minutes + "m";
            if (minutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            System.out.println(hoursString + " " + minutesString + " " + secondsString + "");
            return hours;
        }
    }

    //Creating the 2nd method
    public static int getDurationString(int seconds) {

        if (seconds < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        } else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            getDurationString(minutes, seconds);
            return minutes;
        }
    }
}
