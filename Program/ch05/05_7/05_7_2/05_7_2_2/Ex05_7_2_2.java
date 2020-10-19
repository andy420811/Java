
class Ex05_7_2_2 {
    public static void main (String[] argv) {
       int a, b;

       a = 4;
       b = a>>1;
       System.out.println("正數測試右移運算元 >>： "+ b);

       a = 4;
       b = a>>33;
       System.out.println("測試大於32位元之位移： "+ b);

       a = -4;
       b = a>>1;
       System.out.println("負數測試右移運算元 >>： "+ b);

       a = -4;
       b = a>>33;
       System.out.println("測試大於32位元之位移： "+ b);

       a = 4;
       b = a<<1;
       System.out.println("正數測試左移運算元 <<： "+ b);

       a = 4;
       b = a<<33;
       System.out.println("測試大於32位元之位移： "+ b);


       a = -4;
       b = a<<1;
       System.out.println("負數測試左移運算元 <<： "+ b);

       a = -4;
       b = a<<33;
       System.out.println("測試大於32位元之位移： "+ b);

     }
 }
       