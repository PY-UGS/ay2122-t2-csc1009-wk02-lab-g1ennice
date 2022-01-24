public class Question3Lab2 
{
    public static void main(String arg[])
    {
        double totalMilliseconds = System.currentTimeMillis();
        double totalSeconds = totalMilliseconds/1000;
        int currentSeconds = (int)totalSeconds%60;
        double totalMinutes = totalSeconds/60;
        int currentMinute = (int)totalMinutes%60;
        double totalHours = totalMinutes/60;
        int currentHours = (int) totalHours %24;

        System.out.println("Current time is " + currentHours + ":" + currentMinute + ":" + currentSeconds + " GMT");
    }
}