
class Ex04_2_1 {
    public static void main (String[] argv) {
       char ch;

       ch = 'A'; 
       System.out.println("英文字母 = "+ch);

       ch = '\u0041';
       System.out.println("Unicode碼 = "+ch);

       ch = 65;
       System.out.println("ASCII十進位碼 = "+ch);

       ch = '中';
       System.out.println("中文字元 = "+ch);

       ch = '\u4E2D';
       System.out.println("中文Unicode碼 = "+ch);

       ch = 20013;
       System.out.println("中文十進位碼 = "+ch);

       ch = '\0';
       System.out.println("特殊字元之空字元 = "+ch);
      }
 }
       