
class Ex04_3_2_2_1 {
     public static void main(String[] args) {
	int[][] a; 

	a = new int[2][];

        a[0] = new int[2];
        a[1] = new int[3];

        a[0][0] = 10;
        a[0][1] = 20;
        a[1][0] = 30;
        a[1][1] = 40;
        a[1][2] = 50;

        System.out.println("a[0][0] = "+a[0][0]);
        System.out.println("a[0][1] = "+a[0][1]);
        System.out.println("a[1][0] = "+a[1][0]);
        System.out.println("a[1][1] = "+a[1][1]);
        System.out.println("a[1][2] = "+a[1][2]);
       }
}
