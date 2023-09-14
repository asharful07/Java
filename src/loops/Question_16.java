
// print the fibonacci series

package loops;
import java.util.Scanner;
public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How much term you want to print: ");
        int num = sc.nextInt();
        int n;
        int n1=0;
        int n2=1;
        for(int i=1;i<=num;i++){
            if(i==1){
                System.out.print(n1+" ");
            }
            else if (i==2){
                System.out.print(n2+" ");
            }
            else {
                System.out.print((n1+n2)+" ");
                n=n1;
                n1=n2;
                n2=n+n1;
            }
        }

    }
}
