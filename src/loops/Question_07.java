
// find the factorial of any number

package loops;
import java.util.Scanner;
public class Question_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("The number is = "+num);
        System.out.println("The factorial of "+num+" is"+" = "+fact);
    }
}
