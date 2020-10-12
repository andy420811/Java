class Ass_2 {
    public static void main(String[] args) {
        int i = 65;
        char k = (char)i; 
        /*此則為範例九和範例十二之差別，一個使用int另一使用char作為變數的type，主要差別為
          二變數之所佔空間不同，儲存方式仍是以數字儲存
        */
        
        System.out.println("(char)"+Character.SIZE+" vs (int)" +Integer.SIZE);
        System.out.printf("%c%c\n",'\u53f0','\u7063');
        System.out.printf("%c%c\n",'\u4e2d','\u3042');
    }    
}
