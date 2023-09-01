
// Write a java program to print the all odd number between 1 To 100

package loops;
public class Question_05 {
    public static void main(String[] args) {
        int num = 100;
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.println("The sum of all odd number between 1 to 100 is = "+sum);
    }
}
