import java.io.*;

class Ex12_7_2 {
   
   /** 
    * @param args[]
    * @throws Exception
    */
   public static void main(String args[]) throws Exception  {
      if (args.length < 1) {
         System.out.println("Usage: java Ex12_7_2 [fileName]");
         System.exit(1);
      }
	  
      String fileName = args[0];
      FileWriter fw=new FileWriter(fileName);

      String line = "Test for FileWriter ����FileWriter������";

      fw.write(line);
      fw.flush();
   }
}   