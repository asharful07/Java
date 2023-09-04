
// Write a program to print Fibonacci series up to n terms

package loops;
import java.util.Scanner;
public class Question_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of term of Fibonacci  series: ");
        int num = sc.nextInt();
        int n;
        int n1=0;
        int n2=1;
        for(int i=0;i<num;i++){
            if(i==0){
                System.out.print(n1+" ");
            }
            else if(i==1){
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
