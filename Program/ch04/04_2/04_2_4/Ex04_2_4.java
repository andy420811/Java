
class Ex04_2_4 {
   public static void main (String[] argv) {
     int in;

     in = 65;
     System.out.println("一般數值 = "+in);

     in = 'A';
     System.out.println("英文字母執行結果 = "+in);

     in = '中';
     System.out.println("中文字元執行結果 = "+in);

     in = '\u4E2D';
     System.out.println("Unicode執行結果 = "+in);

     in = 047055;
     System.out.println("八進位執行結果 = "+in);

     in = 0x4E2D;
     System.out.println("十六進位執行結果 = "+in);

     in = '\0';
     System.out.println("特殊字元執行結果 = "+in);
    }
}

       