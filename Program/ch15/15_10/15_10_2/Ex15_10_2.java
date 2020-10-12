import java.io.*;

class Ex15_10_2 {
    public static void main(String args[]) {
        File f = new File(".", "Ex15_10_2.java");

        System.out.println("exists = " + f.exists());  
        System.out.println("isDirectory = " + f.isDirectory());
        System.out.println("isFile = " + f.isFile());
        System.out.println("canRead = " + f.canRead());
        System.out.println("canWrite = " + f.canWrite());
   }
 }









 



