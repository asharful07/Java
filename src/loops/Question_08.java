
// write a program to check the given number is armstrong or not

package loops;
import java.util.Scanner;
public class Question_08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count=0;
        int result;
        int temp;
        int sum=0;
        for(int i=num;i!=0;i=i/10){
            count++;
        }
        for(int j=num;j!=0;j=j/10){
            result=j%10;
            temp=1;
            for(int k=1;k<=count;k++){
                temp=temp*result;
            }
            sum=sum+temp ;
        }
        if(num==sum){
            System.out.println(num+" is a armstrong  number ");
        }
        else {
            System.out.println(num+" is a not armstrong number ");
        }
    }
}
