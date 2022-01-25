package Lab2;

public class timeDisplay {
    public static void main(String[] args)
    {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long totalMinutes = totalSeconds/60;
        long totalHours = totalMinutes/60;
        String currentTime = String.format("Current time is: %d:%d:%d GMT",(totalHours%24),(totalMinutes%60),(totalSeconds%60));
        System.out.println(currentTime);

    }
}
