
// Write a program to check a number is palindrome or not

package loops;
import java.util.Scanner;
public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result;
        int rev = 0;
        for(int i=num;i!=0;i=i/10){
            result = i%10;
            rev = (rev*10)+result;
        }
        if(rev==num){
            System.out.println(num+" is a palindrome number:");
        }
        else {
            System.out.println(num+" is not a palindrome number:");
        }
    }
}
