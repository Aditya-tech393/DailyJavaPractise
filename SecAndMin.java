import java.util.Scanner;

public class SecAndMin {
    public static String getDurationString(long minutes,long seconds){
        if (minutes<0 || seconds <0 || seconds>59){
            return "Invalid Value";
        }
        long hours=minutes/60;
        long remainingMinutes=minutes%60;
        return hours +"h "+remainingMinutes+"m "+seconds+"s.";
    }
    public static String getDurationString(long seconds){
        if (seconds<0){
            return "Invalid Vslue";
        }
        long minutes= seconds/60;
        long remainingSeconds=seconds%60;
        return minutes+"m "+remainingSeconds+"s. ";

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(getDurationString(75,50));
        System.out.println(getDurationString(115));

    }
}
