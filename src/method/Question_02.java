

//Calculate the factorial of user number using Method

package method;
import java.util.Scanner;
public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
    public static int fact(int n){
        int flag=1;
        for(int i=1;i<=n;i++){
            flag*=i;
        }
        return flag;
    }

}
