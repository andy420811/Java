import java.util.*;
import java.io.IOException;
public class menu {
    public static void main(String[] args) throws InterruptedException {
        int key;
        String a[] = {"","",""};
        int count[] = {0,0,0};
        Scanner in = new Scanner(System.in);
        prt(a);
        while(true){
            try {
                while(in.hasNext()){
                    key = in.nextInt();
                    if(key>3||key<1)break;
                    for(int j = count[key - 1]*key;j > 0; j--){
                        java.awt.Toolkit.getDefaultToolkit().beep();
                        Thread.sleep(500);
                    }
                    clearScreen();
                    int i = count[key - 1];
                    switch(key){
                        case 1:
                            for(;i>0;i--) a[key - 1] += "\t";
                            a[key - 1] += count[key - 1] > 0?1:(count[key - 1]*1);
                            prt(a);
                            break;
                        case 2:
                            for(;i>0;i--) a[key - 1] += "\t";
                            a[key - 1] += count[key - 1] > 0?1:(count[key - 1]*2);
                            prt(a);
                            break;
                        case 3:
                            for(;i>0;i--) a[key - 1] += "\t";
                            a[key - 1] += count[key - 1] > 0?1:(count[key - 1]*3);
                            prt(a);
                            break;
                    }
                    count[key - 1]++;
                }
                in.close();
            } catch (Exception e) {
                System.out.println("Please enter the number between 1~3");
            }
        }
    }
    public static void prt(String [] a){
        System.out.println("\tNCKU");
        System.out.println("1." + a[0]);
        System.out.println("2." + a[1]);
        System.out.println("3." + a[2]);
    }
    public static void clearScreen() throws IOException {  
   //     System.out.print("\033[H\033[2J");
        Runtime.getRuntime().exec("cls");
        System.out.flush();  
    }  
    
}
