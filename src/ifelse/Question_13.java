
// Write a program to swap the number's 

package ifelse;
import java.util.Scanner;
public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int c=0;
        System.out.print("Before swapping value's: ");
        System.out.print(a+" ");
        System.out.println(b);
        System.out.print("After swapping value's: ");
        c=a;
        a=b;
        b=c;
        System.out.print(a+" ");
        System.out.print(b);
    }
}
