
class Ex06_4_5 {
    public static void main (String[] argv) {
      int a, b;
 
L1:  b=1;  
      for(a=1; a<=5; a++) {
         if(a==3)
            break L1;
         System.out.println("a = : " + a);
      }
    }
 }
