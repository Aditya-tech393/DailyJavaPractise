public class Overloading {
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sum(int a, double b){
        System.out.println(a+b);
    }

    public static void sum(int... i){
        int total = 0;

        for (int a =0; a < i.length; a++  ){
            total += i[a];
            System.out.println(total);
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        sum(1);
    }
}
