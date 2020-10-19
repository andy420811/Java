import java.io.*;
import java.util.*;

class Ex15_10_4 {
    public static void main(String args[]) {
        File f = new File(".", "Ex15_10_4.java");
        System.out.println("lastModified Second = " + f.lastModified());  
        System.out.println("length = " + f.length());

        Date d = new Date(f.lastModified());
        System.out.println("lastModified Year = " + (d.getYear()+1900)); 
        System.out.println("lastModified Month = " + d.getMonth()); 
        System.out.println("lastModified Date = " + d.getDate()); 
        System.out.println("lastModified Hours = " + d.getHours()); 
        System.out.println("lastModified Minutes = " + d.getMinutes()); 
    }
 }









 



