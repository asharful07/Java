
// Write a program to Find the GCd of two number

package loops;
import java.util.Scanner;
public class Question_15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        int flag=1;
        for(int i=1;i<=num1;i++){
            if(num1%i==0 && num2%i==0){
                flag=i;
            }
        }
        System.out.println("The Gcd of "+num1+" and "+num2+" is: "+flag);
    }
}
