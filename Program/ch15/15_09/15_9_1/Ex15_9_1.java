 class sample {
     int a, b, c;
     sample(int x, int y, int z) {
         a = x; b= y; c = z;
     }
 } 

 class Ex15_9_1 {
    public static void main(String args[]) {
       sample samp1 = new sample(1, 2, 3);
       sample samp2 = new sample(1, 2, 3);
       System.out.println("samp1==samp2 : " + (samp1==samp2)); 
       System.out.println("samp1.equals(samp2) : " + samp1.equals(samp2)); 

       sample samp3 = samp1;
       System.out.println("samp1==samp3 : " + (samp1==samp3)); 
       System.out.println("samp1.equals(samp3) : " + samp1.equals(samp3)); 
   }
 }









 



