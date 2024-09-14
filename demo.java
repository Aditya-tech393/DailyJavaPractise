class A {
    int a = 10;
    static int b = 20;
}

public class demo {

    public static void main(String[] args) {
        A a = new A();

        a.a = 30;
        a.b = 40; // static varible can be modified ,

        A a1 = new A();
        A a2= new A();

        a1.a = 80;
        a1.b = 60;

        a2.a = 70;
        a2.b = 4;


        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a2.a);
        System.out.println(a2.b);
    }
}
