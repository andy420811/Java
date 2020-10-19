import myPackage.MyNumber;

class E extends MyNumber {}  

public class Ex11_5 {
      public static void main(String[] args) {
      E a = new E();
		
      a.setNumber(5);
      System.out.println("a=: "+a.getNumber());
      }
}
