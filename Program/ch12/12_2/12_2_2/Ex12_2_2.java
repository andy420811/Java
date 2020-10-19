public class Ex12_2_2 {
     static int num;
     
     Ex12_2_2() {
        num = num+1;
        System.out.println(num);
     }

     public static void main(String[] args) {
        num = Integer.parseInt(args[0]);
        Ex12_2_2 a = new Ex12_2_2();
     }
}
