public class StudentGrade {

    public static void std_name(String name){
        System.out.println("The name of the student is "+name);
    }

    public static void calc_grade(int marks){
        if (marks==100){
            System.out.println("You scored A++ grade");
        }
        else if(marks>=90 && marks<100){
            System.out.println("You scored A+ grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("You scored A garde");
        }
        else if(marks>=70 && marks<80){
            System.out.println("You scored B grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("You scored C grade");
        }
        else{
            System.out.println("You are fail");
        }

    }
    public static void main (String []args){
        std_name("Alexa");
        System.out.print("Grade :");
        calc_grade(65);

    }
}
