

//Write a Java method to check whether every digit of a given integer is even. Return true if every digit is odd otherwise false.

package method;
import java.util.Scanner;
public class Question_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(even(num));
    }
    public static int even(int n){
        int flag;
        int result=0;
        for(int i=n;i!=0;i=i/10){
            flag=i%10;
            if(flag%2==0){
                result=1;
            }
            else {
                result=0;
                break;
            }
        }
        return result;
    }
}
