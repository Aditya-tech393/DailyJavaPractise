public class EvenSum {
    public boolean isEven(int number){
        if(number<0){
            return false;
        }
        if(number%2==0){
            return true;
        }
        return false;
    }

    public int sumEven(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(isEven(i)){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        EvenSum obj=new EvenSum();
        System.out.println(obj.isEven(9));
        System.out.println(obj.sumEven(1,10));
    }
}

