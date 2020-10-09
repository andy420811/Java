class Ass_1{
    public static void main(String[] args) {
        String code = "Oh! I Love You";    //enter the charcter to convert to ascii and 2bit format
        System.out.println(code);
        int [] ascii = new int [50];
        String sequence = "";
        String _2bitdisplay = "";
        for(int i = 0;i<code.length();i++){
           ascii[i] = (int)(code.charAt(i));   //get each char's ascii code in String code "Oh! I Love You"
        }
        for(int k=0;k<code.length();k++){
            for(int i = 0x80;i>0;i>>=1){
               sequence += String.valueOf((i&ascii[k])>0?1:0);   //get each ascii's 2bit format
               _2bitdisplay += String.valueOf((i&ascii[k])>0?1:0);
            }
            System.out.printf("%c = ascii(%d) = 2bit(%s)\n",code.charAt(k),ascii[k],_2bitdisplay);   //display result
            _2bitdisplay = "";
        }
        System.out.print("\n"+sequence);

    }
}