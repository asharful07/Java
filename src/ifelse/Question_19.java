

// change all negative element into positive element

package ifelse;
public class Question_19 {
    public static void main(String[] args) {
        int []arr = {10,-20,30,-40,50,-60,70,-80,90,-100};
        System.out.println("Given array: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("After changing array: ");
        for(int i = 0;i< arr.length;i++){
            if(arr[i]<0){
                arr[i]=arr[i]*-1;
            }
            System.out.print(arr[i]+" ");
        }

    }
}
