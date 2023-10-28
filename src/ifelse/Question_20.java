

//Calculate the total number of repeating digit in user enter number

package ifelse;
import java.util.Scanner;
public class Question_20 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number:");
                int num = scanner.nextInt();
                int count = 0;
                String strNum = Integer.toString(num);
                for (int i = 0; i < strNum.length(); i++) {
                    for (int j = i + 1; j < strNum.length(); j++) {
                        if (strNum.charAt(i) == strNum.charAt(j)) {
                            count++;
                            break;
                        }
                    }
                }
                System.out.println("The total number of repeating digits in the given number is " + count);
            }
        }



