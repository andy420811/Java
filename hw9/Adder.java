public class Adder{
    String S;
    int i;
    public String getStr() {
        return S;
    }
    public Adder(){};
    public Adder(String a,String b) {
        S = a + b;
    }
    public static String AddStr(String a,String b) {
        return a + b;
    }
    public Adder(int a,float b) {
        i = a + (int)b;
    }
    public static int Add_int(int a,float b){
        return a + (int)b;
    }
    public static float Add_float(float a,int b) {
        return a + (float)b;
    }
    public static int A(int a){
        return a += 5;
    }
    public static float[] Add_Metrix(float[] a,float[] b){
        float [] c = new float [9];
        for(int i = 0;i < 9; i++){
            c[i] = a[i] + b[i];
        }
        return c;
    }
    public static float[] Add_Polynomial(float[] a,float[] b,int num){
        float[] coeifficient = new float[num];
        for(int i = 0;i < num; i++){
            coeifficient[i] = a[i] + b[i];
        }
        return coeifficient;
    }
    public static float[] Add_Complex_3D(float complex1[],float complex2[]){
        float[] complex = new float[3];
        complex[0] = complex1[0] + complex2[0];
        complex[1] = complex1[1] + complex2[1];
        complex[2] = complex1[2] + complex2[2];
        return complex;
    }   
    public static float[] Add_Complex_2D(float complex1[],float complex2[]){
        float[] complex = new float[2];
        complex[0] = complex1[0] + complex2[0];
        complex[1] = complex1[1] + complex2[1];
        return complex;
    }
    public static int Add_int(byte a,byte b){
        return a + b;
    }
    public static int Add_int(short a,short b){
        return a + b;
    }
    public static long Add_int(long a,long b){
        return a + b;
    }
    public static int Add_int(int a,int b){
        return a + b;
    }
    public static void PrtMetrix(float[] Metrix){
        for(int i = 0; i < 9;i++){
            if(i % 3 == 0) System.out.print("|");
            System.out.print(" " + Metrix[i] + " ");
            if(i % 3 == 2){ 
                System.out.print("|");
                System.out.println();
            }
        }
    }
    public static void PrtPoly(float[] Poly) {
        for(int i = Poly.length - 1; i > 0; i--){
            System.out.print(Poly[i] + "^" + i + " + ");
        }
        System.out.println(Poly[0]);
    }
    public static void PrtComplex(float[] complex){
        if(complex.length == 3){
            System.out.println(complex[0]+"i + " + complex[1] + "j + " + complex[2] + "k");
        }else if(complex.length == 2){
            System.out.println(complex[0]+"i + " + complex[1] + "j");
        }
    }
}