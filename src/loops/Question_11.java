
// Write a program to find the Strong number between 1 To 1000

package loops;
public class Question_11 {
    public static void main(String[] args) {
        int fact;
        int sum;
        int result ;
        System.out.println("The strong Number between 1 To 1000 are : ");
        for(int i=1;i<=1000 ;i++){
            sum=0;
            for(int j=i;j!=0;j=j/10){
                fact =j%10;
                result=1;
                for(int k=1;k<=fact;k++){
                    result=result*k;
                }
                sum=sum+result;
            }
            if(sum==i) {
                System.out.print(sum + " ");
            }
        }
    }
}
