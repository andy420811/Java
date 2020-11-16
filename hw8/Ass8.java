import java.util.Scanner;
public class Ass8 {
    public static void main(String[] args) {
        int size;
        float scale;
        Sheet sheet;
        System.out.println("Please enter the size and scale of the sheet");
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                size = s.nextInt();
                scale = s.nextInt();
                break;
                
            }catch(Exception e){
                System.out.println("Please enter the number");
                s.next();
            }
        }
        sheet = new Sheet(size,scale);
        int mode;
        while(true){
            try{
                System.out.println("Enter mode\n0:9 x 9 Sheet\n1:n x n Sheet\n2:n*scale x n Sheet\n3:dimond Sheet");
                mode = s.nextInt();
                switch(mode){
                    case 0:
                        
                    
                }
                sheet.PrintIntSheet();

            }catch(IllegalStateException e){
                System.out.println("Exit");
                break;
            }catch(Exception e){
                System.out.println("Please enter the number");
                s.next();
            }
        }
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
        for(int i = 0;i < 9;i++){
            for(int j = 0;j < 9;j++){
                numbers[i][j] = new Number((float)(i+1),(float)(i+1));
            }
        }
    }
    public Sheet(int size){
        Size = size; Scale = 1;
        numbers = new Number[size][size];
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                numbers[i][j] = new Number((float)(i+1),(float)(i+1));
            }
        }
    }
    public Sheet(int size,Float scale){
        numbers = new Number[size][size];
        Size = size; Scale = scale;
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                numbers[i][j] = new Number((i+1)*scale,(float)(i+1));
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