

// check the result of student, he failed or pass in exam......

package ifelse;
import java.util.Scanner;
public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks of subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks of subject 3: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter marks of subject 4: ");
        int sub4 = sc.nextInt();
        System.out.print("Enter marks of subject 5: ");
        int sub5 = sc.nextInt();
        int percentage = (sub1+sub2+sub3+sub4+sub5)/5;
        if(percentage>=33){
            System.out.println("you passed! with percentage: "+percentage);
        }
        else {
            System.out.println("you failed! with percentage: "+percentage);
        }
    }
}
