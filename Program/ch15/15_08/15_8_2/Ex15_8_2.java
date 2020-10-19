class Ex15_8_2 {
    public static void main(String args[]) {
         String s = "abcd";
        
         StringBuffer str = new StringBuffer(s);
	 System.out.println("boolean = " + str.insert(2, true)); 
	 System.out.println("char = " + str.insert(2, 'x'));
	 System.out.println("double = " + str.insert(2, 111.1d));
	 System.out.println("int = " + str.insert(2, 222));
	 System.out.println("String = " + str.insert(2, "xyz"));
 
   }
 }









 



