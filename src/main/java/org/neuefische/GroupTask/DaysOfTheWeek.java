package org.neuefische.GroupTask;

public enum DaysOfTheWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);
    private boolean isWeekend;
    DaysOfTheWeek(boolean weekend) {
        isWeekend = weekend;
    }
    public String isWeekend() {
        if(isWeekend){
            return "Weekend";
        }
        else{
            return "Monday";
        }
    }
}
