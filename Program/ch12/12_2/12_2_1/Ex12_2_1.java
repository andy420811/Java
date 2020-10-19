public class Ex12_2_1 {
     static String msg;
     
     Ex12_2_1() {
        System.out.println(msg);
     }

     public static void main(String[] args) {
        msg = args[0];
        Ex12_2_1 a = new Ex12_2_1();
     }
}
