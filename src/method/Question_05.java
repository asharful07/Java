

// Calculate the greater number between user input number

package method;
import java.util.Scanner;
public class Question_05 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("The Greater number is: " +greaterNumber(num1,num2));
        }
        public static int greaterNumber(int n1,int n2){
            return Math.max(n1, n2);
        }
    }


