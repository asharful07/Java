
// Write a program to check a number is Divisible by 3 & 5

package ifelse;
import java.util.Scanner;
public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if((num%3==0) && (num%5==0)){
            System.out.println(num+" is divisible by : 3 & 5 ");
        }
        else {
            System.out.println(num+" is not divisible by : 3 & 5");
        }

    }
}
