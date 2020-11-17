import java.io.IOException;
import java.util.Scanner;
public class Ass8 {
    public static void main(String[] args) throws InterruptedException {
        int size;
        float scale;
        Sheet sheet;
      /*  System.out.println("Please enter the size of the sheet");
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                size = s.nextInt();
                break;
                
            }catch(Exception e){
                System.out.println("Please enter the number");
                s.next();
            }
        }
        */
        int mode;
        sheet = new Sheet();
        int prttype;
        while(true){
            try{
                Scanner s = new Scanner(System.in);
                System.out.println( "Enter mode\n0:9 x 9 Sheet\n1:n x n Sheet\n2:n*scale x n Sheet\n3:dimond Sheet\n"+
                                    "4:separate\n5:inverse\n6:circle\n7:list\n8:Clear Screen\nCtrl+z to Exit");
                mode = (int)ReadNum(s);
                if(mode > 7){
                    ClearScr();
                    System.out.println("Enter 1~7"); 
                    Thread.sleep(1000); 
                    continue;
                }
                switch(mode){
                    case 0:
                        sheet = new Sheet();
                        sheet.PrintIntSheet();
                        break;
                    case 2:
                        System.out.println("Enter the size");
                        size = (int)ReadNum(s);
                        System.out.println("Enter the scale");
                        scale = ReadNum(s);
                        sheet = new Sheet(size,scale);
                        sheet.PrintSheet();
                        break;
                    case 1:
                        System.out.println("Enter the size");
                        size = (int)ReadNum(s);
                        sheet = new Sheet(size);
                        sheet.PrintIntSheet();
                        break;
                    case 3:
                        System.out.println("Enter 0 for integer print or 1 for float");
                        prttype = (int)ReadNum(s);
                        PrtDimond(sheet,prttype);
                        break;
                    case 4:
                        System.out.println("Enter 0 for integer print or 1 for float");
                        prttype = (int)ReadNum(s);
                        PrtSparteSheet(sheet,prttype);
                        break;
                    case 5:
                        System.out.println("Enter 0 for integer print or 1 for float");
                        prttype = (int)ReadNum(s);
                        PrtInverseSheet(sheet,prttype);
                        break;
                    case 6:
                        System.out.println("Enter 0 for integer print or 1 for float");
                        prttype = (int)ReadNum(s);
                        PrtCircleSheet(sheet,prttype);
                        break;
                    case 7:
                        System.out.println("Enter 0 for integer print or 1 for float");
                        prttype = (int)ReadNum(s);
                        PrtListSheet(sheet,prttype);
                        break;
                }
            }catch(IllegalStateException e){
                System.out.println("Exit");
                break;
            }catch(Exception e){
                System.out.println("Please enter an integer");
            }
        }
    }
    private static void PrtSparteSheet(Sheet sheet,int prttype){
        int Size = sheet.Size;
        for(int i = 0;i < Size*Size;i++){
            if (i % Size == Size/3||
                i % Size == Size/3*2) System.out.print("||");
            if ((i / Size == Size/3 && i % Size == 0)||
                (i / Size == Size/3*2 && i % Size == 0)){
                for(int j = 0;j < Size; j++) System.out.print("================");
                    System.out.println();
                }
            sheet.PrintSheetNum(i/Size, i%Size , prttype);
            if (i%Size == Size-1) System.out.println();
        }
    }
    private static void PrtInverseSheet(Sheet sheet,int prttype){
        int Size = sheet.Size;
        for (int i = Size*Size - 1;i >= 0; i--){
            if (i%Size == Size - 1) System.out.println();
            sheet.PrintSheetNum(i/Size, i%Size, prttype);
        }
    }
    private static void PrtCircleSheet(Sheet sheet,int prttype) {
        double radius = (double)sheet.Size / 2;
        double i = radius;
        double width;
        int j,k;
        for (;i > -radius;i--){
            width = i == 0?radius:Math.floor(Math.sqrt( (radius * radius) - (i * i) ));
            for(j = 0; j < radius - width; j++){
                System.out.print("\t\t");
            }
            for(k = 0; k < width*2; k++){
                sheet.PrintSheetNum((int)(-i+radius),(int)j + k, prttype);
            }
            System.out.println("\n\n\n\n");
        }
        
    }
    private static void PrtListSheet(Sheet sheet,int prttype) {
        int Size = sheet.Size; 
        for (int i = 0; i < Size*Size; i++){
            sheet.PrintSheetNum(i/Size, i%Size, prttype);
            System.out.print("\n");
        }
    }
    private static void PrtDimond(Sheet sheet,int prttype){
        int width = sheet.Size;
        int i,j,k;
        int spare = (width - 1) / 2;
        for(i = 0;i < spare; i++){
            for(j = 0;j < spare - i; j++){
                System.out.print("\t\t");
            }
            for(k = 0;k < width - 2*j;k++){
                sheet.PrintSheetNum(i, spare - i  + k , prttype);
            }
            System.out.println();
        }
        for(j = 0;j < width; j++){
            sheet.PrintSheetNum(i, j , prttype);
        }
        System.out.println();
        for(i++;i < width; i++){
            for(j = 0;j < i - spare; j++){
                System.out.print("\t\t");
            }
            for(k = 0;k < width - 2*j;k++){
                sheet.PrintSheetNum(i, i - spare + k , prttype);
            }
            System.out.println();
        }
    }
    private static float ReadNum(Scanner s){
        float out = 0;
        while(s.hasNext()){
            try {
                out = s.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number");
                s.next();
            }
        }
        return out;
    }
    private static void ClearScr() throws IOException, InterruptedException{
        new ProcessBuilder("cmd","/c","cls");
    }
}
class Sheet{
    int Size;
    float Scale;
    Number [][] numbers;
    public Sheet(){
        Size = 9;
        Scale = 1;
        numbers = new Number[9][9];
        for(int i = 0;i < Size;i++){
            for(int j = 0;j < Size;j++){
                numbers[i][j] = new Number((float)(i+1),(float)(j+1));
            }
        }
        /*                                                                            do-while loop method(to create the sheet)
        int i = 0;
        do{
            numbers[i/Size][i%Size] = new  Number((float)(i+1),(float)(i+1));
        }while(i == Size*Size);
        */

        /*                                                                            one-dimentional for method(in order to create the sheet)
        for(int i = 0;i < Size * Size; i++){
            numbers[i/Size][i%Size] = new Number((float)(i+1),(float)(i+1));
        }
        */
    }
    public Sheet(int size){
        Size = size; Scale = 1;
        numbers = new Number[size][size];
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                numbers[i][j] = new Number((float)(i+1),(float)(j+1));
            }
        }
    }
    public Sheet(int size,Float scale){
        numbers = new Number[size][size];
        Size = size; Scale = scale;
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                numbers[i][j] = new Number((i+1)*scale,(float)(j+1));
            }
        }
    }
    public void PrintSheet(){
        for(int i = 0;i < Size; i++){
            for(int j = 0; j < Size; j++){
                System.out.printf("%.2fX%.2f=%.2f\t",numbers[i][j].Multiplier,numbers[i][j].Multiplicant,numbers[i][j].Quotient);
            }
            System.out.println();
        }
    }
    public void PrintIntSheet(){
        for(int i = 0;i < Size; i++){
            for(int j = 0; j < Size; j++){
                System.out.printf("%3dX%3d=%3d\t",(int)numbers[i][j].Multiplier,(int)numbers[i][j].Multiplicant,(int)numbers[i][j].Quotient);
            }
            System.out.println();
        }
    }
    /**
     * 
     * @param i    
     * @param j    
     * @param mode enter 1 to print integer number;
     *             enter 2 to print float number
     */
    public void PrintSheetNum(int i,int j,int mode){
        if(mode == 1){
            System.out.printf("%.2fX%.2f=%.2f\t",numbers[i][j].Multiplier,numbers[i][j].Multiplicant,numbers[i][j].Quotient);
        }else if(mode == 0){
            System.out.printf("%3dX%3d=%3d\t",(int)numbers[i][j].Multiplier,(int)numbers[i][j].Multiplicant,(int)numbers[i][j].Quotient);
        }
    }
}

class Number{
    float Multiplier;
    float Multiplicant;
    float Quotient;
    public Number(){

    }
    public Number(Float multiplier,Float multiplicant){
        Multiplier = multiplier;
        Multiplicant = multiplicant;
        Quotient = multiplier * multiplicant;
    }
}