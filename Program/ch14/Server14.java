import java.net.*;
import java.io.*;

public class Server14 {
  ServerSocket  SS; 
  Socket  socket;
  static int  port;

  public Server14() {
     try{
         SS = new ServerSocket(port);
         System.out.println("Server created.");
         System.out.println("waiting for client to connect...");
			
         socket = SS.accept();
         System.out.println("connected from Client " +
                             socket.getInetAddress().getHostAddress());
         socket.close();
      }
      catch(IOException e){
           System.out.println(e.toString());
           e.printStackTrace();
           System.exit(1);
      }		
  }

  public static void main(String args[]){
         if(args.length < 1){
            System.out.println("Usage: java Server14 [port]");
            System.exit(1);
         }
         port=Integer.parseInt(args[0]);
         Server14 ServerStart=new Server14();
  }
}
