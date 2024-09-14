import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> student=new ArrayList(8);

        student.add(1);
        student.add(2);
        student.add(3);
        student.add(4);
        student.add(5);
        student.add(6);
        student.add(7);
        student.add(8);
        student.add(9);
        student.add(10);
        student.add(11);

//        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//
//        System.out.println(arr[0]);
//
//        for (int i =0; i<=arr.length;i++){
//            int sum=0;
////            System.out.println(sum);
////            System.out.println(i+'i');
//            System.out.println(sum+=i);
//
//        }

        System.out.println(student);
        System.out.println(student.size());
    }
}
