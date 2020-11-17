class Ex15_8_1 {
    
	/** 
	 * @param args[]
	 */
	public static void main(String args[]) {
         String s = "abcd";
        
         StringBuffer str = new StringBuffer(s);
	 System.out.println("boolean = " + str.append(true)); 
	 System.out.println("char = " + str.append('x'));
	 System.out.println("double = " + str.append(111.1d));
	 System.out.println("int = " + str.append(222));
	 System.out.println("String = " + str.append("xyz"));
 
   }
 }









 



