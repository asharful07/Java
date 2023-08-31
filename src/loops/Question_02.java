
// calculate the sum of even number between 1 to 100

package loops;
public class Question_02  {
    public static void main(String[] args) {
        int num = 100;
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
            sum=sum+i;
            }
        }
        System.out.println("The sum of all 100 number is = "+sum);
    }
}
