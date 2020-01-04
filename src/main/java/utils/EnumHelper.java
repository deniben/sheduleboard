package utils;

import enums.DayOfWeek;

public class EnumHelper {
    public String getStringDayOfWeek(DayOfWeek dayOfWeek){
        switch (dayOfWeek) {
            case MONDAY:return "Monday";
            case TUESDAY:return "Tuesday";
            case WEDNESDAY:return "Wednesday";
            case THURSDAY:return "Thursday";
            case FRIDAY:return "Friday";
            case SATURDAY:return "Saturday";
            case SUNDAY:return "Sunday";
        }
        return "";
    }

    public DayOfWeek getDayOfWeekString(String string) {
        switch (string){
            case "Monday": return DayOfWeek.MONDAY;
            case "Tuesday": return DayOfWeek.TUESDAY;
            case "Wednesday": return DayOfWeek.WEDNESDAY;
            case "Thursday":return DayOfWeek.THURSDAY;
            case "Friday":return DayOfWeek.FRIDAY;
            case "Saturday": return DayOfWeek.SATURDAY;
            case "Sunday": return DayOfWeek.SUNDAY;
        }
        return DayOfWeek.MONDAY;
    }
}
