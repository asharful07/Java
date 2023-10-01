
// Enter age and check you are eligible for vote

package ifelse;
import java.util.Scanner;
public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are Eligible for vote: ");
        }
        else {
            System.out.println("Not Eligible For Vote: ");
        }
    }
}

