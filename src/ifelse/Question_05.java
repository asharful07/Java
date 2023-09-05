
// W rite a Java Program to check whether a given number is divisible by 11 or not

package ifelse;
import java.util.Scanner;
public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 11 == 0) {
            System.out.println(num + " is a divisor of 11 ");
        } else {
            System.out.println(num + " is not a divisor of 11");
        }
    }
}

