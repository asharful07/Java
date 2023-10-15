

// Write a Java method to compute the sum of digits in an integer.

package method;
import java.util.Scanner;
public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit number: ");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int n){
        int flag;
        int result=0;
        for(int i=n;i!=0;i=i/10){
            flag=i%10;
            result=result+flag;
        }
        return result;
    }
}
