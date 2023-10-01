

// Find the area of Rectangle

package ifelse;
import java.util.Scanner;
public class Qusetion_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter the Width of Rectangle: ");
        float width = sc.nextFloat();
        float area = width*length;
        System.out.println("The area of Rectangle is: "+area);
    }
}
