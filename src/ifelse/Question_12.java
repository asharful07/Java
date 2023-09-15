

// Write a program take input of age of 2 People by user and Determine oldest and youngest among them

package ifelse;
import java.util.Scanner;
public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age for 1st person: ");
        int age1 = sc.nextInt();
        System.out.print("Enter age for 2nd person: ");
        int age2 = sc.nextInt();
        if(age1>age2){
            System.out.println("1st person is oldest: "+age1);
            System.out.println("2nd person is youngest: "+age2);
        } else {
            System.out.println("1st person is oldest: "+age2);
            System.out.println("1st person is youngest: "+age1);

        }

    }
}
