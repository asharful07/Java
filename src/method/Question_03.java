
//Calculate the sum of all Even number from 1 to 100 using Method

package method;
public class Question_03 {
    public static void main(String[] args) {
        System.out.println(evenSum());
    }
    public static int evenSum(){
        int sum=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}
