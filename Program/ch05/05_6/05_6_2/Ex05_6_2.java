
class Ex05_6_2 {
    public static void main (String[] argv) {
       int a;

       a = 3;
       System.out.println("測試 (true && (++a > 0)) = "+ (true && (++a > 0)));
       System.out.println("測試是否有執行 ++a： "+ a);

       a = 3;
       System.out.println("測試 (false && (++a > 0)) = "+ (false && (++a > 0)));
       System.out.println("測試是否有執行 ++a： "+ a);


       a = 3;
       System.out.println("測試 (true || (++a > 0)) = "+ (true || (++a > 0)));
       System.out.println("測試是否有執行 ++a： "+ a);

       a = 3;
       System.out.println("測試 (false || (++a > 0)) = "+ (false || (++a > 0)));
       System.out.println("測試是否有執行 ++a： "+ a);
     }
 }
       