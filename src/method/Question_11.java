

// Check the given digit is a complete phone number or not by using method

package method;
import java.util.Scanner;
public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit number: ");
        int num = sc.nextInt();
        if(checker(num)==10){
            System.out.println("complete phone digit Number!");
        }
        else {
            System.out.println("Not a complete phone digit Number!");
        }
    }
    public static int checker (int num){
        int count=0;
        for(int i =num;i!=0;i=i/10){
            int flag = i%10;
            count++;
        }
        return count;
    }
}
