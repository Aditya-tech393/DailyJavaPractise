public class ConstructorEg {
    private int age;
    private String name;

    public ConstructorEg()     //Default cons
    {
        age=21;
        name="Alexa";
    }

    public ConstructorEg(int a,String n)    //parameterized cons
    {
        age=a;
        name=n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {


        ConstructorEg obj=new ConstructorEg();
        System.out.println("Default Cons->");
        System.out.println(obj.getName()+"   "+obj.getAge());


        ConstructorEg obj1=new ConstructorEg(25,"John");
        System.out.println("Para Cons->");
        System.out.println(obj1.getName()+"   "+obj1.getAge());


        System.out.println("Calling -> ");
        obj.setAge(22);
        obj.setName("Suraj");
        System.out.println(obj.getName()+"   "+obj.getAge());
    }
}
