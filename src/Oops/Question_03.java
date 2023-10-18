

// create a class square and make a method for calculating area and perimeter

package Oops;
class square{
    int side;
    public void  area(){
        System.out.println("The area of square is: "+(side*side));
    }
    public void perimeter(){
        System.out.println("The perimeter of  square is: "+(4*side));
    }
}
public class Question_03 {
    public static void main(String[] args) {
        square obj=new square();
        obj.side=5;
        obj.area();
        obj.perimeter();
    }
}
