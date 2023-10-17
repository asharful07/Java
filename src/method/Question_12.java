

// Find the negative number in given array

package method;
public class Question_12 {
    public static void main(String[] args) {
        int []arr= {10,20,30,40,-50,60};

        System.out.println("The negative element is : "+checker(arr));
    }
    public static int checker(int[] arr){
        int result = 0;
        System.out.println("Given array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr){
            if(i<0){
                result=i;
            }
        }
        return result;
    }
}
