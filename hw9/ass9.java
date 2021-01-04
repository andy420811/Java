import java.util.Scanner;
import java.io.IOException;
import java.util.*;
public class ass9 {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner s = new Scanner(System.in);
        int mode;
        String a,b;
        int c;
        float d;
        float[] mextrix1,mextrix2 = new float [9];
        float[] poly1,poly2;
        float[] complex1,complex2;
        boolean init = false;
        L1:while(true){
            if(init)Thread.sleep(2000);
            else init = true;
            System.out.println("Please enter the mode");
            System.out.println("1:string adder\n2:int adder\n3:float adder\n4:A++(a+=5)\n"+
                               "5:Matix adder\n6:Polynomial adder\n7:complex adder\n8:int adder\nq:exit");
            mode = (int)ReadNum(s);
            ClearScr();
            switch(mode){
                case 1:
                    System.out.println("Please enter the added string");
                    a = ReadStr(s);
                    System.out.println("Please enter the add string");
                    b = ReadStr(s);
                    System.out.println("String adder Result = "+ Adder.AddStr(a, b));
                    break;
                case 2:
                    System.out.println("Please enter an int");
                    c = (int)ReadNum(s);
                    System.out.println("Please enter a float");
                    d = ReadNum(s);
                    System.out.println("Int adder Result = "+ Adder.Add_int(c, d));
                    break;
                case 3:
                    System.out.println("Please enter a float");
                    d = ReadNum(s);
                    System.out.println("Please enter an int");
                    c = (int)ReadNum(s);
                    System.out.println("Float adder Result = "+ Adder.Add_float(d , c));
                    break;
                case 4:
                    System.out.println("Please enter an int");
                    c = (int)ReadNum(s);
                    System.out.println("A++ = "+ Adder.A(c));
                    break;
                case 5:
                    System.out.println("Enter metrix1");
                    mextrix1 = MetrixReader(s, 2);
                    System.out.println("Enter metrix2");
                    mextrix2 = MetrixReader(s, 2);
                    ClearScr();
                    System.out.println("Metrix adder Result = ");
                    Adder.PrtMetrix(Adder.Add_Metrix(mextrix1, mextrix2));
                    break;
                case 6:
                    System.out.println("Enter Polynomial1");
                    poly1 = PolyReader(s);
                    System.out.println("Enter Polynomial2");
                    poly2 = PolyReader(s);
                    ClearScr();
                    System.out.println("Poly adder Result = ");
                    Adder.PrtPoly(Adder.Add_Polynomial(poly1, poly2, Math.max(poly1.length,poly2.length)));
                    break;
                case 7:
                    System.out.println("1:2D complex adder\n2:3D complex adder\nother num:return");
                    switch((int)ReadNum(s)){
                        case 1:
                            System.out.println("Enter complex1");
                            complex1 = ComplexReader(s, 1);
                            System.out.println("Enter complex2");
                            complex2 = ComplexReader(s, 1);
                            System.out.println("Complex adder Result = ");
                            Adder.PrtComplex(Adder.Add_Complex_2D(complex1, complex2));
                            break;
                        case 2:
                            System.out.println("Enter complex1");
                            complex1 = ComplexReader(s, 2);
                            System.out.println("Enter complex2");
                            complex2 = ComplexReader(s, 2);
                            System.out.println("Complex adder Result = ");
                            Adder.PrtComplex(Adder.Add_Complex_3D(complex1, complex2));
                            break;
                        default:
                            break;
                    }
                    break;
                case 8:
                    System.out.println("1:Int adder(byte)\n2:Int adder(short)\n3:Int adder(int)\n4:Int adder(long)\nother:return");
                    switch((int)ReadNum(s)){
                        case 1:
                            System.out.println("Please enter first number");
                            byte g = (byte)ReadNum(s);
                            System.out.println("Please enter second number");
                            byte h = (byte)ReadNum(s);
                            System.out.println("Int adder(byte) Result = " + Adder.Add_int(g , h));
                            break;
                        case 2:
                            System.out.println("Please enter first number");
                            short sg = (short)ReadNum(s);
                            System.out.println("Please enter second number");
                            short sh = (short)ReadNum(s);
                            System.out.println("Int adder(short) Result = " + Adder.Add_int(sg , sh));
                            break;
                        case 3:
                            System.out.println("Please enter first number");
                            int ig = (int)ReadNum(s);
                            System.out.println("Please enter second number");
                            int ih = (int)ReadNum(s);
                            System.out.println("Int adder(int) Result = " + Adder.Add_int(ig , ih));
                            break;
                        case 4:
                            System.out.println("Please enter first number");
                            long lg = (long)ReadNum(s);
                            System.out.println("Please enter second number");
                            long lh = (long)ReadNum(s);
                            System.out.println("Int adder(long) Result = " + Adder.Add_int(lg , lh));
                            break;
                        default:
                            System.out.println("exit");
                            break;
                    }
                    break;
                case 0x80000000:
                    System.out.println("exit the process");
                    break L1;
                default:
                    System.out.println("please enter 1~8");
                    break;
            }
        }
    }
    private static float[] ComplexReader(Scanner s,int mode) throws IOException,InterruptedException{
        float[] complex = new float[3];
        System.out.println("Enter complex i coefficient");
        complex[0] = ReadNum(s);
        System.out.println("Enter complex j coefficient");
        complex[1] = ReadNum(s);
        if(mode == 2){
            System.out.println("Enter complex k coefficient");
            complex[2] = ReadNum(s);
        }
        ClearScr();
        System.out.println("You entered the complex is ");
        Adder.PrtComplex(complex);
        return complex;
    }

    private static float [] PolyReader(Scanner s) throws IOException,InterruptedException{
        List<Float> poly = new ArrayList<Float>();
        int i = 0;
        float tmp;
        while(true){
            System.out.println("Please enter " + i++ + " power's coefficient\nq to exit");
            tmp = ReadNum(s);
            if(tmp != 0x80000000){
                poly.add(tmp);
            }else{
                break;
            }
        }
        ClearScr();
        System.out.println("You entered the polynomial is ");
        float[] P = new float[poly.size()];
        int j = 0;
        for (float f : poly) {
            P[j++] = f;
        }
        Adder.PrtPoly(P);
        return P;
    }

    private static float [] MetrixReader(Scanner s,int mode) throws IOException,InterruptedException{
        float metrix[] = new float [9];
        float tmp;
        Adder.PrtMetrix(metrix);
        for(int i = 0;i < 9; i++){
            System.out.println("Please enter " + (i/3 + 1) + "x" + (i%3 + 1) + " item");
            if((tmp = ReadNum(s)) != -1){
                ClearScr();
                metrix[i] = tmp;
                Adder.PrtMetrix(metrix);
            }else{
                System.out.println("escape : metrix error");
                metrix = null;
                break;
            }
        }
        return metrix;
    }
    private static float ReadNum(Scanner s){
        float out = 0x80000000;
        String tmp;
        while(s.hasNext()){
            try {
                out = s.nextFloat();
                s.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number");
                tmp = s.next();
                s.nextLine();
                if(tmp.length() == 1 && tmp.charAt(0) == 'q'){
                    out = 0x80000000;
                    break;
                }
                
            }
        }
        return out;
    }
    private static String ReadStr(Scanner s){
        String str = "";
        while(s.hasNext()){
            str = s.nextLine();
            if(str == ""){
                System.out.println("Please enter a string");
                continue;
            }else{
                break;
            }
        }
        return str;
    }
    private static void ClearScr() throws IOException, InterruptedException{
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
}
