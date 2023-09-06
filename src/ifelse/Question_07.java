
// Write a program to check the number is digit or not

package ifelse;
import java.util.Scanner;
public class Question_07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num>9 || num < -9){
            System.out.println(num+" is a digit number");
        }
        else {
            System.out.println(num+" is not a digit number");
        }
    }
}
