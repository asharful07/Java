
// Write a program to check the year is leap year or not

package ifelse;
import java.util.Scanner;
public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }
    }
}
