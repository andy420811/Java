import java.net.*;
import java.io.*;

public class Ex10_3_1 {
  ServerSocket  SS; 

  public Ex10_3_1() throws IOException {
         SS = new ServerSocket(1234);
         System.out.println("Server created.");
  }

  public static void main(String args[]) throws IOException{
         Ex10_3_1 ServerStart=new Ex10_3_1();
  }
}
