
// Write a program to check a number is Strong or not

package loops;
import java.util.Scanner;
public class Question_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact;
        int sum=0;
        for(int i=num;i!=0;i=i/10){
            fact =i%10;
           int result=1;
            for(int j=1;j<=fact;j++){
                result=result*j;
            }
            sum=sum+result;
        }
        if(sum==num){
            System.out.println(num+" is a Strong number!");
        }
        else {
            System.out.println(num+" is not a Strong number!");
        }

    }
}
