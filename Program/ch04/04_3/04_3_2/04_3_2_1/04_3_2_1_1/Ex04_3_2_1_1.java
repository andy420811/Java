class Mynumber {
    int n;
}

class Ex04_3_2_1_1 {
     public static void main(String[] args) {
	int[][] a; 
	Mynumber[][] b;

	a = new int[2][2];
        a[0][0] = 10;
        a[0][1] = 20;
        a[1][0] = 30;
        a[1][1] = 40;
        System.out.println("a[0][0] = "+a[0][0]);
        System.out.println("a[0][1] = "+a[0][1]);
        System.out.println("a[1][0] = "+a[1][0]);
        System.out.println("a[1][1] = "+a[1][1]);

	b = new Mynumber[2][2];
        b[0][0] = new Mynumber();
        b[0][1] = new Mynumber();
        b[1][0] = new Mynumber();
        b[1][1] = new Mynumber();
        b[0][0].n = 50;
        b[0][1].n = 60;
        b[1][0].n = 70;
        b[1][1].n = 80;
        System.out.println("b[0][0].n = "+b[0][0].n);
        System.out.println("b[0][1].n = "+b[0][1].n);
        System.out.println("b[1][0].n = "+b[1][0].n);
        System.out.println("b[1][1].n = "+b[1][1].n);
       }
}
