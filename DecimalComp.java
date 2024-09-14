public class DecimalComp {
    public boolean areEqualByFiveDecimalPlaces(double num1,double num2,double num3){
        num1=Math.round(num1*100000);
        num2=Math.round(num2*100000);
        num3=Math.round(num3*100000);
        return (num1==num2) && (num2==num3);
    }
    public static void main(String[] args) {
        DecimalComp obj=new DecimalComp();
        System.out.println(obj.areEqualByFiveDecimalPlaces(1.23456,1.23456,1.23456));

    }
}
