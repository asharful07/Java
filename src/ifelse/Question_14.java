
// Write a program to check number is odd or even

package ifelse;
import java.util.Scanner;
public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even number");
        }
        else {
            System.out.println(num+" is a odd number");
        }

    }
}
