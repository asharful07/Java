

//Check the string is palindrome or not

package method;
public class Question_13 {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        if(checker(str,rev).equals(str)){
            System.out.println("Palindrome string!");
        }
        else {
            System.out.println("NOt a palindrome string!");
        }
    }
    public static String checker(String str, String rev){
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
