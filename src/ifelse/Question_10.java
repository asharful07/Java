
//write a java Program to print the week days

package ifelse;
import java.util.Scanner;
public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Day: ");
        int day=sc.nextInt();
        if(day==1){
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Please Enter Day between 1 to 7:");
        }


    }

    }

