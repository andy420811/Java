public class Beep {
    public static void main(String[] args)throws InterruptedException{
        for(int i=0;i<3;i++){
        System.out.println("Beep : " + i);
        java.awt.Toolkit.getDefaultToolkit().beep();
        Thread.sleep(300);
        }
        
    }
}
