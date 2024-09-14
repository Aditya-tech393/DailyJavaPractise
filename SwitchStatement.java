import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value between 1-5 : ");
        int switchValue=sc.nextInt();

        switch (switchValue){
            case 1:
                System.out.println("My value is 1");
                break;
            case 2:
                System.out.println("My value is 2");
                break;
            case 3:
                System.out.println("My value is 3");
                break;
            case 4:
                System.out.println("My value is 4");
                break;
            case 5:
                System.out.println("My value is 5");
                break;
            default:
                System.out.println("Invalid Value.");
                break;

        }

    }
}
