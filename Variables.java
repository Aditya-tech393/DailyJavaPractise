public class Variables {
    public static void main(String [] args){
        byte num1=10;
        short num2=15;
        int num3=5;
        long sum=(num1+num2+num3)*1000;
        System.out.println(sum);

        short sum1=(short)(1000*(num1+num2+num3));
        System.out.println(sum1);

        System.out.println(Short.MAX_VALUE);

        int a=10;
        float b=10.4f;
        System.out.println(a+b);
    }
}
