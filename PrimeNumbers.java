import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the end sequence: ");
        int end_num=sc.nextInt();
        int count=0;
        for (int i=2;i<=end_num;i++){
            if (end_num%i==0){
                count++;
            }
        }
        if (count==0){
            System.out.println("Prime Number.");
        }
        else {
            System.out.println("Not Prime Number.");
        }
    }
}
