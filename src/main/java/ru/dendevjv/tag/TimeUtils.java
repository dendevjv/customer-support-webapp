package ru.dendevjv.tag;

public class TimeUtils {
    public static String intervalToString(long timeInterval) {
        if (timeInterval < 1_000) {
            return "less than one second";
        } else if (timeInterval < 60_000) {
            return (timeInterval / 1_000) + " seconds";
        } else {
            return "about " + (timeInterval / 60_000) + " minutes";
        }
    }
}
