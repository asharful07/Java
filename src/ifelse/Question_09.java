
//Java Program to print maximum among three numbers using

package ifelse;
import java.util.Scanner;
public class Question_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a 1st Number: ");
        int num1= sc.nextInt();
        System.out.print("Enter a 2nd Number: ");
        int num2= sc.nextInt();
        System.out.print("Enter a 3rd Number: ");
        int num3= sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" greater number");
        } else if (num2>num3) {
            System.out.println(num2+" greater number");
        } else if (num3>num1) {
            System.out.println(num3+" greater number");
        }
        else {
            System.out.println(" all equal number");
        }
    }
}
