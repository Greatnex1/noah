package MyPractices;

import java.util.Date;

public class TimeConversion {
   static  Date first = new Date();

    public static void main(String[] args) {
        String time = "02:45:40PM";
        String _24HourTime = timeConverter(time);
        System.out.println(_24HourTime);

        System.out.println(first);
    }

    private static String timeConverter(String timer) {

        String[] components = timer.split(":");
        String hourComponent = components[0];
        String minuteComponent = components[1];
        String secondsMeridian = components[2];
        String secondsComponent = secondsMeridian.substring(0, 2);
        String meridianComponent = secondsMeridian.substring(2);
        if (meridianComponent.equalsIgnoreCase("AM")) {
            if (hourComponent.equals("12")) {
                hourComponent = "00";
            } else if (meridianComponent.equalsIgnoreCase("PM")) {
                int hourComponentAsInt = Integer.parseInt((hourComponent));

                if (hourComponentAsInt < 12) {
                    hourComponentAsInt = hourComponentAsInt + 12;
                }
                hourComponent = String.valueOf(hourComponentAsInt);
            }
                   }
        return hourComponent + ":" + minuteComponent + ":" + secondsComponent;

    }
}