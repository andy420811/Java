public class Ass_3 {
    public static void main(String[] args) {
        String s = "0100111101101000001000010010000001001001001000000100110001101111011101100110010100100000010110010110111101110101";
        String str = "";
        for (int i = 0; i < s.length()/8; i++) {
            int a = Integer.parseInt(s.substring(8*i,(i+1)*8),2);
            str += (char)(a);
        }
        System.out.println(str);
    }
}
