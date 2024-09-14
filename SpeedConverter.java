import java.util.Scanner;

public class SpeedConverter {
    public void printMegaBytes(double kiloBytes){
        double megabytes=kiloBytes/1024;
        System.out.println("Your data speed in MegaBytes is : "+megabytes);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data speed in kiloBytes : ");
        double speed_kb=sc.nextDouble();
        SpeedConverter to_mb=new SpeedConverter();
        to_mb.printMegaBytes(speed_kb);

    }
}
