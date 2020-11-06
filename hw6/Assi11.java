class Assi11{
    public static void main(String[] args) {
        char[][]ch3 = {{'張','林','古'},{'陳','李'}};
        String [][] str = {{"圓圓","OO"},{"圈圈","洞洞","靈活"}};
        System.out.println(ch3[1][0] + str[0][0] + "漂亮" + "\\" + "陳" + str[1][2] + "快樂^v^");
        System.out.println(String.format("{0}{1}漂亮\\陳{2}快樂^v^", ch3[1][0],str[0][0],str[1][2]));
    }
}   