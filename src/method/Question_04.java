

//Print the Table of a user number using Method

package method;
import java.util.Scanner;
public class Question_04 {
    public static void main(String[] args) {
        System.out.print("Enter a number You want to print his table: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        table(num);
    }
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
