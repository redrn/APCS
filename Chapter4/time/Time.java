public class Time {
    
    // Store the time since midnight(00:00:00)
    private long hours;
    private long minutes;
    private long seconds;
    

    Time(long hours, long minutes, long seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public long getHour() {
        return hours;
    }


    public long getMinute() {
        return minutes;
    }


    public long getSecond() {
        return seconds;
    }


    public Time setTime(long timeInSeconds) {
        hours = timeInSeconds / 3600;
        minutes = timeInSeconds % 3600 / 60;
        seconds = timeInSeconds % 3600 % 60;
        return this;
    }
    

    public long getTimeInSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }
    

    public String toString() {
        return "" + hours + ":" + minutes + ":" + seconds;
    }
}