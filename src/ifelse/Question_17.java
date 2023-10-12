

// WAP to Check you are Eligible for donate blood or not

package ifelse;
import java.util.Scanner;
public class Question_17 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your weight: ");
        int weight = sc.nextInt();
        if(age>=18 && weight>=50){
            System.out.println("you are eligible to Donate blood!");
        }
        else {
            System.out.println("you are not eligible to Donate blood!");
        }

    }
}
