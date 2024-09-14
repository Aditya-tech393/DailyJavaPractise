public class If_else {
    public static void main (String []args){
        int student_score=65;

        if (student_score==100){
            System.out.println("You scored A++ grade");
        }
        else if(student_score>=90 && student_score<100){
            System.out.println("You scored A+ grade");
        }
        else if(student_score>=80 && student_score<90){
            System.out.println("You scored A garde");
        }
        else if(student_score>=70 && student_score<80){
            System.out.println("You scored B grade");
        }
        else if(student_score>=60 && student_score<70){
            System.out.println("You scored C grade");
        }
        else{
            System.out.println("You are fail");
        }
    }
}
