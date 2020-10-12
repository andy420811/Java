class Mynumber {
    int number;
}

class Ex04_3_1_1 {
     public static void main(String[] args) {
	int[] a; 
	Mynumber[] b;

	a = new int[2];
        a[0] = 10;
        a[1] = 20;
        System.out.println("a[0] = "+a[0]);
        System.out.println("a[1] = "+a[1]);

	b = new Mynumber[2];
        b[0] = new Mynumber();
        b[1] = new Mynumber();
        b[0].number = 30;
        b[1].number = 40;
        System.out.println("b[0].number= "+b[0].number);
        System.out.println("b[1].number= "+b[1].number);
       }
}
