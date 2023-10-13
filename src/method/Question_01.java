

//Print the sum of 1 to 100 number using method

package method;
public class Question_01 {
    public static void main(String[] args) {
        System.out.println("The sum of 1 to 100 number is: "+sum());
    }

    public static int sum(){
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        return sum;
    }
}
