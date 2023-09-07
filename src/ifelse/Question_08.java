
// Java Program to check whether a person is valid for vote or not

package ifelse;
import java.util.Scanner;
public class Question_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(age>17){
            System.out.println("you are eligible for vote");
        }
        else {
            System.out.println("you are not eligible for vote ");
        }
    }
}
