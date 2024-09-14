import java.util.Scanner;

public class PythagoranTriplet {
    public void CalcTriplet(int a,int b,int c){
        int a_sq=a*a;
        int b_sq=b*b;
        int c_sq=c*c;
        if (a_sq+b_sq==c_sq){
            System.out.println(a_sq+" + "+b_sq+" = "+c_sq+" Pythagoran Triplets");
        }
        else {
            System.out.println(a_sq+" + "+b_sq+" != "+c_sq+" Not Pythagoran Triplets");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2=sc.nextInt();
        System.out.println("Enter number 3 : ");
        int num3=sc.nextInt();
        PythagoranTriplet obj=new PythagoranTriplet();
        obj.CalcTriplet(num1,num2,num3);
    }
}
