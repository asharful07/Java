
// Swap the Digits of a number

package loops;
import java.util.Scanner;
public class Question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result ;
        int rev=0;
        for(int i = num; i!=0;i=i/10){
            result = i%10;
            rev = (rev*10)+result;
        }
        System.out.println("Original number: "+num);
        System.out.print("Reverse number: "+rev);
    }
}
