
// crete a cellphone class and make a method to print "ringing" and "Vibrating"

package Oops;
class cellphone {
    public void ring() {
        System.out.println("Ringing.....");
    }
    public void vibrate() {
        System.out.println("Vibrating.....");
    }
    public static class Question_02 {
        public static void main(String[] args) {
            cellphone obj = new cellphone();
            obj.ring();
            obj.vibrate();
        }
    }
}