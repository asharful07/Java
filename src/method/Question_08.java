

//Define a method to find out if number is prime or not.

package method;
import java.util.Scanner;
public class Question_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(isPrime(num)==0){
            System.out.println("Not a prime");
        }
        else {
            System.out.println("Prime number");
        }
    }
    public static int isPrime(int n){
        int flag = 1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=0;
                break;
            }
        }
        return flag;
    }
}
