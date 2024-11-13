public class TimeCalc {
    public static void main(String[] args) {
        // Proogram that gets a time input and a number minutesToAdd input. the program cimputes the times + minutesToAdd and prints the resulting time.
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        // Spliting the time to hours and minutes
        String hours = time.substring(0, 2);
        String minutes = time.substring(3, 5);

        //convert the hours and minutes string's into int's 
        int hoursInt = Integer.parseInt(hours);
        int minutesInt = Integer.parseInt(minutes);

        // Calculating the new hour and minutes
        int totalMinutes = (hoursInt * 60) + minutesInt + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHour = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        // Prints the new time
        System.out.printf("%02d:%02d %n",newHour, newMinutes);

    }
}
