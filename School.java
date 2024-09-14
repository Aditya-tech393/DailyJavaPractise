public class School{
    private String student_name;
    private String roll_no;
    private String std;
    private String section;

    public String student_name() {
        return student_name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public String getStd() {
        return std;
    }

    public String getSection() {
        return section;
    }

    public School(){
        this("DefName","0000","X","c");
    }

    public School(String student_name, String roll_no) {
        this(student_name,roll_no,"IX","B");
    }

    public School(String student_name, String roll_no, String std, String section) {
        this.student_name = student_name;
        this.roll_no = roll_no;
        this.std = std;
        this.section = section;
    }

    public static void main(String[] args) {
        School obj=new School();
        School obj2=new School("Std2name","Sts2rollno");
        School obj3=new School("Std3name","Std3rollno","Std3std","Std3sec");

        System.out.println(obj3.student_name());
        System.out.println(obj3.getSection());
    }
}
