//Convert the temperature Celsius to Fahrenheit

package ifelse;
import java.util.Scanner;
public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius: ");
        float celcius = sc.nextInt();
        float fahrenheit = ((celcius * 1.8f)+32);
        System.out.println("in celcius : "+celcius);
        System.out.println("in Fahrenheit :"+fahrenheit);

    }
}
