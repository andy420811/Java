import java.net.*;
import java.io.*;

public class Ex10_2_1_2 {
  ServerSocket  SS; 

  public Ex10_2_1_2() {
     try{
         SS = new ServerSocket(1234);
         System.out.println("Server created.");
      }
      catch(IOException e){
           System.out.println(e.getMessage());
      }		
  }

  public static void main(String args[]){
         Ex10_2_1_2 ServerStart=new Ex10_2_1_2();
  }
}
