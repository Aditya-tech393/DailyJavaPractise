class Parent {
     void show(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child Class");
    }
}
public class Main{
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.show();
        Parent obj1=new Child();
        obj1.show();
//        obj1.show(19);

    }
}
