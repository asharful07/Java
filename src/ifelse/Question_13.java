package ifelse;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total classes: ");
        int T_class = sc.nextInt();
        System.out.println("Enter attending classes: ");
        int A_classes = sc.nextInt();
        int  percentage = ((T_class/A_classes)*100);
        System.out.println("Your attendance: "+percentage);
        if(percentage>=75){
            System.out.print("You Allowed To sit in the Exam:");
        }
        else {
            System.out.print("You not  Allowed To sit in the Exam:");
        }
    }
}
