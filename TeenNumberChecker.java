import java.util.Scanner;

public class TeenNumberChecker {
    public boolean hasNotTeen(int num1,int num2,int num3){
        if (num1 >=13 && num1<=19){
            return false;
        }
        else if (num2 >=13 && num2<=19){
            return false;
        }
        else if (num3 >=13 && num3<=19){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        TeenNumberChecker obj=new TeenNumberChecker();
        boolean res=obj.hasNotTeen(num1,num2,num3);
        System.out.println(res);
    }
}
