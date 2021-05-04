public class SecondsAndMinutes {

    //Creating the 1st method
    public static int getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value.");
            return -1;
        } else {
            //minutes = (seconds / 60) + minutes;
            int hours = minutes / 60;
            minutes = minutes % 60;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
            return hours;
        }
    }

    //Creating the 2nd method
    public static int getDurationString(int seconds) {

        if (seconds < 0) {
            System.out.println("Invalid value.");
            return -1;
        } else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            getDurationString(minutes, seconds);
            return minutes;
        }
    }
}
