import java.util.Scanner;
public class Ass8 {
    public static void main(String[] args) {
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
        while(true){
            try{
                Scanner s = new Scanner(System.in);
                System.out.println("Enter mode\n0:9 x 9 Sheet\n1:n x n Sheet\n2:n*scale x n Sheet\n3:dimond Sheet\nCtrl+z to Exit");
                mode = (int)ReadNum(s);
                if(mode > 3){System.out.println("Enter 1~3"); continue;}
                switch(mode){
                    case 0:
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
                        PrtDimond(sheet);
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
    private static void PrtDimond(Sheet sheet){
        int width = sheet.Size;
        int i,j,k;
        int spare = (width - 1) / 2;
        for(i = 0;i < spare; i++){
            for(j = 0;j < spare - i; j++){
                System.out.print("\t\t");
            }
            for(k = 0;k < width - 2*j;k++){
                sheet.PrintSheetNum(i, spare - i  + k);
            }
            System.out.println();
        }
        for(j = 0;j < width; j++){
            sheet.PrintSheetNum(i, j);
        }
        System.out.println();
        for(i++;i < width; i++){
            for(j = 0;j < i - spare; j++){
                System.out.print("\t\t");
            }
            for(k = 0;k < width - 2*j;k++){
                sheet.PrintSheetNum(i, i - spare + k);
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
                System.out.printf("%dX%d=%d\t",(int)numbers[i][j].Multiplier,(int)numbers[i][j].Multiplicant,(int)numbers[i][j].Quotient);
            }
            System.out.println();
        }
    }
    public void PrintSheetNum(int i,int j){
        System.out.printf("%.2fX%.2f=%.2f\t",numbers[i][j].Multiplier,numbers[i][j].Multiplicant,numbers[i][j].Quotient);
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