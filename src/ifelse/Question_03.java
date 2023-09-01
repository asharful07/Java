
// Write a program to check a number is negative or positive

package ifelse;
import java.util.Scanner;
public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println(num+" is a negative number");
        }
        else {
            System.out.println(num+" is a positive number");
        }
    }
}
