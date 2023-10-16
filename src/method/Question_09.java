

// multiply the user number's using method

package method;
import java.util.Scanner;
public class Question_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        System.out.println("The multiplication of these two number is: "+mul(a,b));
    }
    public static int  mul(int n,int m){
        return n*m;
    }
}
