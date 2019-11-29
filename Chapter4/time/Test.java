public class Test {
    
    public static void main(String args[]) {
        Time t_time = new Time((long) 0, (long) 1, (long) 2);
        
        // getTimeInSeconds()
        System.out.println(t_time.getTimeInSeconds());

        // setTime()
        t_time.setTime((long) 123);
        System.out.println(t_time.toString());

        // Getter
        t_time.setTime((long) 7262);
        System.out.println("" + t_time.getHour() + ":" + t_time.getMinute() + ":" + t_time.getSecond());

        // toString()
        System.out.println(t_time.setTime((long) 222));
    }
}