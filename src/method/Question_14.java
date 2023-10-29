


// print the positive number always when user enter any number by method

package method;
import java.util.Scanner;
public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(number(num));
    }

    public static int number(int n){
        if(n>0){
            return n;
        }
        else {
            return n*-1;
        }
    }
}
