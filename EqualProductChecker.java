public class EqualProductChecker {
    public boolean hasEqualProduct(int num1,int num2,int num3){
        if (num1*num2==num3){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        EqualProductChecker obj=new EqualProductChecker();
        boolean res=obj.hasEqualProduct(2,3,6);
        System.out.println(res);
    }
}
