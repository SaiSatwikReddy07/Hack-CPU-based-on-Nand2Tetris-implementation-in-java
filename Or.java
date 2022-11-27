
public class Or {
         int out;
         public int or(int a, int b) {
        	 Nand NAND = new Nand();
        	 out = NAND.nand(NAND.nand(a, a), NAND.nand(b, b));
         return(out);
         }
      /**    public static void main(String[] args) {
     	Or obj = new Or();
     	int a = 0;
     	int b = 0;
     	int out;
     	out= obj.or(a,b);
     	System.out.print(out);
     		  
     	   
     }**/
}


