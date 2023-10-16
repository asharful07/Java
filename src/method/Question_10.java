

//  check the user enter number is negative or positive by using method

package method;
import java.util.Scanner;
public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        if(checker(num)==1){
            System.out.print("Positive number!");
        }
        else {
            System.out.print("Negative number!");
        }
    }
    public static int checker(int n){
        if(n>0){
            return 1;
        }
        else {
            return 0;
        }
    }
}
