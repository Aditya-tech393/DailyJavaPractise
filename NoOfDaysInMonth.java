import java.util.Scanner;

public class NoOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 != 0);
    }
    public static void getDaysInMonths(int month,int year)
        {
            if (year<1000 && year>9999){
                System.out.println("Invalid Value");
            }
            switch (month){
                case 1 -> System.out.println("Month is Jan ");
                case 2 -> System.out.println("Month is Feb "+(isLeapYear(year)? "29 days":"28 days"));
                case 3 -> System.out.println("Month is Mar ");
                case 4 -> System.out.println("Month is Apr ");
                case 5 -> System.out.println("Month is May ");
                case 6 -> System.out.println("Month is Jun ");
                case 7 -> System.out.println("Month is Jul ");
                case 8 -> System.out.println("Month is Aug ");
                case 9 -> System.out.println("Month is Sep ");
                case 10 -> System.out.println("Month is Oct ");
                case 11 -> System.out.println("Month is Nov ");
                case 12 -> System.out.println("Month is Dec ");
                default -> System.out.println("Invalid Value    ");
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month.");
        int month=sc.nextInt();
        System.out.println("Enter year.");
        int year=sc.nextInt();
        getDaysInMonths(month,year);

    }
}
